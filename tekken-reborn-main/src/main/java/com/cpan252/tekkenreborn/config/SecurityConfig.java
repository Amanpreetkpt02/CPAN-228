package com.cpan252.tekkenreborn.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import com.cpan252.tekkenreborn.model.User;
import com.cpan252.tekkenreborn.repository.UserRepository;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.boot.autoconfigure.security.servlet.PathRequest.toH2Console;
@Configuration
public class SecurityConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService(UserRepository userRepository) {
        return username -> {
            User user = userRepository.findByUsername(username);
            if (user != null) {
                return user;
            }
            throw new UsernameNotFoundException(username);
        };
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws 
    Exception {
        return http
                .authorizeHttpRequests()
                .requestMatchers(toH2Console()).permitAll()
                .requestMatchers("/design", "/fighterlist")
                .hasRole("USER")
                .anyRequest().permitAll()

                .and()
                .formLogin(login -> login
                        .loginPage("/login"))
                .logout(logout -> logout
                        .logoutSuccessUrl("/"))
                .csrf(csrf -> csrf
                      .ignoringRequestMatchers(toH2Console()))
                .headers(headers -> headers
                        .frameOptions()
                        .sameOrigin())
                .build();
}
}       




package com.cpan252.tekkenreborn.repository.impl;

import java.util.Optional;


import org.springframework.jdbc.core.JdbcTemplate;

import com.cpan252.tekkenreborn.model.Fighter;
import com.cpan252.tekkenreborn.repository.FighterRepository;

public class JdbcFighterRepository implements FighterRepository {
    private JdbcTemplate jdbcTemplate;

  
    public JdbcFighterRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public Iterable<Fighter> findAll() {
        
        return null;
    }

    @Override
    public Optional<Fighter> findByid(Long id) {
       
        return Optional.empty();
    }

    @Override
    public int save(Fighter fighter) {
      
        return 0;
    }
    
}

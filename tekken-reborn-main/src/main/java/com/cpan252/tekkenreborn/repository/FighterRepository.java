package com.cpan252.tekkenreborn.repository;

import org.springframework.data.repository.CrudRepository;
import java.time.LocalDate;
import java.util.List;
import com.cpan252.tekkenreborn.model.Fighter;
import com.cpan252.tekkenreborn.model.Fighter.Anime;
import org.springframework.stereotype.Repository;
@Repository
public interface FighterRepository extends CrudRepository<Fighter, Long> {
    List<Fighter> findByAnimeFrom(Anime anime);

    List<Fighter> findByNameStartsWithAndCreatedAtBetween(String name, LocalDate startDate, LocalDate endDate);  
}

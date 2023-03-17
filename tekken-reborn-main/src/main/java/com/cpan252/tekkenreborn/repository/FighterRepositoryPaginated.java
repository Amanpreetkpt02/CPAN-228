package com.cpan252.tekkenreborn.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.cpan252.tekkenreborn.model.Fighter;
@Repository
public interface FighterRepositoryPaginated extends 
 PagingAndSortingRepository<Fighter, Long> {
}

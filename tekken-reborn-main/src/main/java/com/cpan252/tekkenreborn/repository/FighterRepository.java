package com.cpan252.tekkenreborn.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.cpan252.tekkenreborn.model.Fighter;


@Repository
public interface FighterRepository {

Iterable<Fighter> findAll();
Optional <Fighter> findByid(Long id);
static void save(Fighter fighter) {
   
}
}

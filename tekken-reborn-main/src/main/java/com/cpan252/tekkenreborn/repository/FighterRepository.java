package com.cpan252.tekkenreborn.repository;

import java.util.Optional;

import com.cpan252.tekkenreborn.model.Fighter;



public interface FighterRepository {

Iterable<Fighter> findAll();
Optional <Fighter> findByid(Long id);
int save(Fighter fighter);
}
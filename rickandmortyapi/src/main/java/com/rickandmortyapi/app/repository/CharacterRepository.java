package com.rickandmortyapi.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rickandmortyapi.app.model.CharacterModel;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterModel, Long> {
}

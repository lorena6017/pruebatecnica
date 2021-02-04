package com.rickandmortyapi.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rickandmortyapi.app.model.EpisodeModel;

@Repository
public interface EpisodeRepository extends JpaRepository<EpisodeModel, Long> {
}

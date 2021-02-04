package com.rickandmortyapi.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rickandmortyapi.app.model.LocationModel;

@Repository
public interface LocationRepository extends JpaRepository<LocationModel, Long> {
}

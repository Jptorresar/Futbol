package com.juantorres.futbol.repo;

import com.juantorres.futbol.model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidoRepo extends JpaRepository<Partido, String> {
}

package com.juantorres.futbol.repo;

import com.juantorres.futbol.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepo extends JpaRepository<Jugador,String> {
}

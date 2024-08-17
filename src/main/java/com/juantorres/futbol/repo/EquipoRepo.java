package com.juantorres.futbol.repo;

import com.juantorres.futbol.model.Equipo;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Registered
public interface EquipoRepo extends JpaRepository<Equipo,String> {

}

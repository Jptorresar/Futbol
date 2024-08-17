package com.juantorres.futbol.Service;

import com.juantorres.futbol.model.Equipo;
import com.juantorres.futbol.repo.EquipoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoService {

    @Autowired
    private EquipoRepo equipoRepo;

    public List<Equipo> getAllEquipos() {
        return equipoRepo.findAll();
    }

    public Equipo guardarEquipo(Equipo equipo) {
        return equipoRepo.save(equipo);
    }

}

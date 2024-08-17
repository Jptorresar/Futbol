package com.juantorres.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Partido {

    private String codigo;
    private Date fecha;
    private List<Jugador> jugadores;
    private Equipo local;
    private Equipo visitante;
}

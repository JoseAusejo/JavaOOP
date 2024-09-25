package com.antonio.screenmatch.calculos;

import com.antonio.screenmatch.modelos.Pelicula;
import com.antonio.screenmatch.modelos.Series;
import com.antonio.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye (Titulo titulo){
        this.tiempoTotal +=titulo.getDuracionEnMinutos();

    }


}

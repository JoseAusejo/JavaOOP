package com.antonio.screenmatch.modelos;

public class Series extends Titulo {
    int temporadas;
    int episodioPorTemporada;
    int minutosPorEpisodio;

    public Series() {
    }

    public int getDuracionEnMinutos() {
        return this.temporadas * this.episodioPorTemporada * this.minutosPorEpisodio;
    }

    public int getTemporadas() {
        return this.temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodioPorTemporada() {
        return this.episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return this.minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}


package com.antonio.screenmatch.modelos;

public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDelasEvaluaciones;

    public Titulo() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getFechaDeLanzamiento() {
        return this.fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return this.duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return this.incluidoEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalDelasEvaluaciones() {
        return this.totalDelasEvaluaciones;
    }

    public void muestraFichaTecnica() {
        System.out.println("El nombre de la película es: " + this.nombre);
        System.out.println("Su fecha de lanzamiento es: " + this.fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + this.getDuracionEnMinutos());
    }

    public void evalua(double nota) {
        this.sumaDeLasEvaluaciones += nota;
        ++this.totalDelasEvaluaciones;
    }

    public double calculaMedia() {
        return this.sumaDeLasEvaluaciones / (double)this.totalDelasEvaluaciones;
    }
}
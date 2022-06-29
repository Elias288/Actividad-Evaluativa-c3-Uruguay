package com.sofka.ActividadEvaluativa.Ejercicio4;

public class Alumno extends Persona {
    int calificaciones;

    public Alumno(String nombre, String sexo, int edad, int calificaciones) {
        super(nombre, sexo, edad);
        this.calificaciones = calificaciones;
    }

    public boolean isDisponible() {
        double random = Math.random();
        return random < 0.5 ? true : false;
    }
}

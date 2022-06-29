package com.sofka.ActividadEvaluativa.Ejercicio4;

public class Profesor extends Persona {
    String materia;

    public Profesor(String nombre, String sexo, int edad, String materia) {
        super(nombre, sexo, edad);
        this.materia = materia;
    }

    public boolean isDisponible() {
        double random = Math.random();
        return random > 0.20 ? true : false;
    }
}

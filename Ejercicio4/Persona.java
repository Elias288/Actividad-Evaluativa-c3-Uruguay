package com.sofka.ActividadEvaluativa.Ejercicio4;

public abstract class Persona {
    String nombre, sexo;
    int edad;

    public Persona(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public boolean isDisponible() {
        return true;
    }
}

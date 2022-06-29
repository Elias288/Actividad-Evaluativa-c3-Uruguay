package com.sofka.ActividadEvaluativa.Ejercicio3;

public class Ejecutable {
    public static void main(String[] args) {
        Bonificaciones b = new Bonificaciones(100, 3, "Sistemas");
        b.CalcularPagos();
        System.out.println(b.sueldo);
    }
}


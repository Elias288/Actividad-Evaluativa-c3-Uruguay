package com.sofka.ActividadEvaluativa.Ejercicio2;

public class MillasAKilometros {
    final double UNAMILLAENKILOMETROS=1.6093;

    double millas, kilometros;

    public MillasAKilometros(double m){
        this.millas = m;
        this.kilometros = 0;
    }

    public void calcular(){
        this.kilometros = this.millas * UNAMILLAENKILOMETROS;
        System.out.println(this.millas + " millas son: " + String.format("%.2f", this.kilometros) + " kilometros");
    }
}

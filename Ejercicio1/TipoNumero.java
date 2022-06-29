package com.sofka.ActividadEvaluativa.Ejercicio1;

public class TipoNumero {
    int n1;

    public TipoNumero(int n1) {
        this.n1 = n1;
    }

    public void isPar() {
        int res = this.n1 % 2;
        System.out.println(res == 0 ? "es par" : "es impar");
    }
}

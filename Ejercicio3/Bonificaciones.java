package com.sofka.ActividadEvaluativa.Ejercicio3;

public class Bonificaciones {
    String AreaDeTrabajo;
    int sueldo, cantHijos;

    public Bonificaciones(int sueldo, int cantHijos, String At) {
        this.AreaDeTrabajo = At;
        this.cantHijos = cantHijos;
        this.sueldo = sueldo;
    }

    public void CalcularPagos() {
        double bonificacion = this.AreaDeTrabajo == "Sistemas" ? 0.25 : this.AreaDeTrabajo == "Contabilidad" ? 0.20 : 0.10;
        this.sueldo += this.sueldo * bonificacion;
        if (cantHijos >= 2) {
            this.sueldo += this.cantHijos * 150;
        }
    }
}

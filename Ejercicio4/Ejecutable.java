package com.sofka.ActividadEvaluativa.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Ejecutable {
    public static void main(String[] args) {
        Profesor p1 = new Profesor("Eddie", "varon", 25, "Matematica");
        Profesor p2 = new Profesor("Martin", "varon", 25, "Filosofia");
        Profesor p3 = new Profesor("Eduardo", "varon", 25, "Fisica");

        Alumno a1 = new Alumno("Elias", "varon", 22, 78);
        Alumno a2 = new Alumno("Alberto", "varon", 22, 80);
        Alumno a3 = new Alumno("Carla", "mujer", 22, 93);
        Alumno a4 = new Alumno("Maxi", "varon", 22, 23);
        Alumno a5 = new Alumno("Vanessa", "mujer", 22, 65);
        Alumno a6 = new Alumno("Cristian", "varon", 22, 90);
        Alumno a7 = new Alumno("Jorge", "varon", 22, 96);

        Alumno[] alumnos = new Alumno[5];
        alumnos[0]=a1;
        alumnos[1]=a2;
        alumnos[2]=a3;
        alumnos[3]=a4;
        alumnos[4]=a5;

        Aula aula1 = new Aula(1, 5, "Matematica", alumnos, p1);

        System.out.println(aula1.cantAlumnos());
        aula1.toString();
    }
}


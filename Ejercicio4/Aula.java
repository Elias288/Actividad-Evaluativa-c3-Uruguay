package com.sofka.ActividadEvaluativa.Ejercicio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aula {
    int id, numMax;
    String materia;
    Alumno[] alumnos;
    Profesor p;

    public Aula(int id, int numMax, String materia, Alumno[] alumnos, Profesor p) {
        this.id = id;
        this.numMax = numMax;
        this.materia = materia;
        this.alumnos = alumnos;
        this.p = p;
    }

    public boolean hasClase() {
        // HAY PROFESOR DISPONIBLE
        boolean profesor = this.p.isDisponible();
        System.out.println("profesor " + profesor);
        // LA MATERIA DEL PROFESOR CORRESOPONDER CON LA DEL AULA
        boolean materia = this.materia == this.p.materia ? true : false;
        System.out.println("materia " + materia);
        // LA CANTIDAD DE ALUMNOS TIENE QUE SER MAYOR AL  50%
        int cantAlumnos = 0;
        for (Alumno a : this.alumnos) {
            if (a.isDisponible()) {
                cantAlumnos++;
            }
        }
        boolean alumnos = cantAlumnos >= this.alumnos.length / 2 ? true : false;
        System.out.println("alumnos " + alumnos);
        return profesor && materia && alumnos;
    }

    public String cantAlumnos(){
        String res = "";
        if(this.hasClase()){ // SI HAY CLASSE
            List<Alumno> AlH = new ArrayList<>();
            List<Alumno> AlM = new ArrayList<>();
            // LISTA LOS USUARIOS
            for(Alumno a : this.alumnos){
                if(a.calificaciones>=70){ // SI ESTAN APROBADOS
                   if(a.sexo.equals("varon")) {
                       AlH.add(a);
                   } else {
                       AlM.add(a);
                   }
                }
            }
        res = "Cantidad de alumnos aprobados es: " + AlH.size() + " y de alumnas es: " + AlM.size();

        }else{
            res = "No hubo clase";
        }
        return res;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "id=" + id +
                ", numMax=" + numMax +
                ", materia='" + materia + '\'' +
                ", alumnos=" + Arrays.toString(alumnos) +
                ", p=" + p +
                '}';
    }
}

package org.example.Practico1;

public class Estudiante {

    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion = 0;

    public Estudiante(String nombre, String apellido, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
    }

    public void mostrarInfo(){

        System.out.println(this.apellido + " " + this.nombre + " " + this.curso + " " + calificacion );

    }

    public void subirCalificacion(double incremento){
        double total = calificacion + incremento;

        if (total > 10){
            calificacion = 10;
        } else {
            calificacion = total;
        }


    }

    public void bajarCalificaciones (double decremento){
        double total = calificacion - decremento;

        if (total < 0){

            calificacion = 0;
        } else {
            calificacion = total;
        }

    }


}

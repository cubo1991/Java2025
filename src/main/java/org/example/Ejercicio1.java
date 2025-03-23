package org.example;

public class Ejercicio1 {

    public static void ejercicio1() {
        Estudiante estudiante = new Estudiante("David","Lopez", "Primero2");

        estudiante.mostrarInfo();;
        estudiante.subirCalificacion(5);
        estudiante.mostrarInfo();
        estudiante.subirCalificacion(10);
        estudiante.mostrarInfo();
        estudiante.bajarCalificaciones(3);
        estudiante.mostrarInfo();
        estudiante.bajarCalificaciones(100);
        estudiante.mostrarInfo();
    }
}

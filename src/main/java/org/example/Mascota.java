package org.example;

public class Mascota {
    private String nombre;
    private int edad;

    public Mascota(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    private String especie;

    public void mostrarInfo(){
        System.out.println(nombre + " " + especie + " " + edad);
    }

    public  void cumplirAnios(){

        edad += 1;

    }
}

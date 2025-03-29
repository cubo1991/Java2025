package org.example.Practico1;

public class NaveEspacial {
    private String nombre;
    private int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar (){
        if(combustible < 11){
            System.out.println("No puede despegar con menos de 10 unidades");
            return;
        }
        this.combustible -= 10;
    }

    public void avanzar (int distancia){
        if(combustible < distancia){
            System.out.println("No se puede avanzar esa distancia por falta de combustible");
            return;
        }
        this.combustible -= distancia;

    }

    public void recargarCombustible (int cantidad){
        if((combustible + cantidad) > 100){
            System.out.println("No se puede recargar combustible más allá del limite");
              }
        this.combustible += cantidad;
    }
    public void mostrarEstado(){
        System.out.println("La nave "+ this.nombre + " "+ "tiene "+ this.combustible + " unidades de combustible");
    }
}

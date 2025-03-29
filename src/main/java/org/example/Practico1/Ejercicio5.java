package org.example.Practico1;




public class Ejercicio5 {
    public static void ejercicio5() {
        NaveEspacial nave = new NaveEspacial("Enterprise", 50);

        nave.despegar();
        nave.avanzar(60);
        nave.recargarCombustible(40);
        nave.avanzar(60);
        nave.mostrarEstado();

    }
}

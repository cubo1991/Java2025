package org.example.Practico1;




public class Ejercicio4 {
    public static void ejercicio4() {


        Gallina gallina1 = new Gallina(2,30,5);
        Gallina gallina2 = new Gallina(1,15,1);

        gallina1.ponerHuevo(3);
        gallina1.envejecer(4);
        gallina2.ponerHuevo(2);
        gallina2.envejecer(3);

        gallina1.mostrarEstado();
        System.out.println("----------------------");
        gallina2.mostrarEstado();

    }
}

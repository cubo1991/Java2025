package org.example;

public class Ejercicio3 {
    public static void ejercicio3() {

    Libro libro = new Libro("Las horas de David", "David Lopez",1991);

        System.out.println(libro.getAutor());
        System.out.println(libro.getTitulo());
        System.out.println("Año preestablecido:" + " " + libro.getAnoPublicacion());

try{
            libro.setAnoPublicacion(2300);
            System.out.println(libro.getAnoPublicacion());
            libro.setAnoPublicacion(1890);
            System.out.println(libro.getAnoPublicacion());
            libro.setAnoPublicacion(2015);
            System.out.println(libro.getAnoPublicacion());


}catch (Exception e){
    System.out.println(e.getMessage());
}




    }
}

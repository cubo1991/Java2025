package org.example;

import java.time.LocalDate;



public class Libro {
   private int anoActual = LocalDate.now().getYear();

    private String titulo;
    private String autor;
    private int anoPublicacion;

    public Libro(String titulo, String autor, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        if (anoPublicacion > anoActual) {
            System.out.println("Error: año inválido (año posterior al presente año " + anoActual + ").");
            return; // No cambia el valor
        } else if (anoPublicacion < 1900) {
            System.out.println("Error: año inválido (año anterior a 1900).");
            return; // No cambia el valor
        }
        this.anoPublicacion = anoPublicacion; // Solo se asigna si es válido
    }
}

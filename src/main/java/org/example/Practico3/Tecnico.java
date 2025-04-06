package org.example.Practico3;

public class Tecnico {
    private String name;
    private int id;
    private String especialidad;

    public Tecnico(String nome, int id, String especialidad) {
        this.name = nome;
        this.id = id;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "nome='" + name + '\'' +
                ", id=" + id +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}

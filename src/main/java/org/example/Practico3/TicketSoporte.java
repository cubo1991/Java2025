package org.example.Practico3;

import java.util.Date;

public class TicketSoporte {
    private int id;
    private String descripcion;
    private Estado estado;
    private Date fechaCreacion;
    private Usuario usuario;
    private Tecnico tecnico;


    @Override
    public String toString() {
        return "TicketSoporte{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                ", fechaCreacion=" + fechaCreacion +
                ", usuario=" + (usuario != null ? usuario.getNombre() : "null") +
                ", tecnico=" + (tecnico != null ? tecnico.getName() : "null") +
                '}';
    }

    public TicketSoporte(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
       estado = Estado.ABIERTO;
        this.fechaCreacion = new Date();
        this.usuario = null;
        this.tecnico = null;


        this.mostrarDetalle();

    }
    public TicketSoporte(int id, String descripcion, Usuario usuario) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = Estado.ABIERTO;
        this.fechaCreacion = new Date();
        this.usuario = usuario;
        this.tecnico = null;


        this.mostrarDetalle();

    }

    public void cerrarTicket(){
        this.estado = Estado.CERRADO;
        System.out.println("El ticket se encuentra " + estado);
    }

    public void mostrarDetalle() {
        System.out.println(this.toString());
    }

    public void asignarTecnico (Tecnico tecnico){
        this.tecnico = tecnico;
    }



}

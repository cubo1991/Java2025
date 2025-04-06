package org.example.Practico3;


import java.util.ArrayList;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private ArrayList<TicketSoporte> tickets;

    public String getNombre() {
        return nombre;
    }

    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.tickets = new ArrayList<>();
    }



    public void mostrarTickets (){
        System.out.println(this.tickets);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", tickets=" + tickets +
                '}';
    }

    public void setTickets(TicketSoporte ticket) {
    this.tickets.add(ticket);

    }

    public void getTickets (){
        System.out.println(this.tickets);
    }
}

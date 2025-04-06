package org.example.Practico3;

public class SistemaSoporte {

    public TicketSoporte crearTicket (int id, String descripcion){
        TicketSoporte ticket = new TicketSoporte(id, descripcion);
        return ticket;
    }
    public TicketSoporte crearTicket (int id, String descripcion, Usuario usuario){
        TicketSoporte ticket = new TicketSoporte(id, descripcion, usuario);
        System.out.println(ticket);
        usuario.setTickets(ticket);
        return ticket;
    }

    public void asignarTecnico (TicketSoporte ticket, Tecnico tecnico){
        ticket.asignarTecnico(tecnico);
        System.out.println(tecnico.getName());

    }

    public void mostrarTickets (Usuario usuario) {
     usuario.mostrarTickets();
    }
}

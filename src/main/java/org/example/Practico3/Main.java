package org.example.Practico3;

public class Main {
    public static void main(String[] args) {

        TicketSoporte ticket = new TicketSoporte(1,"Este es un nuevo ticket");
//        System.out.println("");
//        ticket.cerrarTicket();
//        System.out.println("");
//        ticket.mostrarDetalle();

        Usuario usuario = new Usuario(1,"David","asdadasasd");
        SistemaSoporte sistema = new SistemaSoporte();
        Tecnico tecnico = new Tecnico("David",6, "Plomeria");

        TicketSoporte nuevoTicket = sistema.crearTicket(4, "nuevo problema", usuario);
        sistema.asignarTecnico(nuevoTicket, tecnico);
        sistema.mostrarTickets(usuario);





    }
}

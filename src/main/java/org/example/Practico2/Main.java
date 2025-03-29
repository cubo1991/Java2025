package org.example.Practico2;

public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado(1,"David","Jefe",100000);
        Empleado empleado2 = new Empleado("David2","Empleado");
        Empleado empleado3 = new Empleado("David3","Empleado");

        empleado.aumentarSalario(0.5);
        System.out.println(empleado.getSalario());
        empleado2.aumentarSalario(250000);
        System.out.println(empleado2.getSalario());

        System.out.println(empleado);
        System.out.println(empleado2);

        System.out.println(Empleado.mostrarTotalEmpleados());



    }

}

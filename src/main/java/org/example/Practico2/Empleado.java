package org.example.Practico2;





public class Empleado {
    private Integer id;
    private String nombre;
    private String puesto;
    private double salario;

    private static Integer totalEmpleados = 0;

    public static Integer mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    public void aumentarSalario(int aumento) {
        this.salario += aumento;
    };

    public void aumentarSalario(double aumento) {
        this.salario = this.salario + (this.salario * aumento);
    };


    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.id =(int) Math.round(Math.random() * 10001);
        this.salario = 150000;
        totalEmpleados += 1;
    }
    public Empleado(Integer id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados += 1;
    }


    @Override
    public String toString() {
        return this.id + " " + this.nombre + " " + this.puesto + " " + this.salario;

    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

package org.example.Practico1;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }

    public void ponerHuevo(int huevo){
        if(huevo < 1 ){
            System.out.println("La cantidad no puede ser 0");
            return;
        }
        this.huevosPuestos = this.huevosPuestos + huevo;

    }

    public void envejecer (int años){
        if(años < 1 ){
            System.out.println("La cantidad no puede ser 0");
            return;
        }
        this.edad = this.edad + años;
    }

    public void mostrarEstado(){
        System.out.printf("idGallina: %d, edad: %d años, huevosPuestos: %d%n", idGallina, edad, huevosPuestos);

    }

}

package com.mycompany.mainordenador;

public class Ordenador {

    private int ram;
    private static double descuento=12; // al ser "static", el atributo "descuento" será el mismo para todos los objetos.

    // Métodos set y get para la RAM:
    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public static double metodoDescuento() {
        return descuento;
    }

}

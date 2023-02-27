package com.mycompany.mainordenador;

public class MainOrdenador {

    public static void main(String[] args) {

        Ordenador equipo1 = new Ordenador();

        equipo1.setRam(16);

        System.out.println("RAM: " + equipo1.getRam());

        System.out.println("Descuento: " + Ordenador.metodoDescuento() + "%");

    }
}

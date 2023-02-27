package com.mycompany.clasemoto;

public class Moto {

    String color = "Gris";
    int fabricacion = 2009;
    String marca = "Honda";

    // Método color:
    public void muestraColor() {
        System.out.println("Color: " + color);
    }

    // Método fabricación:
    public void muestraFabricacion() {
        System.out.println("Año de fabricación: " + fabricacion);
        if (fabricacion % 2 == 0) {
            System.out.println("El año de fabricación es par.");
        } else {
            System.out.println("El año de fabricación es impar.");
        }
    }

    // Método marca:
    public void muestraMarca() {
        System.out.println("Marca: " + marca);
    }

}

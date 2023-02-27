package com.mycompany.clasevehiculo;

public class Coche {

    double velocidad;

    // Método acelerar:
    public void acelerar(double cantidad) {

        velocidad = velocidad + cantidad;

    }

    // Método frenar:
    public void frenar(double cantidad) {

        velocidad = velocidad - cantidad;

    }

    // Método velocidad:
    public double obtenerVelocidad() { // Hay que establecer "double".
        return velocidad;

    }

}

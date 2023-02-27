package com.mycompany.esfera;

public class MetodosEsfera {

    // Atributos:
    double r;
    double volumen;
    double superficie;

    // Constructor 1:
    public MetodosEsfera(double r) {
        this.r = r;
    }

    // Constructor 2:
    public MetodosEsfera() {
        r = 1.0;
    }

    // Método para calcular volumen:
    public double volumen() {
        volumen = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        return volumen;
    }

    // Método para calcular superficie:
    public double superficie() {
        superficie = (4.0) * Math.PI * Math.pow(r, 2);
        return superficie;
    }

    // Método para imprimir:
    public void imprimir() {
        System.out.println("INFORMACIÓN DE LA ESFERA:");
        System.out.println("Radio: " + r);
        System.out.println("Volumen: " + volumen()); // Se llama al método, no a la variable.
        System.out.println("Superficie: " + superficie()); // Se llama al método, no a la variable.

    }

}

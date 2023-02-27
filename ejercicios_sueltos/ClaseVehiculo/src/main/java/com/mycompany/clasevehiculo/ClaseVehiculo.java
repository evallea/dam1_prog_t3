package com.mycompany.clasevehiculo;

public class ClaseVehiculo {

    public static void main(String[] args) {

        Coche ejemploCoche = new Coche(); // Se crea "ejemploCoche" con el contenido de la clase "Coche".
        ejemploCoche.acelerar(12); // Se establece acelerar en 12.
        ejemploCoche.frenar(5); // Se establece frenar en 5.

        // Se muestra el resultado de "obtenerVelocidad" de la clase "Coche" para los datos introducidos anteriormente en "ejemploCoche".
        System.out.println(ejemploCoche.obtenerVelocidad());

    }
}

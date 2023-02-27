package com.mycompany.aviones;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // crear un nuevo objeto Avion
        Avion avion1 = new Avion();

        // pedir por teclado los atributos del avión
        System.out.println("Introduce el modelo del avión:");
        avion1.setModelo(lectura.nextLine());
        System.out.println("Introduce el peso del avión (número de toneladas):");
        avion1.setPeso(lectura.nextDouble());
        System.out.println("Introduce el número de asientos del avión:");
        avion1.setAsientos(lectura.nextInt());
        System.out.println("Introduce la autonomía del avión (Km):");
        avion1.setAutonomia(lectura.nextDouble());
        System.out.println("Introduce la altura a la que se encuentra el avión (Km):");
        avion1.setAltura(lectura.nextDouble());
        System.out.println("Introduce la velocidad a la que se desplaza el avión (Km/h):");
        avion1.setVelocidad(lectura.nextDouble());

        // mostrar la categoría de peso del avión
        System.out.println("Categoría de peso del avión: " + avion1.categoriaPeso());

        // comprobar si puede llevar 200 pasajeros
        if (avion1.comprobarPasajeros(200)) {
            System.out.println("El avión puede llevar 200 pasajeros.");
        } else {
            System.out.println("El avión no puede llevar 200 pasajeros.");
        }

        // mostrar el número de repostajes para ir de París a Nueva York
        System.out.println("El número de repostajes necesarios para ir de París a Nueva York es: " + avion1.numeroRepostajes(5837));

        // comprobar si está en tierra
        if (avion1.enTierra(0)) {
            System.out.println("El avión está en tierra.");
        } else {
            System.out.println("El avión está volando a una altura de " + avion1.getAltura() + " Km.");
        }
        
        // comprobar cuánto tarda en recorrer los km indicados
        System.out.println("El tiempo estimado para recorrer los km indicados es de: " + avion1.tiempo(5837) + " hora(s)");
    }
}

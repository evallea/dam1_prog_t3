package com.mycompany.numeros;

import java.util.*;

public class PrincipalNumeros {

    public static void main(String[] args) {

        // Variables:
        int a;
        int b;
        String letra;
        Scanner lectura = new Scanner(System.in);

        // Mensajes de introducción de datos:
        System.out.println("Introduce un número:");
        a = lectura.nextInt();

        do {
            System.out.println("Introduce un número mayor que el anterior:");
            b = lectura.nextInt();
        } while (b <= a);
        
        // Menú de opciones:
        do {
            System.out.println("a) Mostrar todos los números entre a y b.");
            System.out.println("b) Mostrar todos los números pares entre a y b.");
            System.out.println("c) Mostrar los múltiplos de 100 que hay entre a y b.");
            System.out.println("d) Salir.");

            letra = lectura.next();
            letra = letra.toLowerCase();

            // Switch con llamadas a los métodos estáticos:
            switch (letra) {
                case "a":
                    System.out.println("Los números entre " + a + " y " + b + " son:");
                    MetodosEstaticos.numerosEntre(a, b);
                    break;
                case "b":
                    System.out.println("Los números pares entre " + a + " y " + b + " son:");
                    MetodosEstaticos.paresEntre(a, b);
                    break;
                case "c":
                    System.out.println("Los números múltiplos de 100 entre " + a + " y " + b + " son:");
                    MetodosEstaticos.multiplosEntre(a, b);
                    break;
                case "d":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Debes escribir la letra de la opción a la que desees acceder.");
                    break;
            }

        } while (!letra.equals("d")); // El menú se repetirá mientras no se seleccione la opción "d" (Salir).

    }
}

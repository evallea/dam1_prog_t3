package com.mycompany.complejo;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        // NÚMERO COMPLEJO 1:
        System.out.println("NÚMERO COMPLEJO 1 (introducido por teclado):");

        Complejo num1 = new Complejo(); // Se llama al constructor por defecto.

        // Se pide por teclado la parte REAL para conformar el primer número complejo:
        System.out.println("Introduce la parte real:");
        num1.setReal(lectura.nextDouble());

        // Se pide por teclado la parte IMAGINARIA para conformar el primer número complejo:
        System.out.println("Introduce la parte imaginaia:");
        num1.setImag(lectura.nextDouble());

        // Se muestra por teclado el resultado convertido en String
        System.out.println("Resultado:");
        System.out.println(num1.toString()); // Se llama al método al que bautizamos como "toString()".

        // NUMERO COMPLEJO 2:
        System.out.println("\nNÚMERO COMPLEJO 2 (ya establecido):");

        Complejo num2 = new Complejo(3, 5); // Se llama al constructor con parámetros.

        System.out.println(num2.toString());

        System.out.println("\n**********\n");

        // SUMA DE LOS DOS NÚMEROS COMPLEJOS:
        System.out.println("La suma de ambos números complejos es:");
        num1.sumar(num2);
        System.out.println(num1.toString());
    }
}

package com.mycompany.esfera;

public class MainEsfera {

    public static void main(String[] args) {

        MetodosEsfera esfera1 = new MetodosEsfera(Math.PI); // Llama al primer constructor.
        MetodosEsfera esfera2 = new MetodosEsfera(); // Llama al segundo constructor.

        // Invocamos los métodos que mostrarán los atributos de los objetos creados:
        esfera1.imprimir();
        System.out.println("********************");
        esfera2.imprimir();
    }
}

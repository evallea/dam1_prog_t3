package com.mycompany.punto;

public class MainPunto {

    public static void main(String[] args) {

        MetodosPunto punto1 = new MetodosPunto(1, 2, 3); // Llama al primer constructor.
        MetodosPunto punto2 = new MetodosPunto(33); // Llama al segundo constructor.
        MetodosPunto punto3 = new MetodosPunto(); // Llama al tercer constructor.
        MetodosPunto punto4 = new MetodosPunto(); // Llama al tercer constructor, después se reasignan los valores por teclado.

        // Invocamos los métodos que mostrarán los atributos de los objetos creados:
        punto1.imprimir();
        System.out.println("********************");
        punto2.imprimir();
        System.out.println("********************");
        punto3.imprimir();
        System.out.println("********************");
        punto4.pedirCoordenadas();
        punto4.imprimir();
    }

}

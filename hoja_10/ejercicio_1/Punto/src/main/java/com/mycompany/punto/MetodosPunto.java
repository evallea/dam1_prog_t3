package com.mycompany.punto;

import java.util.Scanner;

public class MetodosPunto {

    // Atributos:
    int x;
    int y;
    int z;
    Scanner lectura = new Scanner(System.in);

    // Sobrecarga de métodos: tres métodos con el mismo nombre, pero distintos parámetros.
    // 1. Método constructor con parámetros:
    public MetodosPunto(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // 2. Método constructor con el mismo valor "c" en todas las coordenadas:
    public MetodosPunto(int c) {
        x = c;
        y = c;
        z = c;
    }

    // 3. Método constructor con 0 en todas las coordenadas:
    public MetodosPunto() {
        x = 0;
        y = 0;
        z = 0;
    }

    // Método para mostrar los atributos del objeto creado:
    public void imprimir() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    // Método para pedir al usuario por teclado los valores de los atributos:
    public void pedirCoordenadas() {
        
        System.out.println("Introduce un valor para 'x'");
        x = lectura.nextInt();
        
        System.out.println("Introduce un valor para 'y'");
        y = lectura.nextInt();
        
        System.out.println("Introduce un valor para 'z'");
        z = lectura.nextInt();
    }
}

package com.mycompany.circunferencia;

public class MainCircunferencia {

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crea una circunferencia con radio 2.0
        MetodosCircunferencia c1 = new MetodosCircunferencia(2.0);
        System.out.println("Circunferencia 1:");
        c1.imprimir();

        // Crea una circunferencia con radio 1.0
        MetodosCircunferencia c2 = new MetodosCircunferencia();
        System.out.println("\nCircunferencia 2:");
        c2.imprimir();
    }

}

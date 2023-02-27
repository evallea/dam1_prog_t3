package com.mycompany.circunferencia;

public class MetodosCircunferencia {

    // Atributo que almacena el radio de la circunferencia
    private double r;

    // Constructor que crea una circunferencia con el radio especificado
    public MetodosCircunferencia(double r) {
        this.r = r;
    }

    // Constructor que crea una circunferencia con radio 1.0
    public MetodosCircunferencia() {
        r = 1.0;
    }

    // Método que retorna el área de la circunferencia
    public double area() {
        return Math.PI * r * r;
    }

    // Método que retorna el perímetro de la circunferencia
    public double perimetro() {
        return 2 * Math.PI * r;
    }

    // Método que imprime la información de la circunferencia
    public void imprimir() {
        System.out.println("Radio: " + r);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
    }

}

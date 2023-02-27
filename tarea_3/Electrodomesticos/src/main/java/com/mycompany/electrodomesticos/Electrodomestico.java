package com.mycompany.electrodomesticos;

public class Electrodomestico {

    // Atributos:
    private String numSerie;
    private String marca;
    private double precio;

    // Métodos SET:
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Métodos GET:
    public String getNumSerie() {
        return numSerie;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    // Constructor que inicializa los atributos a los siguientes:
    public Electrodomestico() {

        numSerie = "pendiente de asignar";
        marca = "LG";
        precio = 120.99;

    }

    // Constructor con los argumentos correspondientes a los atributos de la clase:
    public Electrodomestico(String numSerie, String marca, double precio) {
        this.numSerie = numSerie;
        this.marca = marca;
        this.precio = precio;
    }

    // Método para aplicar IVA:
    public double aplicarIva() {
        precio = precio + (precio * 0.21);
        return precio;

    }

    // Método para rebajar precio:
    public double rebajarPrecio(double porcentaje) {

        precio = precio - (precio * (porcentaje / 100));

        // Condición para que si el precio con los descuentos baja de 10, siempre sea 10.
        if (precio < 10) {
           precio = 10;
        }
        return precio;
    }

}

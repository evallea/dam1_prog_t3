package com.mycompany.aviones;

public class Avion {

    private String modelo;
    private double peso;
    private int asientos;
    private double autonomia;
    private double altura;
    private double velocidad;

    // gets y sets
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    // categoría de peso
    public String categoriaPeso() {
        if (peso >= 1 && peso <= 5) {
            return "ligero";
        } else if (peso > 5 && peso <= 10) {
            return "mediano";
        } else if (peso > 10 && peso <= 20) {
            return "pesado";
        } else {
            return "superpesado";
        }
    }

    // comprobar si caben pasajeros
    public boolean comprobarPasajeros(int numPasajeros) {
        return numPasajeros <= asientos;
    }

    // cálculo del número de repostajes
    public double numeroRepostajes(double km) {
        return km / autonomia;
    }

    // comprobar si el avión está en tierra
    public boolean enTierra(double alturaTierra) {
        return altura == alturaTierra;
    }
    
    // comprobar el tiempo que tarda en recorrer los Km indicados según la velocidad
    public double tiempo(int km) {
        return km / velocidad;
    }
   
}

package com.mycompany.ciudad;

public class MetodosCiudad {

    // Atributos:
    private String nombre;
    private String simbolo;
    private double temperatura;

    // Métodos set:
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    // Métodos get:
    public String getNombre() {
        return nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public double getTemperatura() {
        return temperatura;
    }

    // Métodos estáticos para la conversión:
    public static double celsiusAFarenheit(double temperatura) {
        double f;
        f = (1.8) * temperatura + 32;
        return f;
    }

    public static double farenheitACelsius(double temperatura) {
        double c;
        c = (temperatura - 32) / 1.8;
        return c;
    }

    // Constructor para introducir parámetros (para "ciudad1"):
    public MetodosCiudad(String nombre, String simbolo, double temperatura) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.temperatura = temperatura;

    }

    // Constructor por defecto (para "ciudad2"):
    public MetodosCiudad() {
       
    }

}

package com.mycompany.ciudad;

public class MainCiudad {

    public static void main(String[] args) {

        MetodosCiudad ciudad1 = new MetodosCiudad("París", "Torre Eiffel", 20);
        MetodosCiudad ciudad2 = new MetodosCiudad();

        System.out.println("Un símbolo de la ciudad de " + ciudad1.getNombre() + " es: " + ciudad1.getSimbolo() + ".");
        System.out.println("La temperatura media en la ciudad es: " + ciudad1.getTemperatura() + " ºC");
        System.out.println("En grados Farenheit: " + MetodosCiudad.celsiusAFarenheit(ciudad1.getTemperatura()) + " ºF");

        System.out.println("****************************************");

        // Se pasan los parámetros para "ciudad2", ya que el constructor carece de ellos.
        ciudad2.setNombre("Honolulu");
        ciudad2.setSimbolo("Waikiki Beach");
        ciudad2.setTemperatura(88);

        System.out.println("Un símbolo de la ciudad de " + ciudad2.getNombre() + " es: " + ciudad2.getSimbolo() + ".");
        System.out.println("La temperatura media en la ciudad es: " + ciudad2.getTemperatura() + " ºF");
        System.out.println("En grados Celsius: " + MetodosCiudad.farenheitACelsius(ciudad2.getTemperatura()) + " ºC");
    }
}

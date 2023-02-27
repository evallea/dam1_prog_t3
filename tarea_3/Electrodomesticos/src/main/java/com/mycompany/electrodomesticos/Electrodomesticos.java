package com.mycompany.electrodomesticos;

public class Electrodomesticos {

    public static void main(String[] args) {

        // OBJETO: electrodomestico1:
        System.out.println("ELECTRODOMÉSTICO 1:");
        System.out.println("********************");

        // Creación de "electrodomestico1" con el constructor por defecto:
        Electrodomestico electrodomestico1 = new Electrodomestico();

        // Lectura de sus atributos por pantalla:
        System.out.println("\nATRIBUTOS SIN MODIFICAR:");
        System.out.println("Marca: " + electrodomestico1.getMarca());
        System.out.println("Número de serie: " + electrodomestico1.getNumSerie());
        System.out.println("Precio: " + electrodomestico1.getPrecio());

        // Modificación de los atributos "marca" y "numSerie":
        electrodomestico1.setMarca("Siemens");
        electrodomestico1.setNumSerie("NS1234");

        // Lectura de sus atributos con las modificaciones realizadas:
        System.out.println("\nATRIBUTOS MODIFICADOS:");
        System.out.println("Marca: " + electrodomestico1.getMarca());
        System.out.println("Número de serie: " + electrodomestico1.getNumSerie());
        System.out.println("Precio: " + electrodomestico1.getPrecio());

        // ****************************************************************************************************
        
        // OBJETO: electrodomestico2:
        System.out.println("\nELECTRODOMÉSTICO 2:");
        System.out.println("********************");

        // Creación de "electrodomestico2" con parámetros:
        Electrodomestico electrodomestico2 = new Electrodomestico("Beko", "BK4321", 83);

        // Lectura de sus atributos por pantalla:
        System.out.println("\nATRIBUTOS:");
        System.out.println("Marca: " + electrodomestico2.getMarca());
        System.out.println("Número de serie: " + electrodomestico2.getNumSerie());
        System.out.println("Precio: " + electrodomestico2.getPrecio());

        // Modificación del precio con IVA:
        System.out.println("Precio con IVA: " + electrodomestico2.aplicarIva());

        // Modificación del precio anterior con IVA y además con un descuento del 30%:
        System.out.println("Precio con IVA y una rebaja del 30%: " + electrodomestico2.rebajarPrecio(30));

        // Modificación del precio anterior con IVA y además con dos descuentos del 30%:
        System.out.println("Precio con IVA y dos rebajas consecutivas del 30%: " + electrodomestico2.rebajarPrecio(30));
        
        // Modificación del precio anterior con IVA y además con tres descuentos del 30%:
        System.out.println("Precio con IVA y tres rebajas consecutivas del 30%: " + electrodomestico2.rebajarPrecio(30));

    }
}

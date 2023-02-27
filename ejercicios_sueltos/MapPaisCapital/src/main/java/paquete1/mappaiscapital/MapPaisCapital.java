package paquete1.mappaiscapital;

import java.util.*;

public class MapPaisCapital {

    // Programa que pide por teclado un país (llave) y devuelve por pantalla la capital (valor) del país introducido.
    public static void main(String[] args) {

        String pais;
        // boolean encontrado = false; // solo utilizado para la segunda solución:
        Scanner lectura = new Scanner(System.in);

        HashMap<String, String> h = new HashMap<>();

        h.put("España", "Madrid");
        h.put("Francia", "París");
        h.put("Grecia", "Atenas");
        h.put("Portugal", "Lisboa");
        h.put("Italia", "Roma");

        System.out.println("Escribe un país para conocer su capital:");
        System.out.println("- España");
        System.out.println("- Francia");
        System.out.println("- Grecia");
        System.out.println("- Portugal");
        System.out.println("- Italia");

        pais = lectura.nextLine();

        // PRIMERA SOLUCIÓN:
        if (h.containsKey(pais)) {
            System.out.println(h.get(pais));
        } else {
            System.out.println("No se encontró el país");
        }

        // SEGUNDA SOLUCIÓN:
        /*for (String i : h.keySet()) {
            if (pais.equalsIgnoreCase(i)) {
                System.out.println(h.get(i));
                encontrado = true;
            }
            if (encontrado == false) {
                System.out.println("No se encontró el país");
            }

        }*/
        
    }

}

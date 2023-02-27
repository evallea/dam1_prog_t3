package com.mycompany.reloj;

public class PrincipalReloj {

    public static void main(String[] args) {

        // Ejemplo de reloj en formato 24 h:
        System.out.println("EJEMPLO CON RELOJ EN FORMATO 24 HORAS:\n");

        Reloj reloj24 = new Reloj(17, 55, 59);
        System.out.println(reloj24.hora24());

        reloj24.incrementa();
        System.out.println(reloj24.hora24());

        reloj24.decrementa();
        reloj24.decrementa();
        System.out.println(reloj24.hora24());

        // Ejemplo de reloj en formato 12 h:
        System.out.println("\nEJEMPLO CON RELOJ EN FORMATO 12 HORAS:\n");

        Reloj reloj12 = new Reloj(17, 55, 59);
        System.out.println(reloj12.hora12());

        reloj12.incrementa();
        System.out.println(reloj12.hora12());

        reloj12.decrementa();
        reloj12.decrementa();
        System.out.println(reloj12.hora12());

    }
}

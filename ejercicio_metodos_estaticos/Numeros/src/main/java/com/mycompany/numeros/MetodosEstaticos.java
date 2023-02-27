package com.mycompany.numeros;

public class MetodosEstaticos {

    // Método estático para mostrar todos los números entre a y b:
    public static void numerosEntre(int num1, int num2) {
        int cont1 = 0;
        for (int i = num1 + 1; i < num2; i++) { // ponemos "a + 1" porque queremos los números entre "a" y "b", sin inlcluir "a".
            System.out.println(i);
            cont1++;
        }
        if (cont1 == 0) {
            System.out.println("No hay ningún número entre ellos.");
        }
    }

    // Método estático para mostrar todos los números pares entre a y b:
    public static void paresEntre(int num1, int num2) { // ponemos "a + 1" porque queremos los números entre "a" y "b", sin inlcluir "a".
        int cont2 = 0;
        for (int i = num1 + 1; i < num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                cont2++;
            }
        }
        if (cont2 == 0) {
            System.out.println("No hay ningún número par entre ellos.");
        }
    }

    // Método estático para mostrar los múltiplos de 100 que hay entre a y b:
    public static void multiplosEntre(int num1, int num2) { // ponemos "a + 1" porque queremos los números entre "a" y "b", sin inlcluir "a".
        int cont3 = 0;
        for (int i = num1 + 1; i < num2; i++) {
            if (i % 100 == 0) {
                System.out.println(i);
                cont3++;
            }
        }
        if (cont3 == 0) {
            System.out.println("No hay ningún múltiplo de 100 entre ellos.");
        }
    }
}

package com.mycompany.biblioteca;

public class Main {

    public static void main(String[] args) {

        Libro libros[] = new Libro[5]; // Se crea un array llamado "libros", con 5 objetos "Libro".

        // Se llama a los constructores:
        libros[0] = new Libro();
        libros[0].setTitulo("El Quijote");
        System.out.println(libros[0].getTitulo());

        libros[1] = new Libro();
        libros[2] = new Libro();
        libros[3] = new Libro();
        libros[4] = new Libro();
    }
}

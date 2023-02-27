package com.mycompany.mainlibros;

public class Libros {

    // Atributos:
    String titulo;
    String autor;
    int numLibros;
    int numLibrosPres;

    // Ejemplo de método constructor con parámetros:
    public Libros(String titulo, String autor, int numLibros, int numLibrosPres) {
        this.titulo = titulo;
        this.autor = autor;
        this.numLibros = numLibros;
        this.numLibrosPres = numLibrosPres;
    }

    // Ejemplo de método constructor sin parámetros:
    public Libros() {
        titulo = "Don Quijote de la Mancha";
        autor = "Miguel de Cervantes";
        numLibros = 34;
        numLibrosPres = 12;
    }

    // Método para mostrar los atributos del objeto creado:
    public void mostrarLibro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ejemplares en stock: " + numLibros);
        System.out.println("Ejemplares prestados: " + numLibrosPres);
    }

}

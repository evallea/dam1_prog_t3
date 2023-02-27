package com.mycompany.mainlibros;

public class MainLibros {

    public static void main(String[] args) {

        // Creamos los objetos "libro1" y "libro2" invocando al constructor "Libros" con la palabra reservada "new", y le pasamos los atributos:
        Libros libro1 = new Libros("Los robots del amanecer", "Isaac Asimov", 5, 3);
        // En el caso de "libro2", no le pasamos atributos, ya que usaremos el constructor sin parámetros.
        Libros libro2 = new Libros();

        // Invocamos los métodos que mostrarán los atributos de los objetos creados:
        libro1.mostrarLibro();
        System.out.println("********************");
        libro2.mostrarLibro();

    }
}

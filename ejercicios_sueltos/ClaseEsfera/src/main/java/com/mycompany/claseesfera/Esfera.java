package com.mycompany.claseesfera;

public class Esfera {

    // Radio de la esfera:
    double r = 5.3;

    // Volumen de la esfera:
    double v;

    public void volumen() { // "void" es para no devolver nada.
        v = (4 / 3) * Math.PI * Math.pow(r, 3);

    }

    public void muestraVolumen() { // "void" es para no devolver nada.
        volumen(); // se utiliza el método "volumen" anterior para darle valor a "v".
        System.out.println(v);
    }

}

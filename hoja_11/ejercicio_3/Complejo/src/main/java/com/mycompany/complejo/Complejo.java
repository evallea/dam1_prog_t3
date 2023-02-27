package com.mycompany.complejo;

public class Complejo {

    double real;
    double imag;

    // CONSTRUCTOR POR DEFECTO:
    public Complejo() {
    }

    // CONSTRUCTOR CON PARÁMETROS:
    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // GETS Y SETS:
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    // Este método se usa para devolver como cadena la representación de la suma del número real con el imaginario.
    @Override // Se usa para sobreescribir el método toString ya existente en Java y así evitar problemas.
    public String toString() {
        String cadena = (this.real + " + " + this.imag + "i");
        return cadena;
    }

    // Este método recibe como parámetro un objeto de la clase Complejo (num2) y utiliza el operador += para sumar la parte real y la parte imaginaria del objeto num2 a las variables real e imag del objeto actual.
    public void sumar(Complejo num2) {
        this.real += num2.real;
        this.imag += num2.imag;
    }
}

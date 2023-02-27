package com.mycompany.reloj;

public class Reloj {

    private int hora;
    private int minuto;
    private int segundo;

    // Constructor:
    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Método que incrementa la hora en un segundo:
    public void incrementa() {
        segundo++;
        if (segundo >= 60) {
            segundo = 0;
            minuto++;
            if (minuto >= 60) {
                minuto = 0;
                hora++;
                if (hora >= 24) {
                    hora = 0;
                }
            }
        }
    }

    // Método que disminuye la hora en un segundo:
    public void decrementa() {
        segundo--;
        if (segundo < 0) {
            segundo = 59;
            minuto--;
            if (minuto < 0) {
                minuto = 59;
                hora--;
                if (hora < 0) {
                    hora = 23;
                }
            }
        }
    }

    // Método que convierte a String la hora en formato estándar de 24 horas:
    public String hora24() {

        return String.format("%02d:%02d:%02d", hora, minuto, segundo);

    }

    // Método que convierte a String la hora en formato especial de 12 horas:
    public String hora12() {
        String ampm = "AM";
        int hora12 = hora;
        if (hora12 >= 12) {
            ampm = "PM";
            hora12 -= 12;
            if (hora12 == 0) {
                hora12 = 12;
            }
        }

        return String.format("%02d:%02d:%02d %s", hora12, minuto, segundo, ampm);
    }
}

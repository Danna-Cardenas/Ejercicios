/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio44;


/**
 *
 * @author DANNA
 */
public class Cronometro {
    
    public static void main(String[] args) {
        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        while (true) {
            // Mostrar el cronómetro en formato HH:MM:SS
            System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);

            // Esperar un segundo
            esperarSegundo();

            // Incrementar los segundos y ajustar los minutos y las horas si es necesario
            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                    if (horas == 24) {
                        horas = 0;
                    }
                }
            }
        }
    }

    // Método para esperar un segundo
    public static void esperarSegundo() {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 1000) {
            // Esperar
        }
    }

    
   
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio44;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author DANNA
 */
public class Cronometro {
    
    private static int horas = 0;
    private static int minutos = 0;
    private static int segundos = 0;

    public static void main(String[] args) {
        Timer timer = new Timer();

        // Programar tarea para ejecutarse cada segundo
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                actualizarCronometro();
                mostrarCronometro();
            }
        }, 0, 1000); // Iniciar inmediatamente y repetir cada segundo

        // Esperar 10 segundos antes de detener el cronómetro (puedes ajustar este tiempo)
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Detener el cronómetro después de 10 segundos
        timer.cancel();
    }

    private static void actualizarCronometro() {
        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos++;

            if (minutos == 60) {
                minutos = 0;
                horas++;
            }
        }
    }

    private static void mostrarCronometro() {
        System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
    }
    
}

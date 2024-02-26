/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio17;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class Ciclista {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la hora de salida
        System.out.println("Ingrese la hora de salida (HH MM SS):");
        int horaSalidaH = scanner.nextInt();
        int horaSalidaM = scanner.nextInt();
        int horaSalidaS = scanner.nextInt();

        // Solicitar al usuario el tiempo de viaje en segundos
        System.out.println("Ingrese el tiempo de viaje en segundos:");
        int tiempoViaje = scanner.nextInt();

        // Calcular la hora de llegada
        int horaLlegadaH = horaSalidaH + (tiempoViaje / 3600);
        int horaLlegadaM = (horaSalidaM + ((tiempoViaje % 3600) / 60)) % 60;
        int horaLlegadaS = (horaSalidaS + (tiempoViaje % 60)) % 60;

        // Mostrar la hora de llegada
        System.out.println("El ciclista llegará a la ciudad B a las " + horaLlegadaH + " horas, " + horaLlegadaM + " minutos y " + horaLlegadaS + " segundos.");

    }
    
}

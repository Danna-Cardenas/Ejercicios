/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class DistanciaPuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el primer par de coordenadas
        System.out.println("Ingrese las coordenadas del primer punto (x1 y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        // Solicitar al usuario el segundo par de coordenadas
        System.out.println("Ingrese las coordenadas del segundo punto (x2 y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Calcular la distancia entre los dos puntos
        double distancia = calcularDistancia(x1, y1, x2, y2);

        // Mostrar la distancia calculada
        System.out.println("La distancia entre los dos puntos es: " + distancia);

        // Cerrar el scanner
        scanner.close();
    }

    // Método para calcular la distancia entre dos puntos
    private static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double diferenciaX = x2 - x1;
        double diferenciaY = y2 - y1;
        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
    }
    
}

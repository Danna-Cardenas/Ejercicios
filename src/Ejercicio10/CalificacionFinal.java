/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class CalificacionFinal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la calificación del primer parcial:");
        double parcial1 = scanner.nextDouble();

        System.out.println("Ingrese la calificación del segundo parcial:");
        double parcial2 = scanner.nextDouble();

        System.out.println("Ingrese la calificación del tercer parcial:");
        double parcial3 = scanner.nextDouble();

        System.out.println("Ingrese la calificación del examen final:");
        double examenFinal = scanner.nextDouble();

        System.out.println("Ingrese la calificación del trabajo final:");
        double trabajoFinal = scanner.nextDouble();

        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;

        double calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.3) + (trabajoFinal * 0.15);

        System.out.println("La calificación final en la materia de Algoritmos es: " + calificacionFinal);

        
    }
}
    


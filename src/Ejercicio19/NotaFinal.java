/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio19;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class NotaFinal {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de respuestas correctas
        System.out.println("Ingrese el número de respuestas correctas:");
        int respuestasCorrectas = scanner.nextInt();

        // Solicitar al usuario el número de respuestas incorrectas
        System.out.println("Ingrese el número de respuestas incorrectas:");
        int respuestasIncorrectas = scanner.nextInt();

        // Calcular la nota final
        int notaFinal = calcularNotaFinal(respuestasCorrectas, respuestasIncorrectas);

        // Mostrar la nota final
        System.out.println("La nota final del estudiante es: " + notaFinal + " puntos.");

        // Cerrar el scanner
        scanner.close();
    }

    // Método para calcular la nota final
    private static int calcularNotaFinal(int correctas, int incorrectas) {
        int notaFinal = (correctas * 5) - incorrectas;
        // Asegurarse de que la nota no sea negativa
        return Math.max(notaFinal, 0);
    }
    
}

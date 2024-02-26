/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio39;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class Vocal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bucle para pedir caracteres hasta que se ingrese un espacio
        while (true) {
            System.out.println("Ingrese un carácter (o espacio para salir):");
            char caracter = scanner.next().charAt(0);

            // Verificar si es un espacio para terminar el programa
            if (caracter == ' ') {
                System.out.println("Programa terminado.");
                break;
            }

            // Verificar si el carácter es una vocal
            if (esVocal(caracter)) {
                System.out.println("VOCAL");
            } else {
                System.out.println("NO VOCAL");
            }
        }

    }

    // Método para verificar si un carácter es una vocal
    private static boolean esVocal(char c) {
        // Convertir el carácter a minúscula para simplificar la verificación
        char caracterEnMinuscula = Character.toLowerCase(c);

        // Verificar si es una vocal
        return caracterEnMinuscula == 'a' || caracterEnMinuscula == 'e' ||
               caracterEnMinuscula == 'i' || caracterEnMinuscula == 'o' ||
               caracterEnMinuscula == 'u';
    }
    
}

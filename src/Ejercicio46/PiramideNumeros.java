/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio46;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class PiramideNumeros {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de filas para la pirámide:");
        int numeroFilas = scanner.nextInt();

        // Imprimir la pirámide de números
        imprimirPiramide(numeroFilas);

    }

    // Método para imprimir la pirámide de números
    private static void imprimirPiramide(int n) {
        for (int i = 1; i <= n; i++) {
            // Imprimir espacios en blanco antes de los números
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Imprimir números ascendentes
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            // Imprimir números descendentes
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l + " ");
            }
            
            System.out.println();
        }
    }
    
}

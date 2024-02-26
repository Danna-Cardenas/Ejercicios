/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio22;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class NumerosImparoPar {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();

        // Verificar si el número es par o impar e imprimir el resultado
        if (esPar(numero)) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }

    // Método para verificar si un número es par
    private static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio29;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class AñoBisiesto {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un año:");
        int ano = scanner.nextInt();

        // Verificar si el año es bisiesto e imprimir el resultado
        if (esBisiesto(ano)) {
            System.out.println(ano + " es un año bisiesto.");
        } else {
            System.out.println(ano + " no es un año bisiesto.");
        }

    }

    // Método para verificar si un año es bisiesto
    private static boolean esBisiesto(int ano) {
        // Un año es bisiesto si es divisible por 4 y no es divisible por 100, o es divisible por 400.
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    
}


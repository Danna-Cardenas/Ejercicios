/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio45;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class NumerosPrimos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números primos que desea mostrar:");
        int cantidadNumerosPrimos = scanner.nextInt();

        System.out.println("Los primeros " + cantidadNumerosPrimos + " números primos son:");
        mostrarNumerosPrimos(cantidadNumerosPrimos);

    }

    // Método para verificar si un número es primo
    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Método para mostrar los primeros N números primos
    private static void mostrarNumerosPrimos(int cantidad) {
        int numeroActual = 2;
        int numerosPrimosEncontrados = 0;

        while (numerosPrimosEncontrados < cantidad) {
            if (esPrimo(numeroActual)) {
                System.out.print(numeroActual + " ");
                numerosPrimosEncontrados++;
            }

            numeroActual++;
        }

        System.out.println(); 
    }
    
}

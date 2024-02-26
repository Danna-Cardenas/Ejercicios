/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio48;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class MaximoMinimo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        // Solicitar al usuario ingresar 10 números
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        // Encontrar el máximo y el mínimo
        int maximo = encontrarMaximo(numeros);
        int minimo = encontrarMinimo(numeros);

        // Mostrar los números con "máximo" y "mínimo"
        System.out.println("Números introducidos con 'máximo' y 'mínimo':");
        mostrarConMaximoMinimo(numeros, maximo, minimo);

    }

    // Método para encontrar el máximo en un array de números
    private static int encontrarMaximo(int[] array) {
        int maximo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }

    // Método para encontrar el mínimo en un array de números
    private static int encontrarMinimo(int[] array) {
        int minimo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }

    // Método para mostrar los números con "máximo" y "mínimo"
    private static void mostrarConMaximoMinimo(int[] array, int maximo, int minimo) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (array[i] == maximo) {
                System.out.print(" máximo");
            } else if (array[i] == minimo) {
                System.out.print(" mínimo");
            }
            System.out.print(" ");
        }
        System.out.println(); 
    }
    
}

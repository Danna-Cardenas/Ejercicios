/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio47;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class NumeroInverso {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        // Solicitar al usuario ingresar 10 números
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los números en orden inverso
        System.out.println("Los números en orden inverso son:");
        mostrarEnOrdenInverso(numeros);

    }

    // Método para mostrar los números en orden inverso
    private static void mostrarEnOrdenInverso(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
}

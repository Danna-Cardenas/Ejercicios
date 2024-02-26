/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio40;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class NumerosPar {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        // Imprimir todos los números pares en el rango
        System.out.println("Números pares en el rango de " + numero1 + " a " + numero2 + ":");
        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
    
}

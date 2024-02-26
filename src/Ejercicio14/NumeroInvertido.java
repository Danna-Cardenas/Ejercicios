/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class NumeroInvertido {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número de dos cifras
        System.out.println("Ingrese un número de dos cifras:");
        int numero = scanner.nextInt();

        // Verificar si el número tiene dos cifras
        if (numero >= 10 && numero <= 99) {
            // Calcular las cifras invertidas
            int cifra1 = numero % 10;
            int cifra2 = numero / 10;

            // Construir el número invertido
            int numeroInvertido = cifra1 * 10 + cifra2;

            // Mostrar el número invertido
            System.out.println("El número invertido es: " + numeroInvertido);
        } else {
            System.out.println("Por favor, ingrese un número válido de dos cifras.");
        }

        
    }
    
}

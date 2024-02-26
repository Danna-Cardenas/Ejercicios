/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio25;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class CalcularPotencia {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Ingrese el número base:");
        double base = scanner.nextDouble();

  
        System.out.println("Ingrese el exponente:");
        int exponente = scanner.nextInt();

        // Calcular la potencia y mostrar el resultado
        double resultado = calcularPotencia(base, exponente);
        System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);
    }

    // Método para calcular la potencia de un número
    private static double calcularPotencia(double base, int exponente) {
        if (exponente > 0) {
            return Math.pow(base, exponente); // Potencia positiva
        } else if (exponente == 0) {
            return 1; // Cualquier número elevado a la 0 es 1
        } else {
            // Potencia negativa, calcular el inverso de la potencia con exponente positivo
            return 1 / Math.pow(base, Math.abs(exponente));
        }
    }
    
}

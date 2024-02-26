/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio42;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class Potencia {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base (número real):");
        double base = scanner.nextDouble();

        System.out.println("Ingrese el exponente (número entero positivo):");
        int exponente = scanner.nextInt();

        // Verificar si el exponente es positivo
        if (exponente < 0) {
            System.out.println("ERROR: El exponente debe ser un número entero positivo.");
        } else {
            // Calcular la potencia sin utilizar el operador de potencia
            double resultado = calcularPotencia(base, exponente);

            System.out.println(base + " elevado a la " + exponente + " es igual a: " + resultado);
        }

    }

    // Método para calcular la potencia sin utilizar el operador de potencia
    private static double calcularPotencia(double base, int exponente) {
        double resultado = 1.0;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }
    
}

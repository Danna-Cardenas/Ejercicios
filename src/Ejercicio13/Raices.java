/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class Raices {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.println("Ingrese un número:");
        double numero = scanner.nextDouble();

        // Calcular la raíz cuadrada y cúbica
        double raizCuadrada = Math.sqrt(numero);
        double raizCubica = Math.cbrt(numero);

        // Mostrar los resultados
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
        System.out.println("La raíz cúbica de " + numero + " es: " + raizCubica);

    }
    
}

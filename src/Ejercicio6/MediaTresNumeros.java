/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class MediaTresNumeros {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();

        // Solicitar al usuario que ingrese el segundo número
        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();

        // Solicitar al usuario que ingrese el tercer número
        System.out.println("Ingrese el tercer número:");
        double numero3 = scanner.nextDouble();

        // Calcular la media
        double media = calcularMedia(numero1, numero2, numero3);

        // Mostrar la media
        System.out.println("La media de los tres números es: " + media);
    }

    // Método para calcular la media de tres números
    private static double calcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }
    
}

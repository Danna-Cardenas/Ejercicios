/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio28;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class TrianguloLados {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del lado 1:");
        double lado1 = scanner.nextDouble();

        System.out.println("Ingrese el tamaño del lado 2:");
        double lado2 = scanner.nextDouble();

        System.out.println("Ingrese el tamaño del lado 3:");
        double lado3 = scanner.nextDouble();

        clasificarTriangulo(lado1, lado2, lado3);

    }

    // Método para clasificar el triángulo
    private static void clasificarTriangulo(double lado1, double lado2, double lado3) {
        if (esTriangulo(lado1, lado2, lado3)) {
            if (esTrianguloRectangulo(lado1, lado2, lado3)) {
                System.out.println("El triángulo es rectángulo.");
            } else if (esTrianguloEquilatero(lado1, lado2, lado3)) {
                System.out.println("El triángulo es equilátero.");
            } else if (esTrianguloIsosceles(lado1, lado2, lado3)) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("El triángulo es escaleno.");
            }
        } else {
            System.out.println("No es un triángulo válido.");
        }
    }

    // Método para verificar si los lados forman un triángulo válido
    private static boolean esTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }

    // Método para verificar si el triángulo es rectángulo
    private static boolean esTrianguloRectangulo(double lado1, double lado2, double lado3) {
        double[] ladosOrdenados = { lado1, lado2, lado3 };
        java.util.Arrays.sort(ladosOrdenados);
        return Math.pow(ladosOrdenados[0], 2) + Math.pow(ladosOrdenados[1], 2) == Math.pow(ladosOrdenados[2], 2);
    }

    // Método para verificar si el triángulo es equilátero
    private static boolean esTrianguloEquilatero(double lado1, double lado2, double lado3) {
        return lado1 == lado2 && lado1 == lado3;
    }

    // Método para verificar si el triángulo es isósceles
    private static boolean esTrianguloIsosceles(double lado1, double lado2, double lado3) {
        return lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
    }
    
}

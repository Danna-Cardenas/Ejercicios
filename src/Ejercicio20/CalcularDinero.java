/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio20;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class CalcularDinero {
    
     public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);

        // Preguntar al usuario cuántas monedas tiene de cada denominación
        System.out.println("Ingrese el número de monedas de 2 euros:");
        int monedas2Euros = scanner.nextInt();

        System.out.println("Ingrese el número de monedas de 1 euro:");
        int monedas1Euro = scanner.nextInt();

        System.out.println("Ingrese el número de monedas de 50 céntimos:");
        int monedas50Centimos = scanner.nextInt();

        System.out.println("Ingrese el número de monedas de 20 céntimos:");
        int monedas20Centimos = scanner.nextInt();

        System.out.println("Ingrese el número de monedas de 10 céntimos:");
        int monedas10Centimos = scanner.nextInt();

        // Calcular el total en euros y céntimos
        double totalEuros = calcularTotalEuros(monedas2Euros, monedas1Euro, monedas50Centimos, monedas20Centimos, monedas10Centimos);
        int totalCentimos = calcularTotalCentimos(monedas2Euros, monedas1Euro, monedas50Centimos, monedas20Centimos, monedas10Centimos);

        // Mostrar el resultado
        System.out.println("El total es: " + (int) totalEuros + " euros y " + totalCentimos + " céntimos.");

        // Cerrar el scanner
        scanner.close();
    }

    // Método para calcular el total en euros
    private static double calcularTotalEuros(int monedas2Euros, int monedas1Euro, int monedas50Centimos, int monedas20Centimos, int monedas10Centimos) {
        return (monedas2Euros * 2.0) + (monedas1Euro * 1.0) + (monedas50Centimos * 0.5) + (monedas20Centimos * 0.2) + (monedas10Centimos * 0.1);
    }

    // Método para calcular el total en céntimos
    private static int calcularTotalCentimos(int monedas2Euros, int monedas1Euro, int monedas50Centimos, int monedas20Centimos, int monedas10Centimos) {
        return (monedas2Euros * 200) + (monedas1Euro * 100) + (monedas50Centimos * 50) + (monedas20Centimos * 20) + (monedas10Centimos * 10);
    }
    
}

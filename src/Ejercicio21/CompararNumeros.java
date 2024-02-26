/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio21;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class CompararNumeros {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();

        // Solicitar al usuario que ingrese el segundo número
        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();

        // Comparar los números e imprimir el resultado
        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else if (numero1 < numero2) {
            System.out.println(numero2 + " es mayor que " + numero1);
        } else {
            System.out.println("Los números son iguales.");
        }
   
    }
    
}

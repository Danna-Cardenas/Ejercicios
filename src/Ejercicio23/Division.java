/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio23;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class Division {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();

     
        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();

        // Verificar si el segundo número es 0 antes de realizar la división
        if (numero2 != 0) {
            
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }

    }
}

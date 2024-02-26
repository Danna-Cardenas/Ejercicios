/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class Operaciones {
    
    
     public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el primer número
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        // Pedir al usuario que ingrese el segundo número
        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Realizar las operaciones aritméticas
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;

        // Manejar el caso de división por cero
        double division;
        if (numero2 != 0) {
            division = numero1 / numero2;
        } else {
            System.out.println("No es posible dividir por cero.");
            division = Double.NaN; // NaN (Not a Number) indica un resultado no válido
        }

        // Mostrar el resultado al usuario
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

    }

    
}

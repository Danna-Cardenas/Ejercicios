/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class Convertir {
    
    
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la temperatura en grados Fahrenheit
        System.out.print("Ingresa la temperatura en grados Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Calcular la temperatura en grados Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Mostrar el resultado al usuario
        System.out.println("La temperatura en grados Celsius es: " + celsius + "°C");

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class Rectangulo {
    
     public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la base del rectángulo
        System.out.print("Ingresa la base del rectángulo: ");
        double base = scanner.nextDouble();

        // Pedir al usuario que ingrese la altura del rectángulo
        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        // Calcular el perímetro del rectángulo
        double perimetro = 2 * (base + altura);

        // Calcular el área del rectángulo
        double area = base * altura;

        // Mostrar el resultado al usuario
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);
    }

    
}

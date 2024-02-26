/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio26;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class Solicitud {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad:");
        int edad = scanner.nextInt();

        System.out.println("Ingrese la nota:");
        double nota = scanner.nextDouble();

        System.out.println("Ingrese el sexo (M/F):");
        char sexo = scanner.next().charAt(0);

        // Determinar la aceptación de la solicitud
        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                System.out.println("POSIBLE: Aceptación de la solicitud para un hombre con nota mayor o igual a 5 y edad mayor o igual a 18.");
            } else if (sexo == 'F') {
                System.out.println("ACEPTADA: Aceptación de la solicitud para una mujer con nota mayor o igual a 5 y edad mayor o igual a 18.");
            } else {
                System.out.println("NO ACEPTADA: Sexo no reconocido.");
            }
        } else {
            System.out.println("NO ACEPTADA: Nota menor a 5 o edad menor a 18.");
        }
    }
}

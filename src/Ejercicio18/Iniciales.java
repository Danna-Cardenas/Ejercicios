/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio18;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class Iniciales {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el nombre
        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();

        // Solicitar al usuario que ingrese el primer apellido
        System.out.println("Ingrese el primer apellido:");
        String apellido1 = scanner.nextLine();

        // Solicitar al usuario que ingrese el segundo apellido
        System.out.println("Ingrese el segundo apellido:");
        String apellido2 = scanner.nextLine();

        // Obtener las iniciales
        char inicialNombre = nombre.charAt(0);
        char inicialApellido1 = apellido1.charAt(0);
        char inicialApellido2 = apellido2.charAt(0);

        // Mostrar las iniciales
        System.out.println("Las iniciales son: " + inicialNombre + inicialApellido1 + inicialApellido2);

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio24;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class Mayuscula {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una letra:");
        String cadena = scanner.nextLine();

        // Verificar si la cadena es una letra mayúscula
        if (esLetraMayuscula(cadena)) {
            System.out.println("La cadena ingresada es una letra mayúscula.");
        } else {
            System.out.println("La cadena ingresada no es una letra mayúscula o tiene más de un carácter.");
        }
    }
    // Método para verificar si una cadena es una letra mayúscula
    private static boolean esLetraMayuscula(String cadena) {
        // Verificar que la cadena tenga un solo carácter y que sea una letra mayúscula
        return cadena.length() == 1 && Character.isUpperCase(cadena.charAt(0));
    }
    
}

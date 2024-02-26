/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio33;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class Dado {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el resultado obtenido al lanzar un dado de seis caras:");
        int resultadoDado = scanner.nextInt();

        // Verificar si el número del dado es válido
        if (resultadoDado >= 1 && resultadoDado <= 6) {
            // Mostrar el número en letras de la cara opuesta
            String caraOpuesta = obtenerCaraOpuesta(resultadoDado);
            System.out.println("La cara opuesta es: " + caraOpuesta);
        } else {
            // Mostrar mensaje de error si el número es incorrecto
            System.out.println("ERROR: Número incorrecto. Debe estar entre 1 y 6.");
        }

    }

    // Método para obtener el número en letras de la cara opuesta
    private static String obtenerCaraOpuesta(int resultadoDado) {
        switch (resultadoDado) {
            case 1:
                return "6";
            case 2:
                return "5";
            case 3:
                return "4";
            case 4:
                return "3";
            case 5:
                return "2";
            case 6:
                return "1";
            default:
                return "";
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio38;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class AlgoritmoNumeros {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a introducir:");
        int cantidadNumeros = scanner.nextInt();

        // Inicializar contadores
        int mayoresQueCero = 0;
        int menoresQueCero = 0;
        int igualesAZero = 0;

        // Pedir al usuario que ingrese los números
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            int numero = scanner.nextInt();

            // Clasificar el número
            if (numero > 0) {
                mayoresQueCero++;
            } else if (numero < 0) {
                menoresQueCero++;
            } else {
                igualesAZero++;
            }
        }

        System.out.println("Cantidad de números mayores que 0: " + mayoresQueCero);
        System.out.println("Cantidad de números menores que 0: " + menoresQueCero);
        System.out.println("Cantidad de números iguales a 0: " + igualesAZero);

    }
}

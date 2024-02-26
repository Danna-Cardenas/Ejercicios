/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio41;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class Intervalo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el límite inferior del intervalo:");
        int limiteInferior = scanner.nextInt();

        System.out.println("Ingrese el límite superior del intervalo (mayor que el límite inferior):");
        int limiteSuperior = scanner.nextInt();

        // Verificar que el límite inferior sea menor que el límite superior
        while (limiteInferior >= limiteSuperior) {
            System.out.println("ERROR: El límite inferior debe ser menor que el límite superior.");
            System.out.println("Ingrese el límite inferior del intervalo:");
            limiteInferior = scanner.nextInt();

            System.out.println("Ingrese el límite superior del intervalo (mayor que el límite inferior):");
            limiteSuperior = scanner.nextInt();
        }

        int sumaDentroIntervalo = 0;
        int numerosFueraIntervalo = 0;
        boolean hayIgualAlLimite = false;

        // Bucle para ingresar números hasta que se introduce un 0
        while (true) {
            System.out.println("Ingrese un número (0 para terminar):");
            int numero = scanner.nextInt();

            // Verificar si se debe terminar el bucle
            if (numero == 0) {
                break;
            }

            // Verificar si el número está dentro del intervalo
            if (numero > limiteInferior && numero < limiteSuperior) {
                sumaDentroIntervalo += numero;
            } else {
                numerosFueraIntervalo++;
            }

            // Verificar si el número es igual a los límites del intervalo
            if (numero == limiteInferior || numero == limiteSuperior) {
                hayIgualAlLimite = true;
            }
        }

        System.out.println("Suma de los números dentro del intervalo: " + sumaDentroIntervalo);
        System.out.println("Cantidad de números fuera del intervalo: " + numerosFueraIntervalo);

        if (hayIgualAlLimite) {
            System.out.println("Se ha introducido algún número igual a los límites del intervalo.");
        } else {
            System.out.println("No se ha introducido ningún número igual a los límites del intervalo.");
        }

    }
    
}

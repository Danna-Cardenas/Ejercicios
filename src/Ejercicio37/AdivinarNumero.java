/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio37;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class AdivinarNumero {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generar un número aleatorio del 1 al 100
        int numeroAdivinar = random.nextInt(100) + 1;

        // Inicializar variables
        int intentos = 0;
        final int maxIntentos = 10;
        int numeroUsuario;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Tienes " + maxIntentos + " intentos para adivinar el número.");

        do {
            
            System.out.println("Ingresa un número:");
            numeroUsuario = scanner.nextInt();

            // Incrementar el contador de intentos
            intentos++;

            // Verificar si el número es correcto
            if (numeroUsuario == numeroAdivinar) {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                break;
            } else if (numeroUsuario < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor. Intentos restantes: " + (maxIntentos - intentos));
            } else {
                System.out.println("El número a adivinar es menor. Intentos restantes: " + (maxIntentos - intentos));
            }

            // Verificar si se ha alcanzado el límite de intentos
            if (intentos == maxIntentos) {
                System.out.println("Lo siento, has agotado tus " + maxIntentos + " intentos. El número era: " + numeroAdivinar);
                break;
            }

        } while (true);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class CalcularDistancia {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el primer número
        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();

        // Pedir al usuario que ingrese el segundo número
        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();

        // Calcular la distancia entre los dos números
        //Math.abs para calcular el valor absoluto de la diferencia entre los dos números, lo que representa la distancia entre ellos. Luego, muestra el resultado en la consola.
        double distancia = Math.abs(numero1 - numero2);

        // Mostrar la distancia calculada
        System.out.println("La distancia entre " + numero1 + " y " + numero2 + " es: " + distancia);

       
    
}
}

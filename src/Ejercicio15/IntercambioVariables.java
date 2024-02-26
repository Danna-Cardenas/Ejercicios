/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio15;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class IntercambioVariables {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el valor de A
        System.out.println("Ingrese el valor de A:");
        int A = scanner.nextInt();

        // Solicitar al usuario que ingrese el valor de B
        System.out.println("Ingrese el valor de B:");
        int B = scanner.nextInt();

        // Mostrar los valores iniciales
        System.out.println("Valores iniciales: A = " + A + ", B = " + B);

        // Intercambiar los valores de A y B usando una variable auxiliar
        int auxiliar = A;
        A = B;
        B = auxiliar;

        // Mostrar los valores después del intercambio
        System.out.println("Valores después del intercambio: A = " + A + ", B = " + B);

       
    }
    
}

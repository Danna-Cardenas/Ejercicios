/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class HipotenusaTriangulo {
    
    
    public class Ejercicio3 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la longitud del primer cateto
        System.out.print("Ingresa la longitud del primer cateto: ");
        double cateto1 = scanner.nextDouble();

        // Pedir al usuario que ingrese la longitud del segundo cateto
        System.out.print("Ingresa la longitud del segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        // Calcular la hipotenusa usando el teorema de Pitágoras
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        // Mostrar el resultado al usuario
        System.out.println("La hipotenusa del triángulo rectángulo es: " + hipotenusa);

        

}
    }
}

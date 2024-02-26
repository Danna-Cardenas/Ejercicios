/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class PrecioFinal {
    
     public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el total de la compra
        System.out.print("Ingresa el total de la compra: ");
        double totalCompra = scanner.nextDouble();

        // Calcular el descuento (15% del total de la compra)
        double descuento = totalCompra * 0.15;

        // Calcular el monto final a pagar después del descuento
        double montoFinal = totalCompra - descuento;

        // Mostrar el resultado al usuario
        System.out.println("El descuento aplicado es: " + descuento);
        System.out.println("El monto final a pagar es: " + montoFinal);

    }

    
}

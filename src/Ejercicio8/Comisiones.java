/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class Comisiones {
    
    public static void main(String[] args) {
        // Definir el sueldo base del vendedor
        double sueldoBase = 1000.0; // Ejemplo de sueldo base

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el monto de las tres ventas realizadas en el mes
        System.out.print("Ingresa el monto de la primera venta: ");
        double venta1 = scanner.nextDouble();

        System.out.print("Ingresa el monto de la segunda venta: ");
        double venta2 = scanner.nextDouble();

        System.out.print("Ingresa el monto de la tercera venta: ");
        double venta3 = scanner.nextDouble();

        // Calcular la comisión total por las tres ventas (10% de cada venta)
        double comisionTotal = (venta1 + venta2 + venta3) * 0.10;

        // Calcular el total recibido en el mes (sueldo base más comisión)
        double totalMes = sueldoBase + comisionTotal;

        // Mostrar el resultado al usuario
        System.out.println("El total por comisiones por las tres ventas en el mes es: " + comisionTotal);
        System.out.println("El total que recibirá en el mes es: " + totalMes);

    }

    
}

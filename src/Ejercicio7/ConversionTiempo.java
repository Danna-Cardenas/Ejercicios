/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class ConversionTiempo {
    
     public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la cantidad de minutos
        System.out.print("Ingresa la cantidad de minutos: ");
        int minutos = scanner.nextInt();

        // Calcular las horas y los minutos equivalentes
        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;

        // Mostrar el resultado al usuario
        System.out.println(minutos + " minutos equivalen a " + horas + " horas y " + minutosRestantes + " minutos.");

    }

    
}

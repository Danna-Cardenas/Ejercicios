/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio35;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class DiasMes {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 12 para representar un mes:");
        int numeroMes = scanner.nextInt();

        // Determinar y mostrar el número de días del mes correspondiente
        int diasEnMes = obtenerDiasEnMes(numeroMes);
        if (diasEnMes != -1) {
            System.out.println("El mes " + numeroMes + " tiene " + diasEnMes + " días.");
        } else {
            System.out.println("ERROR: Número incorrecto. Debe estar entre 1 y 12.");
        }

    }

    // Método para obtener el número de días del mes correspondiente
    private static int obtenerDiasEnMes(int numeroMes) {
        switch (numeroMes) {
            case 1: // Enero
            case 3: // Marzo
            case 5: // Mayo
            case 7: // Julio
            case 8: // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                return 31;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                return 30;
            case 2: // Febrero
                return 28;
            default:
                return -1; 
        }
    }
    
}

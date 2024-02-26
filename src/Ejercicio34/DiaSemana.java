/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio34;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class DiaSemana {
    
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 7 para representar un día de la semana:");
        int numeroDia = scanner.nextInt();

        // Determinar y mostrar el día correspondiente
        String diaCorrespondiente = obtenerDiaCorrespondiente(numeroDia);
        if (!diaCorrespondiente.equals("")) {
            System.out.println("El día correspondiente es: " + diaCorrespondiente);
        } else {
            System.out.println("ERROR: Número incorrecto. Debe estar entre 1 y 7.");
        }

    }

    // Método para obtener el día correspondiente al número ingresado
    private static String obtenerDiaCorrespondiente(int numeroDia) {
        switch (numeroDia) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "";
        }
    }
}

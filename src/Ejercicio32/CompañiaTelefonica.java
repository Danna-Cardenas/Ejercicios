/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio32;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class CompañiaTelefonica {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la duración de la llamada en minutos:");
        int duracionLlamada = scanner.nextInt();

        System.out.println("Ingrese el día de la semana (1 a 7):");
        int diaSemana = scanner.nextInt();

        System.out.println("Ingrese el turno de la llamada (1: mañana, 2: tarde):");
        int turnoLlamada = scanner.nextInt();

        double costoLlamada = calcularCostoLlamada(duracionLlamada);

        // Calcular el impuesto según el día y turno
        double impuesto = calcularImpuesto(diaSemana, turnoLlamada, costoLlamada);

        // Calcular el total a pagar
        double totalPagar = costoLlamada + impuesto;

        System.out.println("El costo de la llamada es: " + costoLlamada + " euros.");
        System.out.println("El impuesto a pagar es: " + impuesto + " euros.");
        System.out.println("El total a pagar es: " + totalPagar + " euros.");

    }

    // Método para calcular el costo de la llamada según la duración
    private static double calcularCostoLlamada(int duracion) {
        double costo = 0.0;

        if (duracion <= 5) {
            costo = 1.0;
        } else if (duracion <= 8) {
            costo = 1.0 + 0.8 * (duracion - 5);
        } else if (duracion <= 10) {
            costo = 1.0 + 0.8 * 3 + 0.7 * (duracion - 8);
        } else {
            costo = 1.0 + 0.8 * 3 + 0.7 * 2 + 0.5 * (duracion - 10);
        }

        return costo;
    }

    // Método para calcular el impuesto según el día y turno
    private static double calcularImpuesto(int dia, int turno, double costo) {
        double impuesto = 0.0;

        if (dia == 1) { // Es domingo
            impuesto = 0.03 * costo;
        } else if (turno == 1) { // Es otro día en turno de mañana
            impuesto = 0.15 * costo;
        } else { // Es otro día en turno de tarde
            impuesto = 0.10 * costo;
        }

        return impuesto;
    }
    
}

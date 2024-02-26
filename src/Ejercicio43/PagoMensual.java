/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio43;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class PagoMensual {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer pago (en euros):");
        double primerPago = scanner.nextDouble();

        System.out.println("Ingrese el número de meses:");
        int numeroMeses = scanner.nextInt();

        // Calcular el factor de aumento mensual (duplicando cada mes)
        double factorAumento = 2.0;

        // Calcular y mostrar los pagos mensuales y el total
        System.out.println("Pagos mensuales y total después de " + numeroMeses + " meses:");
        double totalPagado = calcularPagosMensuales(primerPago, factorAumento, numeroMeses);
        System.out.println("Total pagado: " + totalPagado + " euros.");

    }

    // Método para calcular los pagos mensuales y el total
    private static double calcularPagosMensuales(double primerPago, double factorAumento, int numeroMeses) {
        double totalPagado = 0.0;
        double pagoActual = primerPago;

        for (int i = 1; i <= numeroMeses; i++) {
            System.out.println("Mes " + i + ": " + pagoActual + " euros");
            totalPagado += pagoActual;
            pagoActual *= factorAumento;
        }

        return totalPagado;
    }
    
}

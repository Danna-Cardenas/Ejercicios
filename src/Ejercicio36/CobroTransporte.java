/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio36;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class CobroTransporte {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso del paquete en kilogramos:");
        double pesoPaquete = scanner.nextDouble();

        System.out.println("Ingrese la zona a la que va dirigido el paquete (1 a 5):");
        int zonaPaquete = scanner.nextInt();

        // Verificar si el peso del paquete es válido
        if (pesoPaquete > 0 && pesoPaquete <= 5) {
            // Calcular y mostrar el cobro por la entrega del paquete
            double costoPorKilogramo = obtenerCostoPorZona(zonaPaquete);
            double costoTotal = pesoPaquete * costoPorKilogramo;
            System.out.println("El costo por la entrega del paquete es: " + costoTotal + " euros.");
        } else {

            System.out.println("El paquete no puede ser transportado debido a su peso.");
        }

    }

    // Método para obtener el costo por kilogramo según la zona
    private static double obtenerCostoPorZona(int zona) {
        switch (zona) {
            case 1: // América del Norte
                return 24.0;
            case 2: // América Central
                return 20.0;
            case 3: // América del Sur
                return 21.0;
            case 4: // Europa
                return 10.0;
            case 5: // Asia
                return 18.0;
            default:
                return 0.0;
        }
    }
    
}

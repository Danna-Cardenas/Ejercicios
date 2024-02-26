/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio30;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class PrecioUva {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de uva (A o B):");
        char tipoUva = scanner.next().charAt(0);

        System.out.println("Ingrese el tamaño de la uva (1 o 2):");
        int tamanoUva = scanner.nextInt();

        // Calcular y mostrar el precio según la política
        double precioInicial = 0.0;
        double precioFinal = 0.0;

        // Establecer el precio inicial según el tipo de uva
        if (tipoUva == 'A') {
            precioInicial = 2.5; // Precio inicial para uva tipo A
        } else if (tipoUva == 'B') {
            precioInicial = 3.0; // Precio inicial para uva tipo B
        } else {
            System.out.println("Tipo de uva no válido.");
            
            return;
        }

        // Calcular el precio final según el tamaño de la uva
        if (tamanoUva == 1) {
            precioFinal = precioInicial + 0.20; // Aumentar 20 céntimos para tamaño 1
        } else if (tamanoUva == 2) {
            precioFinal = precioInicial + 0.30; // Aumentar 30 céntimos para tamaño 2
        } else {
            System.out.println("Tamaño de uva no válido.");
        
            return;
        }
        
        System.out.println("El productor recibirá " + precioFinal + " euros por kilo de uva.");

    }    
}

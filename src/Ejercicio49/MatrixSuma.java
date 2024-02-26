/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio49;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class MatrixSuma {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][5];

        System.out.println("Ingrese 20 números enteros para llenar la matriz (4 filas x 5 columnas):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese el número en la posición [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar la matriz y las sumas parciales
        mostrarMatrizConSumas(matriz);

    }

    // Método para mostrar la matriz y las sumas parciales
    private static void mostrarMatrizConSumas(int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Saltar a la siguiente línea después de cada fila

            // Calcular e imprimir la suma parcial de la fila
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma fila " + (i + 1) + ": " + sumaFila);
        }

        // Calcular e imprimir las sumas parciales de las columnas
        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.print("Suma columna " + (j + 1) + ": " + sumaColumna + "\t");
        }
        
        // Calcular e imprimir la suma total en la esquina inferior derecha
        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        System.out.println("\nSuma total: " + sumaTotal);
    }
    
}

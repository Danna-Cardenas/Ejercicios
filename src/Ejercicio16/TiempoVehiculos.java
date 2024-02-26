/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio16;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class TiempoVehiculos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la distancia entre los vehículos (en km)
        System.out.println("Ingrese la distancia entre los vehículos (en km):");
        double distancia = scanner.nextDouble();

        // Solicitar al usuario la velocidad del vehículo más lento (en km/h)
        System.out.println("Ingrese la velocidad del vehículo más lento (en km/h):");
        double velocidadLenta = scanner.nextDouble();

        // Solicitar al usuario la velocidad del vehículo más rápido (en km/h)
        System.out.println("Ingrese la velocidad del vehículo más rápido (en km/h):");
        double velocidadRapida = scanner.nextDouble();

        // Calcular el tiempo que le tomará al vehículo más rápido alcanzar al otro
        double tiempoAlcance = distancia / (velocidadRapida - velocidadLenta) * 60; // Convertir a minutos

        // Mostrar el tiempo de alcance
        System.out.println("El vehículo más rápido alcanzará al otro en aproximadamente " + tiempoAlcance + " minutos.");

        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio31;

import java.util.Scanner;

/**
 *
 * @author DANNA
 */
public class ViajeEstudios {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de alumnos:");
        int numeroAlumnos = scanner.nextInt();

        // Definir los costos por alumno y el costo fijo por el autobús
        double costoPorAlumno = 0.0;
        double costoFijoAutobus = 0.0;

        // Determinar el costo por alumno según la cantidad de alumnos
        if (numeroAlumnos >= 100) {
            costoPorAlumno = 65.0;
        } else if (numeroAlumnos >= 50 && numeroAlumnos <= 99) {
            costoPorAlumno = 70.0;
        } else if (numeroAlumnos >= 30 && numeroAlumnos <= 49) {
            costoPorAlumno = 95.0;
        } else {
            costoFijoAutobus = 4000.0;
        }

        // Calcular el total a pagar a la compañía de autobuses
        double totalPagarCompania = costoFijoAutobus + (numeroAlumnos * costoPorAlumno);

        // Calcular el costo por alumno
        double costoPorAlumnoFinal = costoFijoAutobus == 0 ? costoPorAlumno : totalPagarCompania / numeroAlumnos;

        System.out.println("El total a pagar a la compañía de autobuses es: " + totalPagarCompania + " euros.");
        System.out.println("Cada alumno debe pagar: " + costoPorAlumnoFinal + " euros.");

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana8;

import java.util.Scanner;

/**
 *
 * @author USERJUL20
 */
public class Dashboard {
    
     private final RegistroEstudiantes registro = new RegistroEstudiantes();
    private final Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        System.out.println("Bienvenido al Sistema de Estudiantes\n");

        int opcion;
        do {
            mostrarMenu();
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1 -> registrarEstudiante();
                case 2 -> mostrarEstudiantes();
                case 0 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    private void mostrarMenu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Registrar estudiante");
        System.out.println("2. Ver lista de estudiantes");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
    }

    private void registrarEstudiante() {
        System.out.print("Nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Nota del estudiante: ");
        double nota = Double.parseDouble(scanner.nextLine());

        Estudiante estudiante = new Estudiante(nombre, nota);
        registro.agregarEstudiante(estudiante);
        System.out.println("Estudiante registrado.");
    }

    private void mostrarEstudiantes() {
        System.out.println("\n--- Lista de Estudiantes ---");
        for (Estudiante e : registro.obtenerEstudiantes()) {
            System.out.println(e);
        }
    }
    
}

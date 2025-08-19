/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea9;

/**
 *
 * @author USERJUL20
 */

//Clase principal para probar el manejo de archivos.

public class TAREA9 {

    public static void main(String[] args) {
        GestorDeArchivo gestor = new GestorDeArchivo();
        ValidadorArchivo validador = new ValidadorArchivo();

        String nombreArchivo = "ejemplo.txt";
        String contenido = "Este es un archivo de prueba.\nAprendiendo POO y excepciones.";

        // Guardar contenido en archivo
        gestor.guardar(nombreArchivo, contenido);

        // Leer contenido del archivo
        String textoLeido = gestor.leer(nombreArchivo);
        System.out.println("Contenido leído:\n" + textoLeido);

        // Validar si el archivo está vacío
        try {
            validador.verificarNoVacio(nombreArchivo);
            System.out.println("El archivo tiene contenido válido.");
        } catch (ArchivoVacioException e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}

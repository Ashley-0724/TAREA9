/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Clase ValidadorArchivo
//Encargada de verificar si un archivo está vacío.
 
/**
 *
 * @author USERJUL20
 */

public class ValidadorArchivo {
    
 
     //Verifica que un archivo no esté vacío.
     //@param nombreArchivo nombre del archivo
     //@throws ArchivoVacioException si el archivo no contiene texto
 
    public void verificarNoVacio(String nombreArchivo) throws ArchivoVacioException {
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            if (lector.readLine() == null) {
                throw new ArchivoVacioException("El archivo '" + nombreArchivo + "' está vacío.");
            }
        } catch (IOException e) {
            System.out.println("Error al verificar el archivo: " + e.getMessage());
        }
    }
    
}

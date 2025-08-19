/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

 //Clase GestorDeArchivo
 //Encargada de guardar y leer archivos de texto.

/* *
 * @author USERJUL20
*/

public class GestorDeArchivo {
    
 //Guarda el contenido en un archivo de texto.
 //@param nombreArchivo nombre del archivo
 //@param contenido texto a escribir en el archivo
    
    public void guardar(String nombreArchivo, String contenido) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) {
            escritor.write(contenido);
            System.out.println("Archivo guardado correctamente: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    
     //Lee el contenido de un archivo de texto línea por línea.
     //@param nombreArchivo nombre del archivo
     // @return contenido del archivo como String
  
    public String leer(String nombreArchivo) {
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return contenido.toString();
    }
}

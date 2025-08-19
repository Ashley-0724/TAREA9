/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea9;

/**
 *
 * @author USERJUL20
 */

//Excepción personalizada que se lanza cuando un archivo está vacío.

public class ArchivoVacioException extends Exception {
    
  
     //Constructor que recibe un mensaje de error.
     //@param mensaje mensaje que describe la causa del error
  
    public ArchivoVacioException(String mensaje) {
        super(mensaje); // Llama al constructor de la clase Exception
    
}
   
}

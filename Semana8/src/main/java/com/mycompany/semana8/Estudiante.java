/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana8;

/**
 *
 * @author USERJUL20
 */
public class Estudiante {
    
    public String nombre;
    public double nota;

     public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    /**
     *
     * @return  */
    public String getNombre() {
        return nombre;
}
    
    public double getNota() {
        return nota;
    }

    public boolean estaAprobado() {
        return nota >= 7.0;
    }
    
      @Override
    public String toString() {
        return nombre + " - Nota: " + nota + " - " + (estaAprobado() ? "Aprobado" : "Reprobado");
    }

}
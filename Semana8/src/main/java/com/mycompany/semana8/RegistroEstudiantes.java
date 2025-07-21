/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana8;

/**
 *
 * @author USERJUL20
 */

import java.util.ArrayList;
import java.util.List;

public class RegistroEstudiantes {
    
    private final List<Estudiante> lista = new ArrayList<>();

    public void agregarEstudiante(Estudiante e) {
        lista.add(e);
    }

    public List<Estudiante> obtenerEstudiantes() {
        return lista;
    }
    
}

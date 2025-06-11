/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librod;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class LibroDAOImpl  {

    private final ArrayList<Object> Libros;

    public void guardar(Libro libro) {
        libros.add(libro);

    }

    public void actualizar(Libro libro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == libro.getId()) {
                libros.set(i, libro);
                return;
            }

        }
    }

    public void eliminar(int id) {
        libros.removeIf(l -> l.getId() == id);
    }

    public List<Libro> obtenerTodo() {
        return libros;
    }
}
    


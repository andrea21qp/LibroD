/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.librod;

/**
 *
 * @author DELL
 */
public class LibroD {

    public static void main(String[] args) {
        LibroDAO libroDAO = new LibroDAOImpl();
        
        //Agregar libro
        libroDAO.guardarLibro(new Libro("El Señor de los Anillos", "L001", "1954"));
        
        // Actualizar un libro 
        libroDAO.actualizarLibro(new Libro("Harry Potter y la Cámara Secreta", "L002", "1998"));
        
        // Eliminar un libro y agregar otro
        libroDAO.eliminarLibro("L001");
        libroDAO.agregarLibro(new Libro("Avatar: El camino del agua", "L004", "2022"));
        
        // Mostrar lista después de actualizar y eliminar
        System.out.println("\n=== Lista de libros actualizada ===");
        for (Libro l : libroDAO.obtenerTodos()) {
            System.out.println(l);
        }
    }

       
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librod;

/**
 *
 * @author DELL
 */
public class Libro {
    
    private int id;
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    //CONSTRUCTOR
    

    public Libro(int id, String titulo, String autor, int añoPublicacion) {
        this(titulo, autor, "145");
    }

    public Libro(String titulo, String autor, String string) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    } 
    @Override
    public String toString() {
        return "Libro{" + super.toString()+"id=" + id + ", titulo=" + titulo + ", autor=" + autor +",añoPublicacion"+ añoPublicacion + '}';
    } 
}

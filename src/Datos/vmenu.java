/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Jhosselyn
 */
public class vmenu {
    
    private int id_menu;
    private String nombre_menu;
    private String descripcion_menu;
    private float precio_menu;

    public vmenu() {
    }

    public vmenu(int id_menu, String nombre_menu, String descripcion_menu, float precio_menu) {
        this.id_menu = id_menu;
        this.nombre_menu = nombre_menu;
        this.descripcion_menu = descripcion_menu;
        this.precio_menu = precio_menu;
    }

    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public String getNombre_menu() {
        return nombre_menu;
    }

    public void setNombre_menu(String nombre_menu) {
        this.nombre_menu = nombre_menu;
    }

    public String getDescripcion_menu() {
        return descripcion_menu;
    }

    public void setDescripcion_menu(String descripcion_menu) {
        this.descripcion_menu = descripcion_menu;
    }

    public float getPrecio_menu() {
        return precio_menu;
    }

    public void setPrecio_menu(float precio_menu) {
        this.precio_menu = precio_menu;
    }
    
    
}

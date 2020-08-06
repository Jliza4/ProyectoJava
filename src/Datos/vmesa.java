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
public class vmesa {
    private int id_mesa;
    private int cantidad_personas_mesa;
    private String ubicacion_mesa;
    private float precio_mesa;
    private String estado;

    public vmesa(int id_mesa, int cantidad_personas_mesa, String ubicacion_mesa, float precio_mesa, String estado) {
        this.id_mesa = id_mesa;
        this.cantidad_personas_mesa = cantidad_personas_mesa;
        this.ubicacion_mesa = ubicacion_mesa;
        this.precio_mesa = precio_mesa;
        this.estado = estado;
    }

    public vmesa() {
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public int getCantidad_personas_mesa() {
        return cantidad_personas_mesa;
    }

    public void setCantidad_personas_mesa(int cantidad_personas_mesa) {
        this.cantidad_personas_mesa = cantidad_personas_mesa;
    }

    public String getUbicacion_mesa() {
        return ubicacion_mesa;
    }

    public void setUbicacion_mesa(String ubicacion_mesa) {
        this.ubicacion_mesa = ubicacion_mesa;
    }

    public float getPrecio_mesa() {
        return precio_mesa;
    }

    public void setPrecio_mesa(float precio_mesa) {
        this.precio_mesa = precio_mesa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}

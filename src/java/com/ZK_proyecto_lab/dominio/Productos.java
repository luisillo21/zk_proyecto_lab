/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ZK_proyecto_lab.dominio;

/**
 *
 * @author Usuario Final
 */
public class Productos {
    private int id_producto;
    private int id_insumo;
    private String nombre;
    private Double costo;
    private Double tiempo_costo;
    private String estado;

    public Productos() {
    }

    public Productos(int id_producto, int id_insumo, String nombre, Double costo, Double tiempo_costo, String estado) {
        this.id_producto = id_producto;
        this.id_insumo = id_insumo;
        this.nombre = nombre;
        this.costo = costo;
        this.tiempo_costo = tiempo_costo;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_insumo() {
        return id_insumo;
    }

    public void setId_insumo(int id_insumo) {
        this.id_insumo = id_insumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getTiempo_costo() {
        return tiempo_costo;
    }

    public void setTiempo_costo(Double tiempo_costo) {
        this.tiempo_costo = tiempo_costo;
    }
    
    
}

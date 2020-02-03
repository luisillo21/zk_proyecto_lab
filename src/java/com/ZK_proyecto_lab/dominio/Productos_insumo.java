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
public class Productos_insumo {
    private int id_detalle;
    private int id_producto;
    private int id_insumo;
    private Double cantidad;
    private Double costo;

    public Productos_insumo() {
    }

    public Productos_insumo(int id_detalle, int id_producto, int id_insumo, Double cantidad, Double costo) {
        this.id_detalle = id_detalle;
        this.id_producto = id_producto;
        this.id_insumo = id_insumo;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
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

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
    
    
}

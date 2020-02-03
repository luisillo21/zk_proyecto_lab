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
public class Insumos {
   private int id_insumo;
   private int id_categoria;
   private String nombre;
   private int id_marca;
   private int id_unidad_medida;
   private Double costo;
   private Double porc_iva;
   private Boolean estado;

    public Insumos() {
    }

    public Insumos(int id_insumo, int id_categoria, String nombre, int id_marca, int id_unidad_medida, Double costo, Double porc_iva, Boolean estado) {
        this.id_insumo = id_insumo;
        this.id_categoria = id_categoria;
        this.nombre = nombre;
        this.id_marca = id_marca;
        this.id_unidad_medida = id_unidad_medida;
        this.costo = costo;
        this.porc_iva = porc_iva;
        this.estado = estado;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public int getId_insumo() {
        return id_insumo;
    }

    public void setId_insumo(int id_insumo) {
        this.id_insumo = id_insumo;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public int getId_unidad_medida() {
        return id_unidad_medida;
    }

    public void setId_unidad_medida(int id_unidad_medida) {
        this.id_unidad_medida = id_unidad_medida;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getPorc_iva() {
        return porc_iva;
    }

    public void setPorc_iva(Double porc_iva) {
        this.porc_iva = porc_iva;
    }
   
   
}

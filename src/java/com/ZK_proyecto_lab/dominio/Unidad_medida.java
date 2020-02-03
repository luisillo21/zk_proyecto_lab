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
public class Unidad_medida {
    private int id_unidad_medida;
    private String nombre;

    public Unidad_medida() {
    }

    public Unidad_medida(int id_unidad_medida, String nombre) {
        this.id_unidad_medida = id_unidad_medida;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_unidad_medida() {
        return id_unidad_medida;
    }

    public void setId_unidad_medida(int id_unidad_medida) {
        this.id_unidad_medida = id_unidad_medida;
    }
    
    
    
}

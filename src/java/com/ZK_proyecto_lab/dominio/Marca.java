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
public class Marca {
    private int id_marca;
    private String nombre;

    public Marca() {
    }

    public Marca(int id_marca, String nombre) {
        this.id_marca = id_marca;
        this.nombre = nombre;
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
    
    
}

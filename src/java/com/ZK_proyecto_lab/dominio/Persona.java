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
public class Persona {
    private int id_persona;
    private String nombre;
    private String apellido;
    private String cedula;

    public Persona(){
    }

    public Persona(int id_persona, String nombre, String apellido, String cedula) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}

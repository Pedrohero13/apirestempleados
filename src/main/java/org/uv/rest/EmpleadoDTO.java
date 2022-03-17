/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.rest;

/**
 *
 * @author pedro
 */
public class EmpleadoDTO {
    private String clave;
    private String nombre;
    private String direccion;
    private String telefono;
    private String clave_depa;

    public EmpleadoDTO(String clave, String nombre, String direccion, String telefono, String clave_depa) {
        this.clave = clave;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.clave_depa = clave_depa;
    }
    

    public String getClave_depa() {
        return clave_depa;
    }

    public void setClave_depa(String clave_depa) {
        this.clave_depa = clave_depa;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

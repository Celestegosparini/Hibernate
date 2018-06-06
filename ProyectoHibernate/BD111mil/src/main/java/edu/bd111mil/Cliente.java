/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bd111mil;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lvidarte
 */
public class Cliente {

    private int nroCliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private boolean activo;
    private List<Telefono>telefonos = new ArrayList<>();
    private List<Factura>facturas = new ArrayList<>();

    public Cliente() {
        super();
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
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

    public String getDireccion() {
        return direccion;
    }
        
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isActivo() {
        return activo;
    }
    
    public List<Telefono> getTelefonos() {
        return this.telefonos;
    }
    
    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }
    
    public List<Factura> getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
    
    @Override
    public String toString() {
        return "Cliente{nombre=" + nombre + ", apellido=" + apellido + "}";
    }

}

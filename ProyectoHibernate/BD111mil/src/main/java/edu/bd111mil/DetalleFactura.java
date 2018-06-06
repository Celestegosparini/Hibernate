/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bd111mil;

import java.io.Serializable;

/**
 *
 * @author lvidarte
 */
public class DetalleFactura implements Serializable {

    private Factura factura;
    private Producto producto;
    private transient int nroItem;
    private transient int cantidad;

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getNroItem() {
        return nroItem;
    }

    public void setNroItem(int nroItem) {
        this.nroItem = nroItem;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void DetalleFactura() {

    }

    public void DetalleFactura(Factura factura, Producto producto, int nroItem, int cantidad) {
        this.factura = factura;
        this.producto = producto;
        this.nroItem = nroItem;
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return "DetalleFactura{factura=" + this.factura.getNroFactura() + 
                ", producto='" + this.producto.getNombre() + "'" + 
                ", nroItem=" + this.nroItem + 
                ", cantidad=" + this.cantidad + "}";
    }
 
}

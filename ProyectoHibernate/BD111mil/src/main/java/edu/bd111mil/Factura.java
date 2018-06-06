/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bd111mil;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lvidarte
 */
public class Factura implements Serializable {

    private int nroFactura;
    private transient Date fecha;
    private transient double totalSinIva;
    private transient double iva;
    private transient double totalConIva;
    private transient Cliente cliente;
    private transient List<DetalleFactura> detalleFactura;

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotalSinIva() {
        return totalSinIva;
    }

    public void setTotalSinIva(double totalSinIva) {
        this.totalSinIva = totalSinIva;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalConIva() {
        return totalConIva;
    }

    public void setTotalConIva(double totalConIva) {
        this.totalConIva = totalConIva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DetalleFactura> getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(List<DetalleFactura> detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    public Factura() {
    }

    public Factura(int nroFactura, Date fecha, double totalSinIva, double iva, double totalConIva, Cliente cliente, List<DetalleFactura> detalleFactura) {
        this.nroFactura = nroFactura;
        this.fecha = fecha;
        this.totalSinIva = totalSinIva;
        this.iva = iva;
        this.totalConIva = totalConIva;
        this.cliente = cliente;
        this.detalleFactura = detalleFactura;
    }
    
    @Override
    public String toString() {
        return "Factura{nroFactura=" + nroFactura + ", fecha=" + fecha + ", totalSinIva=" + totalSinIva + ", totalConIva=" + totalConIva + "}";
    }

}

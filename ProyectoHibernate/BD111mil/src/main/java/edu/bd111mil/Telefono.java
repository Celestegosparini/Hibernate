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
public class Telefono {

    static class Numero implements Serializable {

        private int codigoArea;
        private int nroTelefono;

        public void Numero() {
        }

        public void Numero(int codigoArea, int nroTelefono) {
            this.codigoArea = codigoArea;
            this.nroTelefono = nroTelefono;
        }

        public int getCodigoArea() {
            return this.codigoArea;
        }

        public void setCodigoArea(int codigoArea) {
            this.codigoArea = codigoArea;
        }

        public int getNroTelefono() {
            return this.nroTelefono;
        }

        public void setNroTelefono(int nroTelefono) {
            this.nroTelefono = nroTelefono;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Numero other = (Numero) obj;
            if (this.codigoArea != other.codigoArea) {
                return false;
            }
            if (this.nroTelefono != other.nroTelefono) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 29 * hash + this.codigoArea;
            hash = 29 * hash + this.nroTelefono;
            return hash;
        }

        @Override
        public String toString() {
            return "Numero{codigoArea=" + codigoArea + ", nroTelefono=" + nroTelefono + "}";
        }

    }

    private Numero numero;
    private String tipo;
    private Cliente cliente;

    public void Telefono() {
    }

    public void Telefono(Numero numero, String tipo, Cliente cliente) {
        this.numero = numero;
        this.tipo = tipo;
        this.cliente = cliente;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public Numero getNumero() {
        return this.numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return this.cliente;
    }
}

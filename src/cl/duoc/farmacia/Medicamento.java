/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.farmacia;

import java.util.Date;

/**
 *
 * @author fguajardo
 */
public class Medicamento {
    private String codigo;
    private String nombre;
    private String tipo;
    private int stock;
    private Date caducidad;

    public Medicamento(String codigo, String nombre, String tipo, int stock, Date caducidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.stock = stock;
        this.caducidad = caducidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }
    
    public void vender(Cliente cliente){
        System.out.println("Método que registra la venta del medicamento a un cliente");
        
    }

    @Override
    public String toString() {
        return "Medicamento{" + "codigo=" + codigo + ", nombre=" + nombre + ", tipo=" + tipo + ", stock=" + stock + ", caducidad=" + caducidad + '}';
    }
           
}

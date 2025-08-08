/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.farmacia;

/**
 *
 * @author fguajardo
 */
public class ProveedorFarmaceutico {
    private String codigoProveedor, nombre, medicamentoSuministradoa;

    public ProveedorFarmaceutico() {
    }

    public ProveedorFarmaceutico(String codigoProveedor, String nombre, String medicamentoSuministradoa) {
        this.codigoProveedor = codigoProveedor;
        this.nombre = nombre;
        this.medicamentoSuministradoa = medicamentoSuministradoa;
    }

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedicamentoSuministradoa() {
        return medicamentoSuministradoa;
    }

    public void setMedicamentoSuministradoa(String medicamentoSuministradoa) {
        this.medicamentoSuministradoa = medicamentoSuministradoa;
    }

    @Override
    public String toString() {
        return "ProveedorFarmaceutico{" + "codigoProveedor=" + codigoProveedor + ", nombre=" + nombre + ", medicamentoSuministradoa=" + medicamentoSuministradoa + '}';
    }
    
    
}

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
public class Cliente {
    private String numeroCliente, nombre, medicamentoAdquirido;

    public Cliente() {
    }

    public Cliente(String numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedicamentoAdquirido() {
        return medicamentoAdquirido;
    }

    public void setMedicamentoAdquirido(String medicamentoAdquirido) {
        this.medicamentoAdquirido = medicamentoAdquirido;
    }
    
    public void realizarCompra(Medicamento medicamento){
        medicamento.vender(this);
    }
    
    public void devolverMedicamento(){
        if (medicamentoAdquirido != null) {
            System.out.println(nombre + " devolvió " + medicamentoAdquirido);
            medicamentoAdquirido = null;
        } else {
            System.out.println("No hay medicamento para devolver");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "numeroCliente=" + numeroCliente + ", nombre=" + nombre + ", medicamentoAdquirido=" + medicamentoAdquirido + '}';
    }
    
    
}

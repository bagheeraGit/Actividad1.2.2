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
public class GestionInventario {
    private String medicamentoActual, clienteActual, proveedorActual;

    public GestionInventario() {
    }

    public GestionInventario(String medicamentoActual, String clienteActual, String proveedorActual) {
        this.medicamentoActual = medicamentoActual;
        this.clienteActual = clienteActual;
        this.proveedorActual = proveedorActual;
    }

    public String getMedicamentoActual() {
        return medicamentoActual;
    }

    public void setMedicamentoActual(String medicamentoActual) {
        this.medicamentoActual = medicamentoActual;
    }

    public String getClienteActual() {
        return clienteActual;
    }

    public void setClienteActual(String clienteActual) {
        this.clienteActual = clienteActual;
    }

    public String getProveedorActual() {
        return proveedorActual;
    }

    public void setProveedorActual(String proveedorActual) {
        this.proveedorActual = proveedorActual;
    }

    @Override
    public String toString() {
        return "GestionInventario{" + "medicamentoActual=" + medicamentoActual + ", clienteActual=" + clienteActual + ", proveedorActual=" + proveedorActual + '}';
    }
    
    public void registrarMedicamento(Medicamento medicamento){
        medicamentoActual = medicamento.getNombre();
        System.out.println("Medicamento registrado: " + medicamentoActual);
    }
    
    public void registrarCliente(Cliente cliente){
        clienteActual = cliente.getNombre();
        System.out.println("Cliente registrado: " + clienteActual);
    }
    
    public void generarInformeVentas(){
        System.out.println("\n-- Informe de Operaciones --");
        System.out.println("Último medicamento registrado: " + medicamentoActual);
        System.out.println("Último cliente registrado: " + clienteActual);
    }
}

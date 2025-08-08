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
public class Farmacia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo instancias
        Medicamento med1 = new Medicamento("M001", "Paracetamol", "Analgésico", 20, new Date());
        Cliente cli1 = new Cliente("C001", "Juan Pérez");
        ProveedorFarmaceutico prov1 = new ProveedorFarmaceutico("P001", "Laboratorios XYZ");
        GestionInventario sistema = new GestionInventario();

        // Registrar datos en el sistema
        sistema.registrarMedicamento(med1);
        sistema.registrarCliente(cli1);


        // Operaciones de venta y reposición
        cli1.realizarCompra(med1);
        cli1.devolverMedicamento();

        // Generar informe final
        sistema.generarInformeVentas();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import consulta.Cliente;
import consulta.Consulta;
import consulta.Mascota;
import consulta.Veterinario;
import factura.DetalleFactura;
import factura.Factura;
import factura.Producto;
import historial.DetalleClinico;
import historial.HistorialClinico;

/**
 *
 * @author Brian Cardenas
 */
public class Hospital {
    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente(123456, "Luvier", "Orjuela", 20);
        Mascota perro1 = new Mascota(1, "Perro", "Pincher", "Toli");
        
        cliente1.addMacosta(perro1);
        
        Veterinario veterinario1 = new Veterinario("Dermatologo", 500000, 987456, "Felipe", "Hernandez", 40);
        
        Consulta consulta1 = new Consulta(40, "El perro presenta infección en la piel");
        
        consulta1.relacionConObjetos(perro1, veterinario1);
        DetalleClinico detalleC1 = new DetalleClinico(consulta1);
        HistorialClinico historial1 = new HistorialClinico(detalleC1);
        
        Producto producto1 =new Producto("ARTRIN BROUWER", 730000);
        Producto producto2 = new Producto("BRAVECTO", 82100);
        
        DetalleFactura detallefac1 = new DetalleFactura(producto1, 4);
        DetalleFactura detallefact2 = new DetalleFactura(producto2, 2);
        
        
        Factura factura1 = new Factura(1, consulta1);
        
        factura1.addDetalleFactura(detallefac1);
        factura1.addDetalleFactura(detallefact2);
        
        System.out.println(factura1);
        System.out.println("-------------------------------------");
        veterinario1.calcularSueldo();
        
        
        
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factura;

import consulta.Consulta;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Brian Cardenas
 */
public class Factura {
    
    private LocalDate fecha;
    private long nReferencia;
    private Consulta consulta;
    private double precioTotal = 20000;
    private List<DetalleFactura> detallesFacturas;

    public Factura(long nReferencia, Consulta consulta) {
        this.fecha = LocalDate.now();
        this.nReferencia = nReferencia;
        this.consulta = consulta;
        this.detallesFacturas = new ArrayList<>();
    }
    
    
    public void addDetalleFactura(DetalleFactura detalleFactura){
        getDetallesFacturas().add(detalleFactura);
        detalleFactura.setFactura(this);
        
        AumentarPrecioTotal(detalleFactura.getPrecioDetalle());
    }

    public long getnReferencia() {
        return nReferencia;
    }

    public List<DetalleFactura> getDetallesFacturas() {
        return detallesFacturas;
    }
    
    public void AumentarPrecioTotal(double precioDetalle){
        this.precioTotal += precioDetalle;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Facturas: ").append("\n");
        sb.append("Fecha: ").append(fecha).append("\n");
        sb.append("nReferencia: ").append(getnReferencia()).append("\n");
        sb.append("DetallesFacturas: ").append("\n\n");
        for(DetalleFactura detalle : detallesFacturas){
            sb.append(detalle).append("\n");
        }
        sb.append("\n");
        sb.append("PrecioConsulta: ").append("20000.").append("\n");
        sb.append("PrecioTotal: ").append(precioTotal);
        return sb.toString();
    }
        
}

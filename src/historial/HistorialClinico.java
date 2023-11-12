/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package historial;

import consulta.Mascota;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Brian Cardenas
 */
public class HistorialClinico {
    
    private long nReferencia;
    private Mascota mascota;
    private List<DetalleClinico> DetallesH;

    public HistorialClinico(DetalleClinico detalleClinico) {
        this.nReferencia = detalleClinico.getConsulta().getMascota().getIdMascota();
        this.mascota = detalleClinico.getConsulta().getMascota();
        this.DetallesH = new ArrayList<>();
        addDetalle(detalleClinico);
    }
    
    private void addDetalle(DetalleClinico detalleClinico){
        this.DetallesH.add(detalleClinico);
        detalleClinico.setHistorialClinico(this);
    }

    public long getnReferencia() {
        return nReferencia;
    }

    public void setnReferencia(long nReferencia) {
        this.nReferencia = nReferencia;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public List<DetalleClinico> getDetallesH() {
        return DetallesH;
    }

    public void setDetallesH(List<DetalleClinico> DetallesH) {
        this.DetallesH = DetallesH;
    }
    
    @Override
    public String toString(){
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("HistorialClinico: ").append("\n");
        sb.append("nReferencia: ").append(nReferencia).append("\n");
        sb.append("mascota: ").append(mascota.getNombre()).append("\n");
        sb.append("cliente: ").append(mascota.getCliente().getNombre()).append("\n");
        sb.append("DetallesH: ").append("\n");
        
        for(DetalleClinico detalle : DetallesH){
            
            sb.append("\n").append(detalle);
        }
        return sb.toString();
    }
    
    
}

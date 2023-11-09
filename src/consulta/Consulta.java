/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consulta;

import factura.Factura;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author Brian Cardenas
 */
public class Consulta {
    
    private LocalDateTime fecha;
    private long idConsulta;
    private Veterinario veterinario;
    private Mascota mascota;
    private String descripción;
    private Factura factura;

    public Consulta(long idConsulta, String descripción) {
        this.fecha = LocalDateTime.now();
        this.idConsulta = idConsulta;
        this.descripción = descripción;
    }
    
    public Consulta (int anio, int mes, int dia, int hora, int minuto, long idConsulta, String descripción){
        this.fecha = LocalDateTime.of(anio, mes, dia, hora, minuto);
        this.idConsulta = idConsulta;
        this.descripción = descripción;
        
    }

    /**
     * @return the fecha
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the idConsulta
     */
    public long getIdConsulta() {
        return idConsulta;
    }

    /**
     * @param idConsulta the idConsulta to set
     */
    public void setIdConsulta(long idConsulta) {
        this.idConsulta = idConsulta;
    }

    /**
     * @return the veterinario
     */
    public Veterinario getVeterinario() {
        return veterinario;
    }

    /**
     * @param veterinario the veterinario to set
     */
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    /**
     * @return the mascota
     */
    public Mascota getMascota() {
        return mascota;
    }

    /**
     * @param mascota the mascota to set
     */
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    /**
     * @return the descripción
     */
    public String getDescripción() {
        return descripción;
    }

    /**
     * @param descripción the descripción to set
     */
    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    /**
     * @return the factura
     */
    public Factura getFactura() {
        return factura;
    }

    /**
     * @param factura the factura to set
     */
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    
    public void relacionConObjetos(Mascota mascota, Veterinario veterinario){
        
        mascota.getConsultas().add(this);
        setMascota(mascota);
        setVeterinario(veterinario);
        veterinario.getConsultas().add(this);
    }
    
    
}

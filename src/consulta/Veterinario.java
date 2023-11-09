
package consulta;

import clasespadre.Empleado;
import java.util.ArrayList;
import java.util.List;

public class Veterinario extends Empleado{
    
    private String especialidad;
    private List<Consulta> consultas;

    public Veterinario(String especialidad, double sueldo, long cedula, String nombre, String apellido, int edad) {
        super(sueldo, cedula, nombre, apellido, edad);
        this.especialidad = especialidad;
        this.consultas= new ArrayList<>();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
    
    @Override
    public void calcularSueldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}

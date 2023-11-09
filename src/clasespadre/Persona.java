
package clasespadre;

/**
 *
 * @author Brian Cardenas
 */
public abstract class Persona {
    
    private long cedula;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(long cedula, String nombre, String apellido, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    /**
     * @return the cedula
     */
    public long getCedula() {
        return cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }
    
    @Override
     public String toString(){
         return "Persona";
     }
    
}

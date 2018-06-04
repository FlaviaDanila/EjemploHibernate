
package cfs003.ejemplohibernate;

/**
 *
 * @author Yaki's
 */

public class Cliente {
    
    private int nroCliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private boolean activo;

    public Cliente(){ 
        super();
    }

    public int getNroCliente() {
        return this.nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean getActivo() {
        return this.activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    
    
}

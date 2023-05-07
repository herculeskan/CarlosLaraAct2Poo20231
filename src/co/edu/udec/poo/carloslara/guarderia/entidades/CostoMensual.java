package co.edu.udec.poo.carloslara.guarderia.entidades;
import co.edu.udec.poo.carloslara.guarderia.entidades.Tutor;
import java.util.List;
public class CostoMensual extends Persona{
    public CostoMensual(String dni) {
        this.dni = dni;
    }

    /*
        Programa que se conecta a costo mensual
         */
    private String dni;
    private String nombre;

    public CostoMensual(String dni, String nombre, String direccion, String telefono, String dni1) {
        super(dni, nombre, direccion, telefono);
        this.dni = dni1;
    }

    @Override
    public String toString() {
        return "CostoMensual{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cuentaCorriente='" + cuentaCorriente + '\'' +
                ", autorizados=" + autorizados +
                '}';
    }

    private String direccion;
    private String telefono;
    private String cuentaCorriente;
    private List<Tutor> autorizados;

    public CostoMensual() {
    }


    public CostoMensual(String dni, String nombre, String direccion, String telefono, String cuentaCorriente, List<Tutor> autorizados) {
        super();
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cuentaCorriente = cuentaCorriente;
        this.autorizados = autorizados;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(String cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    public List<Tutor> getAutorizados() {
        return autorizados;
    }

    public void setAutorizados(List<Tutor> autorizados) {
        this.autorizados = autorizados;
    }
}
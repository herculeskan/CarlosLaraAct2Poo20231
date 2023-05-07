package co.edu.udec.poo.carloslara.guarderia.entidades;
import java.util.Date;
import java.util.List;

public class Asistencia extends  Nino{
    private Date fecha;
    private String hora;

    @Override
    public String toString() {
        return "Asistencia{" +
                "fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", estado='" + estado + '\'' +
                ", nino=" + nino +
                ", menu=" + menu +
                '}';
    }

    public Asistencia(Persona persona, String relacion, int numMatricula, String nombre, Date fechaNacimiento, Date fechaIngreso, Date fechaBaja, CostoMensual costoMensual, List<Ingrediente> alergias, List<Asistencia> asistencias, Date fecha) {
        super(persona, relacion, numMatricula, nombre, fechaNacimiento, fechaIngreso, fechaBaja, costoMensual, alergias, asistencias);
        this.fecha = fecha;
    }

    private String estado;
    private Nino nino;
    private Menu menu;
    public Asistencia(Date fecha, String hora, String estado, Nino nino) {
        super();
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.nino = nino;
    }

    public Asistencia() {

    }

    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Nino getNino() {
        return nino;
    }
    public void setNino(Nino nino) {
        this.nino = nino;
    }
}
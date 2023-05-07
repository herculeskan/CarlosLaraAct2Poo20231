package co.edu.udec.poo.carloslara.guarderia.entidades;

import co.edu.udec.poo.carloslara.guarderia.entidades.Tutor;
import java.util.Date;
import java.util.List;

public class Nino extends Persona{

    /*
    Programa que se conecta a Persona
     */
    private int numMatricula;
    private String nombre;
    private Date fechaNacimiento;
    private Date fechaIngreso;
    private Date fechaBaja;
    private CostoMensual costoMensual;
    private List<Ingrediente> alergias;
    private List<Asistencia> asistencias;

    public Nino(Persona persona, String relacion, int numMatricula, String nombre, Date fechaNacimiento, Date fechaIngreso, Date fechaBaja, CostoMensual costoMensual, List<Ingrediente> alergias, List<Asistencia> asistencias) {
        super(persona, relacion);
        this.numMatricula = numMatricula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.fechaBaja = fechaBaja;
        this.costoMensual = costoMensual;
        this.alergias = alergias;
        this.asistencias = asistencias;
    }

    public Nino() {
        super();
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public CostoMensual getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(CostoMensual costoMensual) {
        this.costoMensual = costoMensual;
    }

    public List<Ingrediente> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<Ingrediente> alergias) {
        this.alergias = alergias;
    }

    public List<Asistencia> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(List<Asistencia> asistencias) {
        this.asistencias = asistencias;
    }

    @Override
    public String toString() {
        return "Nino{" +
                "numMatricula=" + numMatricula +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaBaja=" + fechaBaja +
                ", costoMensual=" + costoMensual +
                ", alergias=" + alergias +
                ", asistencias=" + asistencias +
                '}';
    }
}
package co.edu.udec.poo.carloslara;

import co.edu.udec.poo.carloslara.guarderia.crud.CostoMensualCrud;
import co.edu.udec.poo.carloslara.guarderia.entidades.*;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Carlos Esteban Lara gil
 * @version 1.0
 * Lo siguiente comentado es el diagrama de clases hecho de la forma de plant text
 * classDiagram
 * class Persona {
 *     +dni: String
 *     +nombre: String
 *     +direccion: String
 *     +telefono: String
 * }
 *
 * class Menu {
 *     +id: int
 *     +platos: List<Plato>
 * }
 *
 * class Plato {
 *     +nombre: String
 *     +ingredientes: List<Ingrediente>
 * }
 *
 * class Ingrediente {
 *     +nombre: String
 * }
 *
 * class Tutor {
 *     +persona: Persona
 *     +relacion: String
 * }
 *
 * class CostoMensual {
 *     +dni: String
 *     +nombre: String
 *     +direccion: String
 *     +telefono: String
 *     +cuentaCorriente: String
 *     +autorizados: List<Tutor>
 * }
 *
 * class Nino {
 *     +numMatricula: int
 *     +nombre: String
 *     +fechaNacimiento: Date
 *     +fechaIngreso: Date
 *     +fechaBaja: Date
 *     +costoMensual: CostoMensual
 *     +alergias: List<Ingrediente>
 *     +asistencias: List<Asistencia>
 * }
 *
 * class Asistencia {
 *     +fecha: Date
 *     +menu: Menu
 * }
 *
 * Persona <|-- Tutor
 * Persona <|-- CostoMensual
 * Ingrediente <-- Plato
 * Plato <-- Menu
 * Tutor --> Nino : autoriza
 * CostoMensual --> Nino : paga por
 * Nino --> Tutor : tiene como tutor
 * Nino --> Asistencia : asiste
 * Asistencia --> Menu : consume
 * Plato --> Ingrediente : contiene
 */


public class Principal {

    public static void main(String[] args) {
            /* =================================0
    Invocando Getters y setters de entidades humanas
            ====================================
             */

        Nino nino = new Nino();
        nino.setNombre("Carlos");
        nino.setNumMatricula(123);
        nino.setFechaIngreso(null);
        nino.setFechaBaja(null);
        nino.setFechaNacimiento(null);
        nino.setCostoMensual(null);
        nino.setAlergias(null);
        nino.setAsistencias(null);


        Persona persona = new Persona();
        persona.setDireccion("calle 123");
        persona.setDni("123");
        persona.setNombre("Carlos");
        persona.setTelefono("123");
        Tutor tutor = new Tutor();

        /*
        Invocando Getters y setters de entidades no humanas, pato, persona y demás
         */
        Plato plato = new Plato();

        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(new Ingrediente("papa","pollo","Verdura"));
        ingredientes.add(new Ingrediente("Pesscado","arroz","Piña"));
        Menu menu = new Menu();

/*
Operaciones
 */
        CostoMensual costoMensual = new CostoMensual();
        costoMensual.setAutorizados(null);
        costoMensual.setCuentaCorriente("123");
        costoMensual.setDireccion("calle 123");
        costoMensual.setDni("123");
        costoMensual.setNombre("Carlos");
        costoMensual.setTelefono("123");


    }
    /*
    Paso 11: EN la clase principal
     */
    CostoMensualCrud costoMensualCrud = new CostoMensualCrud();

    public CostoMensualCrud getCostoMensualCrud() {
        return costoMensualCrud;
    }

}

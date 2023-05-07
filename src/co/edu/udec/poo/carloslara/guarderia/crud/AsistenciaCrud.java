package co.edu.udec.poo.carloslara.guarderia.crud;

import co.edu.udec.poo.carloslara.guarderia.entidades.Asistencia;

import java.util.ArrayList;
import java.util.List;

public class AsistenciaCrud {

    /*
    Acá estaba mal la documentación del profe en la zona private list
     */
     ArrayList<AsistenciaCrud> asistenciaCrud = new ArrayList<>();
    
    public void agregar(AsistenciaCrud agregarCrud ){
        asistenciaCrud.add(agregarCrud);
        
    }
    

    public static AsistenciaCrud buscar(Integer id) throws Exception {
        return null;
    }

    public static void editar(AsistenciaCrud asistenciaCrud) throws Exception {
    }

    public static void eliminar(AsistenciaCrud asistenciaCrud) throws Exception {
    }

    public static List<Asistencia> listarTodo() throws Exception {
        return null;
    }

    public static Integer contar() throws Exception {
        return null;
    }

}

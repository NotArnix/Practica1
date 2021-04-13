import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Proyecto {
    String nombre;
    Map<String,Tarea> tareas;
    Map<String,Personas> personas;

    Proyecto(){
        super();
    }
    Proyecto iniciarProyecto(String nombre){
        asignarNombreProyecto(nombre);
        tareas=new HashMap<String, Tarea>();
        personas=new HashMap<String, Personas>();
        return this;
    }
    void asignarNombreProyecto(String nombre){
        this.nombre=nombre;
    }
    String getNombre(){
        return nombre;
    }
    Map<String,Tarea> getTareas(){return tareas;}
    Map<String,Personas> getPersonas(){return personas;}
    void darAltaPersona(Personas persona){
        personas.put(persona.getCorreo(),persona);
    }
    void darAltaTarea(Tarea tarea){
        tareas.put(tarea.getTitulo(),tarea);
    }
    void marcarTarea(String título){
        tareas.get(título).finalizacion();
    }
    void introducir(String título,String correo){
        Personas persona=personas.get(correo);
        Tarea tarea=tareas.get(título);
        persona.introducirTarea(tarea);
        tarea.añadirPersona(persona);
    }
    void eliminar(String título,String correo) {
        if (comprobacionesEliminar(título,correo)){
            Personas persona = personas.get(correo);
            Tarea tarea = tareas.get(título);
            tarea.eliminarPersona(persona);
            persona.eliminarTarea(tarea);
        }
    }
    boolean comprobacionesEliminar(String título,String correo){
        if (!personas.containsKey(correo)){
            System.out.println("La persona debe estar en el proyecto");
            return false;
        }
        if (!tareas.containsKey(título)){
            System.out.println("La tarea debe estar en el proyecto");
            return false;
        }
        return true;
    }
    List<Personas> listaPersonas(){
        return new listarObjetosMapa<Personas>().devolverLista(personas);
    }
    List<Tarea> listaTareas(){
        return new listarObjetosMapa<Tarea>().devolverLista(tareas);
    }
    boolean comprobaciónPersonaEnProyecto(String correo){
        if (getPersonas().containsKey(correo)){
            return true;
        }
        return false;
    }
}

import java.util.*;


public class Personas {
    private String nombre;
    private String correo;
    private Map<String,Tarea> tareas;

    public Personas(){
        super();
        iniciarTareas();
    }
    Personas crearPersona(){
    asignarCorreo(new pedirDatosPersonas().pedirCorreo());
    asignarNombre(new pedirDatosPersonas().pedirNombre());
    return this;
    }
    void asignarCorreo(String correo){
        this.correo=correo;
    }
    void asignarNombre(String nombre){
        this.nombre=nombre;
    }
    void iniciarTareas(){
        this.tareas=new HashMap<>();
    }
    String getCorreo(){
        return correo;
    }
    void crear(String nombre){

    }
    void introducirTarea(Tarea tarea){
        tareas.put(tarea.getTitulo(),tarea);
    }
    void eliminarTarea(Tarea tarea){
        tareas.remove(tarea.getTitulo()); }
    public String toString(){
        StringBuilder salida=new StringBuilder();
        salida.append("Datos de persona:\n");
        salida.append("\tnombre: " + nombre+"\n");
        salida.append("\tcorreo: " + correo+"\n");
        salida.append("\t"+toStringTareas() + "\n");
        return salida.toString();
    }
    String toStringTareas(){
        StringBuilder salida=new StringBuilder();
        salida.append("Lista de tareas:\n");
        for (String tarea:tareas.keySet()){
            salida.append("\t-" + tarea.toString()+"\n");
        }
        return salida.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personas personas = (Personas) o;
        return correo.equals(personas.correo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correo);
    }
}

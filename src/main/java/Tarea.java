import java.util.*;
import java.util.List;

public class Tarea {
    private String titulo;
    private String descripcion;
    private HashMap<String, Personas> personas;
    private String responsable;
    private int prioridad;
    private String creacion;
    private String finalizacion;
    private List<String> etiquetas;
    private Resultado resultado;

    public Tarea(){
        super();
        inicializarPersonas();
        inicializarFinalizar();
    }
    Tarea crearTarea(){
        asignarTitulo(new pedirDatosTareas().pedirTítulo());
        asignarDescripcion(new pedirDatosTareas().pedirDescripción());
        asignarCreacion(new pedirDatosTareas().pedirFechaCreación());
        asignarPrioridad(new pedirDatosTareas().pedirPrioridad());
        asignarEtiquetas(new pedirDatosTareas().pedirEtiqueta());
        asignarPersonas(new pedirDatosTareas().pedirCorreo());
        asignarResponsable(new pedirDatosTareas().pedirResponsable(this));
        asignarResultado(new creaTipo().obtenerTipo().creaResultado());
        return this;
    }
    void asignarTitulo(String titulo){ this.titulo = titulo; }
    void asignarDescripcion(String descripcion){ this.descripcion = descripcion; }
    void asignarCreacion(String creacion){ this.creacion = creacion; }
    void asignarPrioridad(int prioridad){
        this.prioridad=prioridad;
    }
    void inicializarFinalizar(){
        finalizacion="";
    }
    void asignarEtiquetas(List<String> etiquetas){
        this.etiquetas=etiquetas;
    }
    void asignarPersonas(HashMap<String,Personas> personas){
        this.personas=personas;
    }
    void inicializarPersonas(){
        personas=new HashMap<String,Personas>();
    }
    void añadirTareaA(String responsable){
        Aplicación.proyecto.personas.get(responsable).introducirTarea(this);
    }
    void asignarResponsable(String responsable){
        this.responsable=responsable;
        añadirTareaA(responsable);
        }
    void asignarResultado(Resultado resultado){
        this.resultado=resultado;
    }
    void finalizacion() {
        Date objDate = new Date();
        this.finalizacion = objDate.toString();
    }
    void añadirPersona(Personas persona){ this.personas.put(persona.getCorreo(), persona); }

    void eliminarPersona(Personas persona){ this.personas.remove(persona.getCorreo()); }

    String getTitulo(){ return this.titulo; }

    boolean finalizado(){ return (!this.finalizacion.equals("")); }


    boolean comprobacionResponsable(String responsable){
        if(this.personas.containsKey(responsable))
            return true;
        return false;
    }


    public String toString(){
        StringBuilder salida=new StringBuilder();
        salida.append("Datos de las tarea: \n");
        salida.append(toStringTítulo());
        salida.append(toStringPersonas());
        salida.append(toStringFinalizado());
        salida.append(toStringResultado());
        return salida.toString();
    }

    private String toStringResultado() {
        return "Resultado: " + resultado + "\n";
    }

    private String toStringFinalizado() {
        return "Estado: " + ((finalizado()) ? "Finalizada" : "No finalizada")+"\n";
    }

    private String toStringPersonas() {
        StringBuilder salida=new StringBuilder();
        salida.append("Lista de personas(En mayúsculas el responsable):\n");
        for (String persona:personas.keySet()){
            salida.append("\t-" + destacarResponsable(persona) + "\n");
        }
        return salida.toString();
    }
    String destacarResponsable(String persona){
        if (persona.equals(responsable))
            persona=persona.toUpperCase(Locale.ROOT);
        return persona;
    }

    private String toStringTítulo() {
        return "Título: " + titulo + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarea tarea = (Tarea) o;
        return titulo.equals(tarea.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}

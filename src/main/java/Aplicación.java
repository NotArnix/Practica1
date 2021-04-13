import java.util.Locale;
import java.util.Scanner;

public class Aplicación {
    static Proyecto proyecto;
    Scanner teclado=new Scanner(System.in);
    public Aplicación() {
        super();
    }

    void ejecuta() {
        teclado.useLocale(Locale.US);
        Menu option;
        do {
            int intOption=opciónVálida();
            option = Menu.getOpcion(intOption);
            if (comprobar(option))
                filtraOpcion(option);
        } while (option != Menu.SALIR);
    }

    private void filtraOpcion(final Menu opcion) {
        switch (opcion) {
            case INICIAR_PROYECTO:
                proyecto=new Proyecto().iniciarProyecto(new pedirDatosProyecto().pedirNombre());
                break;
            case DAR_ALTA_PERSONA:
                proyecto.darAltaPersona(new Personas().crearPersona());
                break;
            case DAR_ALTA_TAREA:
                proyecto.darAltaTarea(new Tarea().crearTarea());
                break;
            case MARCAR_TAREA:
                proyecto.marcarTarea(new pedirDatosTareas().pedirTítulo());
                break;
            case INTRODUCIR_PERSONA_TAREA:
                proyecto.introducir(new pedirDatosTareas().pedirTítulo(),new pedirDatosPersonas().pedirCorreo());
                break;
            case ELIMINAR_PERSONA_TAREA:
                proyecto.eliminar(new pedirDatosTareas().pedirTítulo(),new pedirDatosPersonas().pedirCorreo());
                break;

            case LISTAR_PERSONAS:
                System.out.println("Lista de personas:\n" + (new listarObjetosMapa<Personas>().mostrarLista(proyecto.listaPersonas())));
                break;

            case LISTAR_TAREAS:
                System.out.println("Lista de tareas:\n"+ (new listarObjetosMapa<Tarea>().mostrarLista(proyecto.listaTareas())));
                break;

            /*case PERSONAS_SIN_ASIGNAR:("Lista de personas:\n");
                break;

            case TAREAS_SIN_ASIGNAR:("Lista de tareas:\n");
                break;*/
            case SALIR:
                salir();
                break;
        }
    }
    void salir(){
        System.out.println("Se cierra");
    }
    int opciónVálida(){
        int intOption;
        do {
            System.out.println(Menu.getMenu());
            System.out.print("Introduce una opción: ");
            intOption = teclado.nextInt();
        }
        while (intOption<0 || intOption >9);
        return intOption;
    }
    boolean comprobar(Menu option){
        if (existeProyectoAntes(option))
            if (existenPersonasAntes(option))
                if(existenTareasAntes(option))
                    return true;
        return false;
    }

    boolean existeProyectoAntes(Menu option){
        if (option!=Menu.INICIAR_PROYECTO && proyecto==null){
            System.out.println("Primero debes crear un proyecto");
            return false;
        }
        return true;
    }
    boolean existenPersonasAntes(Menu option){
        if ((option==Menu.DAR_ALTA_TAREA || option==Menu.INTRODUCIR_PERSONA_TAREA) && proyecto.personas.size()==0){
            System.out.println("Para dar de alta tareas debe haber primero personas");
            return false;
        }
        return true;
    }
    boolean existenTareasAntes(Menu option){
        if (option==Menu.MARCAR_TAREA && proyecto.tareas.size()==0){
            System.out.println("Para marcar tareas debe haber primero tareas");
            return false;
        }
        return true;
    }
}

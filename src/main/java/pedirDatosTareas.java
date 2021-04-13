import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class pedirDatosTareas extends pedirDatos{
    static Tarea tarea;
    String pedirTítulo(){
        System.out.print("Dame el título de la tarea: ");
        return new pedirDatos().pedirDato();
    }
    String pedirDescripción(){
        System.out.print("Dame su descripción: ");
        return pedirDato();
    }
    String pedirResponsable(Tarea tarea){
        String responsable;
        while (true){
            System.out.print("Dame su responsable: ");
            responsable=pedirDato();
            if (tarea.comprobacionResponsable(responsable))
                break;
            System.out.println("Ese responsable no forma parte de la tarea");
        }
        return responsable;
    }
    int pedirPrioridad(){
        int prioridad;
        do {
            System.out.println("Debe estar compremdido entre 1 y 5");
            System.out.print("Dame su prioridad: ");
            prioridad= Integer.parseInt(pedirDato());
        }
        while (prioridad<1 || prioridad>5);
        return prioridad;
    }
    String pedirFechaCreación(){
        System.out.print("Dame su fecha de creación: ");
        return pedirDato();
    }
    List<String> pedirEtiqueta(){
        List<String> etiquetas=new ArrayList<>();
        while (true){
            System.out.println("Poner 'FIN' para acabar");
            System.out.print("Dame una etiqueta (Dar de una en una): ");
            String etiqueta=pedirDato();;
            if (etiqueta.equals("FIN"))
                break;
            etiquetas.add(etiqueta);
        }
        return etiquetas;
    }
    HashMap<String,Personas> pedirCorreo(){
        HashMap<String,Personas> personas=new HashMap<String,Personas>();
        while (true){
            System.out.println("Poner 'FIN' para acabar (Se necesita al menos una persona)");
            String correo=new pedirDatosPersonas().pedirCorreo();
            if (personas.size()>0&&correo.equals("FIN"))
                break;
            if (Aplicación.proyecto.comprobaciónPersonaEnProyecto(correo)){
                personas.put(correo, Aplicación.proyecto.getPersonas().get(correo));
            }
            else{
                System.out.println("Esa persona no está en el proyecto");
            }
        }
        System.out.print("Dame el correo de las personas del proyecto (Dar de una en una): ");
        return personas;
    }


}

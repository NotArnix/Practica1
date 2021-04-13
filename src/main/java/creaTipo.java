import java.util.Scanner;

public class creaTipo {
    Resultado obtenerTipo(){
        System.out.println(MenuResultado.getMenu());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elije una opción: ");
        byte opcion = scanner.nextByte();
        MenuResultado opcionMenu = MenuResultado.getOpcion(opcion);
        switch (opcionMenu){
            case TIPO_DOCUMENTACION:
                Documentacion documento = new Documentacion();
                documento.setFormato(new pedirDatosResultado().pedirFormato());
                documento.setPaginas(new pedirDatosResultado().pedirPáginas());
                documento.setEspacioUsado(new pedirDatosResultado().pedirEspacioOcupado());
                return documento;
            case TIPO_PROGRAMA:
                Programa programa = new Programa();
                programa.setLenguajeEmpleado(new pedirDatosResultado().pedirLenguajeEmpleado());
                programa.setNumLineas(new pedirDatosResultado().pedirNumLineas());
                programa.setNumModulos(new pedirDatosResultado().pedirNumModulos());
                return programa;
            default:
                PaginaWeb paginaWeb = new PaginaWeb();
                paginaWeb.setTipoPagina(new pedirDatosResultado().pedirTipoPagina());
                paginaWeb.setLenguaje(new pedirDatosResultado().pedirLenguajeEmpleado());
                paginaWeb.setBackEnd(new pedirDatosResultado().pedirBackEnd());
                return paginaWeb;
        }
    }
}

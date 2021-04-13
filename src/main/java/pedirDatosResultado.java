public class pedirDatosResultado extends pedirDatos{
    String pedirIdentificador(){
        System.out.print("Dame el identificador de la tarea: ");
        return pedirDato();
    }

    int pedirHorasEsperadas(){
        System.out.print("Dame las horas esperadas: ");
        return comprobarEntero(pedirDato());
    }

    String pedirProposito(){
        System.out.print("Dame el proposito de la tarea: ");
        return pedirDato();
    }

    String pedirFormato(){
        System.out.print("Dame el formato del documento: ");
        return pedirDato();
    }

    int pedirPáginas(){
        System.out.print("Dame las páginas del documento: ");
        return comprobarEntero(pedirDato());
    }

    int pedirEspacioOcupado(){
        System.out.print("Dame el espacio ocupado por el documento: ");
        return comprobarEntero(pedirDato());
    }

    String pedirLenguajeEmpleado(){
        System.out.print("Dame el lenguaje empleado: ");
        return pedirDato();
    }

    int pedirNumLineas(){
        System.out.print("Dame el número de líneas del programa: ");
        return comprobarEntero(pedirDato());
    }

    int pedirNumModulos(){
        System.out.print("Dame el número de módulos del programa: ");
        return comprobarEntero(pedirDato());
    }

    String pedirTipoPagina(){
        System.out.print("Dame el tipo de la página: ");
        return pedirDato();
    }
    String pedirBackEnd(){
        System.out.print("Dame el Back End de la página: ");
        return pedirDato();
    }
}

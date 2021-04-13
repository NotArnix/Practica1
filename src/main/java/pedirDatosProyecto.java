public class pedirDatosProyecto extends pedirDatos{
    String pedirNombre(){
        System.out.print("Dame un nombre para el proyecto: ");
        return new pedirDatos().pedirDato();
    }
}

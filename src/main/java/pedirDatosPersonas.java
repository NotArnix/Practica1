import java.util.Scanner;

public class pedirDatosPersonas extends pedirDatos{

    String pedirCorreo(){
        System.out.print("Dame el correo del usuario: ");
        return pedirDato();
    }
    String pedirNombre(){
        System.out.print("Dame su nombre: ");
        return pedirDato();
    }
}

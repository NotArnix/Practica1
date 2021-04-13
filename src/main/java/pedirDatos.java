import java.util.Scanner;

public class pedirDatos {
    public String pedirDato(){
        Scanner teclado = new Scanner(System.in);
        String dato = teclado.next();
        return dato;
    }
    public int comprobarEntero(String cadena){
        if(cadena.compareTo("") == 0)
            return 0;
        return Integer.parseInt(cadena);
    }
}

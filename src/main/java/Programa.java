public class Programa extends Resultado{
    private String lenguajeEmpleado;
    private int numLineas;
    private int numModulos;

    Programa(){
        super();
    }
    void setLenguajeEmpleado(String lenguajeEmpleado){ this.lenguajeEmpleado = lenguajeEmpleado; }
    void setNumLineas(int numLineas){ this.numLineas = numLineas; }
    void setNumModulos(int numModulos){ this.numModulos = numModulos; }

    @Override
    public String toString(){
        StringBuilder cadena = new StringBuilder();
        cadena.append(super.toString());
        cadena.append(" empleando el lenguaje " + lenguajeEmpleado + " usando " + numLineas + " líneas y " + numModulos + " módulos");
        return cadena.toString();
    }
}

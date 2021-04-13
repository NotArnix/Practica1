public class Documentacion extends Resultado{
    private String formato;
    private int paginas;
    private int espacioUsado;

    Documentacion(){
        super();
    }
    void setFormato(String formato){ this.formato = formato; }
    void setPaginas(int paginas){ this.paginas = paginas; }
    void setEspacioUsado(int espacioUsado){ this.espacioUsado = espacioUsado; }

    @Override
    public String toString(){
        StringBuilder cadena = new StringBuilder();
        cadena.append(super.toString());
        cadena.append(" empleando el formato " + formato + " usando " + paginas + " páginas y " + espacioUsado + " espacio usado");
        return cadena.toString();
    }
}

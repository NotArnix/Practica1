public class PaginaWeb extends Resultado{
    private String tipoPagina;
    private String lenguaje;
    private String backEnd;

    PaginaWeb(){
        super();
    }
    void setTipoPagina(String tipoPagina){ this.tipoPagina = tipoPagina; }
    void setLenguaje(String lenguaje){ this.lenguaje = lenguaje; }
    void setBackEnd(String backEnd){ this.backEnd = backEnd; }

    @Override
    public String toString(){
        StringBuilder cadena = new StringBuilder();
        cadena.append(super.toString());
        cadena.append(" donde la página es " + tipoPagina + " usando " + lenguaje + "  y " + backEnd + " como Back End");
        return cadena.toString();
    }
}

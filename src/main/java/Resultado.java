public class Resultado<T> {
    private String identificador;
    private int horasEsperadas;
    private String proposito;


    Resultado () {
        super();
    }
    Resultado creaResultado(){
        setIdentificador(new pedirDatosResultado().pedirIdentificador());
        setHorasEsperadas(new pedirDatosResultado().pedirHorasEsperadas());
        setProposito(new pedirDatosResultado().pedirProposito());
        return this;
    }

    void setIdentificador(String identificador){ this.identificador = identificador; }
    void setHorasEsperadas(int horasEsperadas){ this.horasEsperadas = horasEsperadas; }
    void setProposito(String proposito){ this.proposito = proposito; }



    public String toString(){
        StringBuilder cadena = new StringBuilder();
        cadena.append("Resultado " + identificador + " que utiliza " + horasEsperadas + " horas con el fin de :" + proposito);
        return cadena.toString();
    }
}

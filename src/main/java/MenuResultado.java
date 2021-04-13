public enum MenuResultado{
    TIPO_DOCUMENTACION("El resultado es un documento"),
    TIPO_PROGRAMA("El resultado es un programa"),
    TIPO_PAGINA_WEB("El resultado es una página web");

    private String descripcion;

    private MenuResultado(String descripcion){
        this.descripcion = descripcion;
    }

    String getDescripcion() {
        return descripcion;
    }

    public static MenuResultado getOpcion(int posicion){
        return values()[posicion];
    }

    public static String getMenu(){
        StringBuilder cadenas = new StringBuilder();
        for(MenuResultado opcion: MenuResultado.values()){
            cadenas.append(opcion.ordinal());
            cadenas.append("-");
            cadenas.append(opcion.getDescripcion());
            cadenas.append("\n");
        }
        return cadenas.toString();
    }
}

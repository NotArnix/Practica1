public enum Menu {
    INICIAR_PROYECTO("CREA UN PROYECTO"),
    DAR_ALTA_PERSONA("AÑADE PERSONAS"),
    DAR_ALTA_TAREA("AÑADE TAREA"),
    MARCAR_TAREA("FINALIZA UNA TAREA"),
    INTRODUCIR_PERSONA_TAREA("INTRODUCE UNA PERSONA EN UNA TAREA"),
    ELIMINAR_PERSONA_TAREA("ELIMINA UNA PERSONA DE UNA TAREA"),
    LISTAR_PERSONAS("LISTA LAS PERSONAS DEL PROYECTO"),
    LISTAR_TAREAS("LISTA LAS TAREAS DEL PROYECTO"),
    PERSONAS_SIN_ASIGNAR("LISTA DE PERSONAS SIN TAREAS ASIGNADAS"),
    TAREAS_SIN_ASIGNAR("LISTA DE TAREAS SIN PERSONAS ASIGNADAS"),
    SALIR("SALIR");

    private String title;

    Menu(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static Menu getOpcion(int posicion) {
        return values()[posicion];
    }

    public static String getMenu() {
        StringBuilder sb = new StringBuilder();
        for(Menu opcion: Menu.values()) {
            sb.append(opcion.ordinal());
            sb.append(".- ");
            sb.append(opcion.title);
            sb.append("\n");
        }
        return sb.toString();
    }
}

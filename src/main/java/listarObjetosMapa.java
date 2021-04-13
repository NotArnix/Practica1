import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class listarObjetosMapa<T>{
    List<T> devolverLista(Map<String,T> mapa){
        List<T> lista=new ArrayList<>();
        for (String objeto:mapa.keySet()){
            lista.add(mapa.get(objeto));
        }
        return lista;
    }
    String mostrarLista(List<T> lista){
        StringBuilder cadena= new StringBuilder();
        for (T objeto:lista){
            cadena.append(objeto);
        }
        return cadena.toString();
    }

}

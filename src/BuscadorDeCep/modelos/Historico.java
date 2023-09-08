package BuscadorDeCep.modelos;

import java.util.ArrayList;
import java.util.List;

public class Historico {


    List<String> lista = new ArrayList<>();

    public void historico(String cep) {
        lista.add(cep);


    }
    @Override
    public String toString() {
        return this.lista.toString();
    }
}


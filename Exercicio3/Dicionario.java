package Exercicio3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Dicionario {
    public void HashMap() {
        HashMap<String, String> dicionario = new HashMap<>();

        dicionario.put("bola", "azul");
        dicionario.put("boneca", "amarela");
        dicionario.put("dado", "rosa");
        dicionario.put("caixa", "preta");
        dicionario.put("cadeira", "branca");
        dicionario.put("livro", "verde");
        dicionario.put("mochila", "vermelha");

        for (String lista : dicionario.keySet()) {
            System.out.println(lista + " -> " + dicionario.get(lista));
        }
    }
}


package estudos.collections;

import java.util.Map;

public class ContadorPalavras {

    Map<String, Integer> contador;

    void adicionarPalavra(String palavra) {
        contador.put(palavra, contador.getOrDefault(palavra, 0) + 1);
    }

    void frequenciaPalavra(String palavra) {
        System.out.println("A palavra '" + palavra + "' aparece " + contador.getOrDefault(palavra, 0) + " vezes.");

    }
}

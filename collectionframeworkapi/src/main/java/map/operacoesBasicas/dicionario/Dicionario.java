package map.operacoesBasicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra,definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()){
            if (dicionarioMap.containsKey(palavra)){
                dicionarioMap.remove(palavra);
            }else {
                System.out.println("Palavra inexistente.".toUpperCase());
            }
        }else{
            System.out.println("A lista está vazia".toUpperCase());
        }
    }

    public void exibirPalavras(){
        if (!dicionarioMap.isEmpty()){
            System.out.println(dicionarioMap);
        }else {
            System.out.println("A lista está vazia.".toUpperCase());
        }
    }

    public String pesquisarPorPalavra(String palavra){
      String significado = null;
      if (!dicionarioMap.isEmpty()){
          significado = dicionarioMap.get(palavra);
      }else {
          System.out.println("Palavra inexistente.".toUpperCase());
      }
      return significado;
    }

}

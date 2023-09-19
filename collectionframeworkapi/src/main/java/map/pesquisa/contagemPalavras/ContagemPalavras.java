package map.pesquisa.contagemPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavraMap;

    public ContagemPalavras() {
        this.palavraMap = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem){
        palavraMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!palavraMap.isEmpty()){
           if (palavraMap.containsKey(palavra)){
               palavraMap.remove(palavra);
           }else {
               System.out.println("Palavra inexistente.".toUpperCase());
           }
        }else {
            System.out.println("A lista esta vazia.".toUpperCase());
        }
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for (int contagem : palavraMap.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavraMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }

    @Override
    public String toString() {
        return " " + palavraMap;
    }
}

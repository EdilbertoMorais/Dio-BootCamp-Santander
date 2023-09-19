package set.conjuntoPalavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    //atributo
    Set<String> palavrasUnicasSet;

    //Construtor que inicializa um Set vazio
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!palavrasUnicasSet.isEmpty()){
           if (palavrasUnicasSet.contains(palavra)){
               palavrasUnicasSet.remove(palavra);
           }else {
               System.out.println("Palavra não encontrada".toUpperCase());
           }
        }else {
            System.out.println("A lista esta vazia.".toUpperCase());
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicasSet.contains(palavra);
    }

    public void
    exibirPalavrasUnicas(){
        if (!palavrasUnicasSet.isEmpty()){
            System.out.println(palavrasUnicasSet);
        }else {
            System.out.println("A lista esta vazia.".toUpperCase());
        }
    }

    @Override
    public String toString() {
        return "Palavras=" + palavrasUnicasSet ;
    }
}


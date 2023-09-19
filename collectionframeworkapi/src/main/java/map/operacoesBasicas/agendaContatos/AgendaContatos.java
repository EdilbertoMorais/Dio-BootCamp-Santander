package map.operacoesBasicas.agendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        // O método put em MAP serve tanto para adicionar quanto para atualizar,
        // ou seja, se já tiver uma chave add ao MAP e tentarmos adicionar a mesma chave com outro valor,
        // o valor da chave anterior será atualizado para o valor da chave repetida.
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
           if (agendaContatoMap.containsKey(nome)){
               agendaContatoMap.remove(nome);

           }else {
               System.out.println("Contato inexistente.".toUpperCase());
           }
        }else {
            System.out.println("A lista esta vazia.".toUpperCase());
        }
    }

    public void exibirContatos(){
        if (!agendaContatoMap.isEmpty()){
            System.out.println(agendaContatoMap);
        }else {
            System.out.println("A lista está vazia.".toUpperCase());
        }
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroTelefone = null;
        if (!agendaContatoMap.isEmpty()){
            numeroTelefone = agendaContatoMap.get(nome);
        }else {
            System.out.println("A lista esta vazia.".toUpperCase());
        }
        return numeroTelefone;
    }
}

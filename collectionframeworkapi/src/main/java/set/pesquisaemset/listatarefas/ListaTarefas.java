package set.pesquisaemset.listatarefas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ListaTarefas {
    // Atributo para armazenar as tarefas em um conjunto (Set).
    private Set<Tarefa> tarefasSet;

    // Construtor da classe ListaTarefas, inicializa o conjunto de tarefas como um HashSet vazio.
    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    // Método para adicionar uma tarefa ao conjunto.
    public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefa(descricao, false));
    }

    // Método para remover uma tarefa do conjunto com base na descrição.
    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if (!tarefasSet.isEmpty()){
            // Itera sobre as tarefas para encontrar a que corresponde à descrição fornecida.
            for (Tarefa t: tarefasSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                    break;
                }
            }
            // Remove a tarefa se encontrada, caso contrário, exibe uma mensagem de erro.
            if (tarefaParaRemover != null) {
                tarefasSet.remove(tarefaParaRemover);
            } else {
                System.out.println("Tarefa inexistente.".toUpperCase());
            }
        }else {
            System.out.println("A lista está vazia.".toUpperCase());
        }
    }

    // Método para exibir todas as tarefas no conjunto.
    public void exibirTarefas(){
        if (!tarefasSet.isEmpty()){
            System.out.println(tarefasSet);
        }else {
            System.out.println("A lista está vazia".toUpperCase());
        }
    }

    // Método para contar o número de tarefas no conjunto.
    public int contarTarefas(){
        int totalTarefas = 0;
        if (!tarefasSet.isEmpty()){
            totalTarefas = tarefasSet.size();
        }else {
            System.out.println("A lista está vazia.".toUpperCase());
        }
        return totalTarefas;
    }

    // Método para obter um conjunto de tarefas concluídas.
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefasSet.isEmpty()){
            // Itera sobre as tarefas para encontrar as concluídas e adicioná-las ao conjunto.
            for (Tarefa t: tarefasSet){
                if (t.isConcluida()){
                    tarefasConcluidas.add(t);
                }
            }
            return tarefasConcluidas;
        }else {
            throw new RuntimeException("A lista está vazia".toUpperCase());
        }
    }

    // Método para obter um conjunto de tarefas pendentes.
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefasSet.isEmpty()){
            // Itera sobre as tarefas para encontrar as pendentes e adicioná-las ao conjunto.
            for (Tarefa t: tarefasSet){
                if (!t.isConcluida()){
                    tarefasPendentes.add(t);
                }
            }
            return tarefasPendentes;
        }else {
            throw new RuntimeException("A lista está vazia.".toUpperCase());
        }
    }

    // Método para marcar uma tarefa como concluída com base na descrição.
    public void marcarTarefaConcluida(String descricao){
        if (!tarefasSet.isEmpty()){
            // Itera sobre as tarefas para encontrar a que corresponde à descrição fornecida e a
            // marca como concluída.
            for (Tarefa t: tarefasSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(true);
                }
            }
        }else {
            System.out.println("Tarefa inexistente.".toUpperCase());
        }
    }

    // Método para marcar uma tarefa como pendente com base na descrição.
    public void marcarTarefaPendente(String descricao){
        if (!tarefasSet.isEmpty()){
            // Itera sobre as tarefas para encontrar a que corresponde à descrição fornecida e a
            // marca como pendente.
            for (Tarefa t: tarefasSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(false);
                    break;
                }
            }
        }else {
            System.out.println("Tarefa inexistente.".toUpperCase());
        }
    }

    // Método para limpar o conjunto de tarefas, tornando-o vazio.
    public void limparListaTarefas(){
        if (!tarefasSet.isEmpty()){
            System.out.println("A lista está vazia.".toUpperCase());
        }else tarefasSet.clear();
    }
}

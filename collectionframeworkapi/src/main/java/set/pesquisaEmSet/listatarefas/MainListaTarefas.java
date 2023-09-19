package set.pesquisaEmSet.listatarefas;

public class MainListaTarefas {
    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.adicionarTarefa("Tarefa 5");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa inexistente
        listaTarefas.removerTarefa("xxxx");
        // Removendo uma tarefa
        listaTarefas.removerTarefa("Tarefa 3");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: ".toUpperCase() + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Tarefa 1");
        listaTarefas.marcarTarefaConcluida("Tarefa 2");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());
        listaTarefas.exibirTarefas();

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Tarefa 1");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}

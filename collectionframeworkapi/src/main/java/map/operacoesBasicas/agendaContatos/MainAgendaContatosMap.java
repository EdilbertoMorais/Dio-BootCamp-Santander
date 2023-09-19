package map.operacoesBasicas.agendaContatos;

public class MainAgendaContatosMap {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // Adicionar contatos
        agendaContatos.adicionarContato("Contato 1", 12);
        // Neste caso, como estamos add uma chave repetida, o valor da chave anterior será atualizada para o novo valor.
        agendaContatos.adicionarContato("Contato 1", 1);
        agendaContatos.adicionarContato("Contato 2", 2);
        agendaContatos.adicionarContato("Contato 3", 3);
        agendaContatos.adicionarContato("Contato 4", 4);
        agendaContatos.adicionarContato("Contato 5", 5);
        agendaContatos.adicionarContato("Contato 6", 6);

        agendaContatos.exibirContatos();

        // Remover um contato
        agendaContatos.removerContato("Contato 8");
        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Contato 4");
        agendaContatos.exibirContatos();

        // Pesquisar número por nome
        String nomePesquisa = "contato 3";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("Contato 3");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Contato 9";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
    }
}

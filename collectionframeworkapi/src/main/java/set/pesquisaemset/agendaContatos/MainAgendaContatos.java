package set.pesquisaemset.agendaContatos;


public class MainAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.exibirContatos();

        // Adicionando contatos à agenda
        agendaContatos.adicionarContato("João", 111111111);
        agendaContatos.adicionarContato("Maria Aparecida", 222222222);
        agendaContatos.adicionarContato("Maria", 333333333);
        agendaContatos.adicionarContato("Ana", 444444444);
        agendaContatos.adicionarContato("Fernando", 555555555);
        agendaContatos.adicionarContato("Carolina", 666666666);

        // Exibindo os contatos na agenda
        agendaContatos.exibirContatos();

        // Pesquisando contatos pelo nome
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        // Atualizando o número de um contato
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 999999999);
        System.out.println("Contato atualizado: " + contatoAtualizado);

//        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();

    }
}

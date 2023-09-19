package set.convidado;

public class MainConjuntoConvidado {
    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoConvidados
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        // Exibindo o número de convidados no conjunto (Lista deve ser vazia)
        System.out.println("Exibir Set de Convidados: ".toUpperCase());
        conjuntoConvidados.contarConvidados();

        // Adicionando convidados ao conjunto
        conjuntoConvidados.adicionarConvidado("Alice", 1);
        conjuntoConvidados.adicionarConvidado("Bob", 2);
        conjuntoConvidados.adicionarConvidado("Charlie", 2);
        conjuntoConvidados.adicionarConvidado("David", 3);

        // Exibindo os convidados adicionados no conjunto (Total deve ser 3)
        System.out.println("Adicionando convidados ... ".toUpperCase());
        System.out.println("Lista de convidados: ".toUpperCase());
        conjuntoConvidados.exibirConvidados();

        // Exibindo o número atualizado de convidados no conjunto
        conjuntoConvidados.contarConvidados();

        // Removendo um convidado do conjunto por código de convite inexistente
        System.out.println("Removendo convidado com código inexistente... ".toUpperCase());
        conjuntoConvidados.removerConvidadoPorCodigoConvite(4);
        conjuntoConvidados.contarConvidados();

        // Removendo um convidado do conjunto por código de convite
        System.out.println("Removendo convidado... ".toUpperCase());
        conjuntoConvidados.removerConvidadoPorCodigoConvite(3);
        System.out.println("Lista atualizada do Set após a remoção: ".toUpperCase());
        conjuntoConvidados.contarConvidados();

        // Exibindo os convidados atualizados no conjunto
        System.out.println("Lista de convidados após a remoção: ".toUpperCase());
        conjuntoConvidados.exibirConvidados();
    }
}

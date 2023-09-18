package list.ordenacao.pessoa;



public class MainOrdenacaoPessoas {
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        // Adicionando pessoas à lista
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
        System.out.println("Lista exibida em ordem de inserção:");
        System.out.println(ordenacaoPessoa);

        // Ordenando e exibindo por idade
        System.out.println();
        System.out.println("Ordenando por Idade:");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        // Ordenando e exibindo por altura
        System.out.println();
        System.out.println("Ordenando por Altura:");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}

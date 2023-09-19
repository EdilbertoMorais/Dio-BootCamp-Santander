package set.ordenacaoset.cadastroproduto;

public class MainCadastroProdutos {
    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1, "Produto 4", 1000d, 10);
        cadastroProdutos.adicionarProduto(2, "Produto 3", 1500d, 5);
        cadastroProdutos.adicionarProduto(1, "Produto 2", 30d, 20);
        cadastroProdutos.adicionarProduto(4, "Produto 1", 50d, 15);

        // Exibindo todos os produtos no cadastro
        System.out.println(cadastroProdutos.produtoSet);

        // Exibindo produtos ordenados por nome
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        // Exibindo produtos ordenados por preço
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}

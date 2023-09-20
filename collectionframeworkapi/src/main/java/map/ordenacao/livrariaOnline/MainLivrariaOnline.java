package map.ordenacao.livrariaOnline;


public class MainLivrariaOnline {
    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        //Deve imprimir a mensagem "A LISTA ESTÁ VAZIA."
        livrariaOnline.exibirLivrosOrdenadosPorPreco();
        livrariaOnline.exibirLivrosOrdenadosPorAutor();
        livrariaOnline.removerLivro("teste");
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("Titulo6", "Autor6", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("Titulo7", "Autor5", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Titulo5", "Autor4", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Titulo3", "Autor3", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("Titulo1", "Autor2", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Titulo2", "Autor2", 5d));

        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        //Exibe todos os livros ordenados por autor
        System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());

        // Pesquisa livros por autor
        String autorPesquisa = "Autor2";
        livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);

        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

        // Remover um livro pelo título
        livrariaOnline.removerLivro("Titulo1");
        System.out.println(livrariaOnline.pesquisarLivrosPorAutor("Autor2"));
    }

}

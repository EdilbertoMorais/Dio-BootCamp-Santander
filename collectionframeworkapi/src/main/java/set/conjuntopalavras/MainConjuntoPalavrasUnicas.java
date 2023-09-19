package set.conjuntopalavras;

public class MainConjuntoPalavrasUnicas {
    public static void main(String[] args) {
        //Criando uma instância da classe ConjuntoPalavrasUnicas.
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        // Exibindo as lista de palavrasUnicas.
        System.out.println("Inserindo palavras...".toUpperCase());
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        System.out.println("Removendo a palavras Python ...".toUpperCase());
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        System.out.println("Removendo uma palavras Inexistente ...".toUpperCase());
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? ".toUpperCase() + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? ".toUpperCase() + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        System.out.println("Exibindo a lista atualizada.".toUpperCase());
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}

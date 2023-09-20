package map.ordenacao.livrariaOnline;

import java.util.*;

public class LivrariaOnline {

    // Declaração do map que armazena livros, onde a chave é o link e o valor é o objeto Livro.
    private Map<String, Livro> livrosMap;

    // Construtor da classe que inicializa o map.
    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    // O método adicionarLivro permite adicionar um livro ao mapa livrosMap.
    // Ele recebe dois parâmetros: link, é a chave, e livro, é o valor.
    public void adicionarLivro(String link, Livro livro) {
        livrosMap.put(link, livro);
    }

    // Método para remover livros permite remover livros com um título específico do map.
    public void removerLivro(String titulo) {
        //verificando se o mapa livrosMap não está vazio usando isEmpty().
        if (!livrosMap.isEmpty()) {
            // Criamos uma lista chavesParaRemover que será usada para armazenar as
            // chaves dos livros que precisam ser removidos do map
            List<String> chavesParaRemover = new ArrayList<>();
            //Iniciamos um loop for que itera sobre as entradas do mapa livrosMap usando entrySet().
            for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
                // Para cada entrada do mapa, verificamos se o título do livro (obtido através de entry.getValue().getTitulo())
                // corresponde ao título fornecido como parâmetro.
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    // Se o título corresponder, adicionamos a chave (link) do livro à lista chavesParaRemover.
                    chavesParaRemover.add(entry.getKey());
                }
            }
            //Em seguida, percorremos a lista de chaves a serem removidas e removemos essas
            //chaves do mapa livrosMap, efetivamente removendo os livros com o título correspondente.
            for (String chave : chavesParaRemover) {
                // Remove as chaves identificadas.
                livrosMap.remove(chave);
            }
        } else {
            //Se o mapa estiver vazio, uma mensagem é impressa em letras maiúsculas indicando que a lista está vazia.
            System.out.println("A lista está vazia.".toUpperCase());
        }
    }

    // O método exibirLivrosOrdenadosPorPreco retorna um novo mapa que contém os livros ordenados por preço.
    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        //Criamos uma lista livrosPorPreco que contém as entradas do mapa livrosMap.
        //Essa lista será usada para ordenar os livros por preço.
        List<Map.Entry<String, Livro>> livrosPorPreco = new ArrayList<>(livrosMap.entrySet());
        //Usamos o método sort da classe Collections para ordenar a lista livrosPorPreco com base
        //em um comparador personalizado chamado ComparatorPorPreco. Isso organiza os livros por preço.
        Collections.sort(livrosPorPreco, new ComparatorPorPreco());
        //Criamos um novo mapa livrosOrdenadosPorPreco que será usado para armazenar os livros ordenados por preço.
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
        //Verificamos se a lista livrosPorPreco não está vazia antes de continuar.
        if (!livrosPorPreco.isEmpty()) {
            //Iniciamos um loop for para iterar sobre as entradas da lista ordenada livrosPorPreco.
            for (Map.Entry<String, Livro> entry : livrosPorPreco) {
                //Para cada entrada da lista ordenada, adicionamos a entrada ao map
                //livrosOrdenadosPorPreco, preservando a ordem de classificação.
                livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
            }
        } else {
            //Se a lista estiver vazia, uma mensagem é impressa em letras maiúsculas.
            System.out.println("A lista está vazia.".toUpperCase());
        }
        //retorna o map livrosOrdenadosPorPreco contendo os livros ordenados por preço.
        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        // Cria uma lista de entradas (chave-valor) a partir do mapa de livros
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livrosMap.entrySet());
        // Ordena a lista de livros com base em um comparador personalizado (ComparatorPorAutor)
        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());
        // Cria um novo mapa para armazenar os livros ordenados por autor
        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();
        // Verifica se o mapa original de livros não está vazio
        if (!livrosMap.isEmpty()) {
            for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
                // Adiciona as entradas ordenadas ao novo mapa
                livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
            }
        } else {
            // Se o mapa original de livros estiver vazio, imprime uma mensagem em letras maiúsculas
            System.out.println("A lista está vazia.".toUpperCase());
        }
        // Retorna o novo mapa com os livros ordenados por autor
        return livrosOrdenadosPorAutor;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        // Cria um novo mapa para armazenar os livros encontrados com base no autor
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        // Verifica se o mapa original de livros não está vazio
        if (!livrosMap.isEmpty()) {
            // Itera sobre as entradas do mapa original de livros
            for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
                Livro livro = entry.getValue();
                // Verifica se o autor do livro corresponde ao autor fornecido como parâmetro
                if (livro.getAutor().equals(autor)) {
                    // Se corresponder, adiciona a entrada ao novo map
                    livrosPorAutor.put(entry.getKey(), livro);
                }
            }
        } else {
            // Se o mapa original de livros estiver vazio, imprime uma mensagem em letras maiúsculas
            System.out.println("A lista está vazia.".toUpperCase());
        }
        // Retorna o mapa com os livros encontrados pelo autor
        return livrosPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {
        // Cria uma lista para armazenar os livros mais caros
        List<Livro> livrosMaisCaros = new ArrayList<>();
        // Variável para rastrear o preço mais alto encontrado
        double precoMaisAlto = Double.MIN_VALUE;
        // Verifica se o mapa original de livros não está vazio
        if (!livrosMap.isEmpty()) {
            for (Livro livro : livrosMap.values()) {
                // Verifica se o preço do livro atual é maior que o preço mais alto encontrado até agora
                if (livro.getPreco() > precoMaisAlto) {
                    precoMaisAlto = livro.getPreco();
                }
            }
        } else {
            // Se o map original de livros estiver vazio, lança uma exceção informando que a livraria está vazia
            throw new NoSuchElementException("A livraria está vazia!");
        }
        //Itera novamente sobre as entradas do map original de livros
        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            // Verifica se o preço do livro da entrada atual é igual ao preço mais alto encontrado
            if (entry.getValue().getPreco() == precoMaisAlto) {
                // Se for igual, adiciona o livro correspondente à lista de livros mais caros
                Livro livroComPrecoMaisAlto = livrosMap.get(entry.getKey());
                livrosMaisCaros.add(livroComPrecoMaisAlto);
            }
        }
        // Retorna a lista de livros mais caros
        return livrosMaisCaros;
    }

    public List<Livro> obterLivroMaisBarato() {
        // Cria uma lista para armazenar os livros mais baratos
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        // Variável para rastrear o preço mais baixo encontrado
        double precoMaisBaixo = Double.MAX_VALUE;

        // Verifica se o mapa original de livros não está vazio
        if (!livrosMap.isEmpty()) {
            // Itera sobre os valores do mapa original de livros
            for (Livro livro : livrosMap.values()) {
                // Verifica se o preço do livro atual é menor que o preço mais baixo encontrado até agora
                if (livro.getPreco() < precoMaisBaixo) {
                    precoMaisBaixo = livro.getPreco();
                }
            }
        } else {
            // Se o mapa original de livros estiver vazio, lança uma exceção informando que a livraria está vazia
            throw new NoSuchElementException("A livraria está vazia!");
        }
        // Itera novamente sobre as entradas do mapa original de livros
        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            // Verifica se o preço do livro da entrada atual é igual ao preço mais baixo encontrado
            if (entry.getValue().getPreco() == precoMaisBaixo) {
                // Se for igual, adiciona o livro correspondente à lista de livros mais baratos
                Livro livroComPrecoMaisBaixo = livrosMap.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }
        // Retorna a lista de livros mais baratos
        return livrosMaisBaratos;
    }
}


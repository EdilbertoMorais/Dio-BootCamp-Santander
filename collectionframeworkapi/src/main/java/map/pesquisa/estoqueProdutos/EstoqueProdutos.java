package map.pesquisa.estoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        if (!estoqueProdutosMap.isEmpty()) {
            System.out.println(estoqueProdutosMap);
        } else {
            System.out.println("A lista está vazia.".toUpperCase());
        }
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        } else {
            System.out.println("O estoque está vazio.".toUpperCase());
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }

        } else {
            System.out.println("A lista está vazia.".toUpperCase());
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        } else {
            System.out.println("A lista está vazia.".toUpperCase());
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;

    }

    //Classe criada apenas para somar o valor total de um determinado produto em estoque
    //Não era uma solicitação do desafio, criei apenas para testar meus conhecimentos.
    //A idéia era imprimir o resultado da multiplicação do valor do item pela quantidade do estoque do retorno do
    //Método obterProdutoMaiorQuantidadeValorTotalNoEstoque().
    public double valorTotalDoProdutoComMaiorQuantidadeEstoque(){
        double valorTotalDosItens = 0d;
        if (!estoqueProdutosMap.isEmpty()){
            Produto itemMaiorQuantidade = obterProdutoMaiorQuantidadeValorTotalNoEstoque();
            valorTotalDosItens += itemMaiorQuantidade.getPreco() * itemMaiorQuantidade.getQuantidade();
        }else {
            System.out.println("A lista está vazia.".toUpperCase());
        }
        return valorTotalDosItens;
    }
}

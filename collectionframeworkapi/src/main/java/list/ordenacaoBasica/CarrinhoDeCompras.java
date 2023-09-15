package list.ordenacaoBasica;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    // Atributo
    private List<Item> itemList;

    // O construtor quando for chamado, vai instânciar um ArrayList() vazio do tipo CarrinhoDeCompras.
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        // Cria uma lista temporária para armazenar os itens que serão removidos
        List<Item> itensParaRemover = new ArrayList<>();
        // Verifica se a lista "itemList" está vazia
        if (!itemList.isEmpty()) {
            // Itera sobre os elementos da lista "itemList"
            for (Item i : itemList) {
                // Verifica se o nome do item (i.getNome()) é igual,
                // ignorando maiúsculas e minúsculas, ao nome fornecido como argumento
                if (i.getNome().equalsIgnoreCase(nome)) {
                    // Se for igual, adiciona o item à lista "itensParaRemover"
                    itensParaRemover.add(i);
                }
            }
            // Remove todos os itens da lista "itemList" que estão na lista "itensParaRemover"
            itemList.removeAll(itensParaRemover);
        } else {
            // Se a lista "itemList" estiver vazia, exibe uma mensagem
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        // Variável temporária
        double valorTotal = 0d;
        // Verifica se a lista "itemList" está vazia
        if (!itemList.isEmpty()) {
            // Itera sobre os elementos da lista "itemList"
            for (Item item : itemList) {
                // Atribui à variável valorItem o resultado do cálculo preço X quantidade
                double valorItem = item.getPreco() * item.getQuantidade();
                //valorTotal recebe o resultado de valorTotal + valorItem;
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("Confirmando carrinho de compras vazio");
        carrinhoDeCompras.exibirItens();

        System.out.println("Adicionando itens ao carrinho");
        carrinhoDeCompras.adicionarItem("celular", 1000, 2);
        carrinhoDeCompras.adicionarItem("Xbox", 3000, 1);
        carrinhoDeCompras.adicionarItem("PS5", 3000, 1);
        System.out.println("Exibindo Itens do carrinho de compra: ");
        carrinhoDeCompras.exibirItens();
        System.out.println("Removendo Itens do carrinho de compra: ");
        carrinhoDeCompras.removerItem("celular");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.adicionarItem("celular", 1000, 1);
        System.out.println("Exibindo Itens do carrinho de compra APOS EXCLUSÃO: ");

        System.out.println("Calculando total da compra:");
        double totalCompra = carrinhoDeCompras.calcularValorTotal();
        System.out.printf("Valor total da compra R$ %.2f%n", totalCompra);
    }


}

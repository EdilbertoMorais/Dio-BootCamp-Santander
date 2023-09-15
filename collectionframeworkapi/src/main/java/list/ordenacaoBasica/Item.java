package list.ordenacaoBasica;

public class Item {
    //atributos
    private String nome;
    private double Preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        Preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return Preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", Preco=" + Preco +
                ", quantidade=" + quantidade +
                '}';
    }
}

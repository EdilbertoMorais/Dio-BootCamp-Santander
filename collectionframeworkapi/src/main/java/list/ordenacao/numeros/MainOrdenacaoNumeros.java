package list.ordenacao.numeros;

public class MainOrdenacaoNumeros {
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(99);

        // Exibindo a lista de números em ordem de inserção
        System.out.println("Números em ordem de inserção:");
        ordenacaoNumeros.exibirNumeros();

        // Exibindo a lista de números em ordem ascendente
        System.out.println("Números em ordem ascendente:");
        System.out.println(ordenacaoNumeros.ordenarAscendente());

        // Exibindo a lista de números em ordem descendente
        System.out.println("Números em ordem descendente:");
        System.out.println(ordenacaoNumeros.ordenarDescendente());

    }
}

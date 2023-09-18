package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    // Declara uma lista de inteiros chamada "numeros"
    private List<Integer> numeros;

    // Declara o construtor da classe
    public SomaNumeros() {
        //Inicializa a lista "numeros" como um novo ArrayList vazio
        this.numeros = new ArrayList<>();
    }

    // Declara um método para adicionar números à lista
    public void adicionarNumero(int numero){
        // Adiciona o número à lista "numeros"
        this.numeros.add(numero);
    }

    // Declara um método para calcular a soma dos números na lista
    public void calcularSoma(){
        //Variável para armazenar a soma
        int soma = 0;
        // Verifica se a lista esta vazia
        if (!numeros.isEmpty()){
            //Percorre a lista de Integer
            for (Integer numero: numeros){
                // Soma o número atual à variável "soma"
                soma += numero;
            }
            System.out.println("A soma dos números é: " + soma);
        }else {
            System.out.println("A lista está vazia.");
        }
    }

    // Declara um método para encontrar o maior número na lista
    public int encontrarMaiorNumero(){
        if (!numeros.isEmpty()){
            //Assume que o primeiro número é o maior.
            int maior = numeros.get(0);
            //Percorre a lista de Integer
            for (Integer numero: numeros){
                if (numero > maior){
                    //Atualiza o maior número quando um número maior é encontrado
                    maior = numero;
                }
            }
            System.out.println("O maior número da lista é: " + maior);
            // Retorna o maior número
            return maior;
        }else {
            System.out.println("A lista está vazia.");
            //Retorna um valor negativo para indicar que a lista esta vazia
            return -1;
        }
    }

    // Declara um método para encontrar o menor número na lista
    public int encontrarMenorNumero(){
        if (!numeros.isEmpty()){
            //Assume que o primeiro número é o menor.
            int menor = numeros.get(0);
            //Percorre a lista de Integer
            for (Integer numero: numeros){
                if (numero < menor){
                    //Atualiza o menor número quando um número menor é encontrado
                    menor = numero;
                }
            }
            System.out.println("O menor número da lista é: " + menor);
            // Retorna o menor número
            return menor;
        }else {
            System.out.println("A lista está vazia.");
            //Retorna um valor negativo para indicar que a lista esta vazia
            return -1;
        }
    }

    // Declara um método para exibir os números na lista
    public void exibirNumeros(){
        if (!numeros.isEmpty()){
            for (Integer numero: numeros){
                // Exibe cada número no console
                System.out.println(numero);
            }
            // Exibe uma linha em branco no console no final da lista
            System.out.println();
        }else {
            System.out.println("A lista está vazia.");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        somaNumeros.calcularSoma();

        // Encontrando e exibindo o maior número na lista
        somaNumeros.encontrarMaiorNumero();

        // Encontrando e exibindo o menor número na lista
        somaNumeros.encontrarMenorNumero();
    }
}

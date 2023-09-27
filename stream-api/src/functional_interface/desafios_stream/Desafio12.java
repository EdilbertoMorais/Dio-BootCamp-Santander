package functional_interface.desafios_stream;

import java.util.Arrays;
import java.util.List;

/**
 * Desafio 12 - Encontre o produto de todos os números da lista:
 * Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
 */

public class Desafio12 {
    public static void main(String[] args) {
        //converte a lista em um fluxo (stream) de elementos, permitindo operações de fluxo subsequentes.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //O resultado do produto é armazenado na variável produto.
        int produto = numeros.stream()
                //usamos o método reduce() para calcular o produto de todos os números na lista. O valor inicial do produto é 1
                //a função lambda (a, b) -> a * b é usada para multiplicar os números acumulados.
                .reduce(1, (a, b) -> a * b);

        //imprimimos o produto dos números no console.
        System.out.println("Produto dos números na lista: " + produto);
    }
}

package functional_interface.desafios_stream;

import java.util.Arrays;
import java.util.List;

/**
 * Desafio 7 - Encontrar o segundo número maior da lista:
 * Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
 */
public class Desafio7 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //converte a lista em um fluxo (stream) de elementos, permitindo operações de fluxo subsequentes.
        Integer segundoMaior = numeros.stream()
                // O método distinct() remove elementos duplicados da lista, garantindo que cada número seja considerado apenas uma vez
                .distinct()
                // O método sorted((a, b) -> Integer.compare(b, a)) ordena os elementos em ordem decrescente.
                // Isso é feito comparando os números de forma que os maiores apareçam primeiro.
                .sorted((a, b) -> Integer.compare(b, a))
                // O método skip(1) pula o primeiro elemento da lista ordenada (o maior número).
                // Agora, estamos apontando para o segundo número maior.
                .skip(1)
                // O método findFirst() obtém o primeiro elemento restante do fluxo, que será o segundo número maior.
                .findFirst()
                // O método orElse(null) retorna o segundo número maior encontrado ou null se a lista não tiver pelo menos dois elementos distintos.
                .orElse(null);

        System.out.println("O segundo número maior da lista é: " + segundoMaior);
    }
}

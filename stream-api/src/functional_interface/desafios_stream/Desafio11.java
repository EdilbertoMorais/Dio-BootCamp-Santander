package functional_interface.desafios_stream;

import java.util.Arrays;
import java.util.List;

/**
 * Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
 * Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
 */
public class Desafio11 {
    public static void main(String[] args) {
        //converte a lista em um fluxo (stream) de elementos, permitindo operações de fluxo subsequentes.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaTodosNumeros = numeros.stream()
                .mapToInt(num -> num * num)
                .sum();

        System.out.println("A soma de todos os numeros elevados ao quadrado é: " + somaTodosNumeros);
    }

}

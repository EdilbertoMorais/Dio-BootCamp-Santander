package functional_interface.desafios_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Desafio 1 - Mostre a lista na ordem numérica:
 * Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
 */

public class Desafio1 {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Imprime os números em ordem crescente
        numeros.stream().sorted().forEach(System.out::println);
    }

}

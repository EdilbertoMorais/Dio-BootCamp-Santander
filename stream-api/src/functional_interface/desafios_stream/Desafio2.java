package functional_interface.desafios_stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Desafio 2 - Imprima a soma dos números pares da lista:
 * Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
 */

public class Desafio2 {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int resultado = numeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);

        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado);

    }
}

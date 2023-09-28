package functional_interface.desafios_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Desafio 16 - Agrupe os números em pares e ímpares:
 * Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os
 * números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
 */

public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Cria duas novas listas vazias chamadas numerosImpares e numerosPares.
        // Essas listas serão usadas para armazenar os números pares e ímpares, respectivamente.
        List<Integer> numerosImpares = new ArrayList<>();
        List<Integer> numerosPares = new ArrayList<>();

        //Usamos um forEach para iterar cada número n, verifica se ele é par ou ímpar usando a expressão n % 2 == 0.
        // Se o resultado dessa expressão for verdadeiro (ou seja, n é par), ele adiciona o número à
        // lista numerosPares. Caso contrário (ou seja, n é ímpar), ele adiciona o número à lista numerosImpares
        numeros.forEach(n -> {
            if (n % 2 == 0) {
                numerosPares.add(n);
            } else {
                numerosImpares.add(n);
            }
        });

        //Imprime os elementos de cada lista
        System.out.println("Números Pares: " + numerosPares);
        System.out.println("Números Ímpares: " + numerosImpares);
    }
}

package functional_interface.desafios_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
 * Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
 */
public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15);

        int soma = numeros.stream()
                // O método filter é usado para filtrar os elementos do fluxo com base em uma condição especificada
                // na forma de uma expressão lambda. Neste caso, a condição verifica se o número n é divisível por 3 e 5.
                // Se a condição for verdadeira, o número é incluído no fluxo resultante.
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                // O método mapToInt é usado para converter o fluxo de elementos em um IntStream, que é um tipo especializado
                // de fluxo para números inteiros. Ele faz a conversão de cada elemento da lista para um int. No nosso caso,
                // não estamos realmente fazendo nenhuma transformação nos elementos, apenas os convertendo em int para que
                // possamos usar o método sum() posteriormente.
                .mapToInt(Integer::intValue)
                // o método sum é usado para calcular a soma de todos os números no IntStream resultante. Ele retorna a
                // soma total dos números inteiros no fluxo.
                .sum();

        System.out.println("A soma dos números divisíveis por 3 e 5 é: " + soma);

    }
}

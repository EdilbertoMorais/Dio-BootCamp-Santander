package functional_interface.desafios_stream;

import java.util.Arrays;
import java.util.List;

/**
 * Desafio 3 - Verifique se todos os números da lista são positivos:
 * Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
 */

public class Desafio3 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verifica se todos os números são positivos
        boolean todosPositivos = numeros.stream().allMatch(numero -> numero > 0);

        // Exibe o resultado no console
        if (todosPositivos) {
            System.out.println("Todos os números são positivos.");
        } else {
            System.out.println("Pelo menos um número não é positivo.");
        }
    }
}

package functional_interface.desafios_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Desafio 4 - Remova todos os valores ímpares:
 * Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
 */

public class Desafio4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Uso do filter para remover os valores ímpares
        List<Integer> numerosPares = new ArrayList<>();
        for (Integer n : numeros) {
            //Verifica se o número é par
            if (n % 2 == 0) {
                //Caso positivo, add a lista numerosPares
                numerosPares.add(n);
            }
        }
        // Imprima a lista resultante no console
        numerosPares.forEach(System.out::println);
    }
}

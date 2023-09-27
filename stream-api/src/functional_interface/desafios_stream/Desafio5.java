package functional_interface.desafios_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Desafio 5 - Calcule a média dos números maiores que 5:
 * Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
 */

public class Desafio5 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Uso do filter para encontrar os valores maiores que 5
        List<Integer> numerosMaioresCinco = new ArrayList<>();
        for (Integer n : numeros) {
            //Verifica se o número é maior que 5
            if (n > 5) {
                //Caso positivo, add a lista numerosMaioresCinco
                numerosMaioresCinco.add(n);
            }
        }

        int resultadoSoma = numerosMaioresCinco.stream().reduce(0, Integer::sum);

        int resultado = resultadoSoma / numerosMaioresCinco.size();

        // Imprima a lista resultante no console
        System.out.println("A média da soma dos números maior que 5 é: " + resultado);
    }
}

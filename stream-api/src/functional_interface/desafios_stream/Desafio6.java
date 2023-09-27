package functional_interface.desafios_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Desafio 6 - Verificar se a lista contém algum número maior que 10:
 * Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
 */
public class Desafio6 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Uso do filter para encontrar os valores maiores que 5
        List<Integer> numeroMaiorDez = new ArrayList<>();
        for (Integer n : numeros) {
            //Verifica se o número é maior que 10
            if (n > 10) {
                //Caso positivo, add a lista numerosMaioresCinco
                numeroMaiorDez.add(n);
            }
        }
        if (!numeroMaiorDez.isEmpty()){
            numeroMaiorDez.forEach(System.out::println);
        }else {
            System.out.println("A lista não possui nenhum número maior que 10.");
        }
    }
}

package functional_interface.desafios_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Desafio 17 - Filtrar os números primos da lista:
 * Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
 */
public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

            //cria uma lista vazia chamada numerosPrimo que será usada para armazenar os números primos filtrados da lista original
            List<Integer> numerosPrimo = new ArrayList<>();
            //Inicia um loop for-each para percorrer cada elemento da lista numeros. A variável n será atribuída a cada elemento da lista em cada iteração.
            for (Integer n : numeros) {
                //Aplica uma condição para verificar se o número n é primo, n > 1: Esta parte verifica se n é maior que 1.
                //Isso é importante porque, por definição, números primos são maiores que 1.
                //IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(divisor -> n % divisor == 0): Esta parte verifica se n não é divisível por nenhum
                //número no intervalo de 2 até a raiz quadrada de n. A função IntStream.rangeClosed(2, (int) Math.sqrt(n)) gera um fluxo de números
                //inteiros no intervalo de 2 até a raiz quadrada de n, e noneMatch verifica se nenhum deles é um divisor de n. Se a condição for verdadeira, e
                //então n é primo.
                if (n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(divisor -> n % divisor == 0)) {
                    numerosPrimo.add(n);
                }
            }
        //Imprime a lista com os números primos
        System.out.println("Números Primos: " + numerosPrimo);
    }
}

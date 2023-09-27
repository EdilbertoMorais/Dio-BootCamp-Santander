package functional_interface.desafios_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Desafio 14 - Encontre o maior número primo da lista:
 * Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
 */
public class Desafio14 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorPrimo = numeros.stream()
                //Dentro do filter, aplicamos uma condição para filtrar os números que são primos
                //n > 1 Garante que estamos tratando apenas de números maiores que 1, já que números menores ou iguais a 1 não são primos.
                //java.util.stream.IntStream.rangeClosed(2, (int) Math.sqrt(n)): Gera uma sequência de números de 2 até a raiz quadrada de n,
                //que é o intervalo no qual verificamos os divisores potenciais.
                //noneMatch(divisor -> n % divisor == 0): Verifica se nenhum número dentro desse intervalo é um divisor de n.
                // Se nenhum número for um divisor, então n é primo.
                .filter(n -> n > 1 && java.util.stream.IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(divisor -> n % divisor == 0))
                //O método max(Integer::compareTo) encontra o maior número primo na lista:
                .max(Integer::compareTo);
        //Verificamos se maiorPrimo contém um valor usando if (maiorPrimo.isPresent()). Se tivermos um maior número primo, imprimimos sua mensagem,
        //caso contrário, informamos não haver números primos na lista:
        System.out.println(maiorPrimo.map(primo -> "Maior número primo na lista: " + primo).orElse("Não há números primos na lista."));
    }
}

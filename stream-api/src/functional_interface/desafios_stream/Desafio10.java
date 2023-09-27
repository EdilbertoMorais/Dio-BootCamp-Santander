package functional_interface.desafios_stream;

import java.util.Arrays;
import java.util.List;

/**
 * Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
 * Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
 */
public class Desafio10 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //converte a lista em um fluxo (stream) de elementos, permitindo operações de fluxo subsequentes.
        numeros.stream()
                //O método filter é uma operação intermediária que permite filtrar elementos da Stream com base em uma condição
                // especificada pela função lambda passada como argumento. Neste caso num -> num % 3 == 0 || num % 5 == 0:
                //A função lambda verifica se um número é múltiplo de 3 ou de 5. O operador % calcula o resto da divisão do número por 3 e por 5.
                // Se o resto for zero em qualquer um dos casos, significa que o número é múltiplo de 3 ou de 5 e será mantido na Stream.
                .filter(num -> num % 3 == 0 || num % 5 == 0).
                // O método forEach é uma operação terminal que itera sobre os elementos da Stream e aplica uma ação a cada elemento.
                // Neste caso, a ação é representada pela função System.out::println, que imprime cada elemento no console.
                forEach(System.out::println);

    }
}

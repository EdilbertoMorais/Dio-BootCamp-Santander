package functional_interface.desafios_stream;

import java.util.Arrays;
import java.util.List;

/**
 * Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
 * Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
 */
public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -1, -2);

        List<Integer> numerosNegativos = numeros.stream()
                //O método filter é uma operação intermediária que permite que você filtre elementos com base em uma condição específica.
                // Neste caso, a condição é especificada por uma expressão, lambda numero -> numero < 0, que verifica se um número é menor
                // que zero (ou seja, se é negativo). Isso resulta em uma nova Stream que contém apenas os números negativos da lista original.
                .filter(numero -> numero < 0)
                //O método toList() é usado para coletar os elementos da Stream filtrada em uma nova lista, que é atribuída
                // à variável numerosNegativos. Este é um exemplo de uma operação terminal que conclui o processamento da Stream e coleta os resultados.
                .toList();
        //Se a lista numerosNegativos não estiver vazia, imprime a mensagem com a lista de números
        if (!numerosNegativos.isEmpty()) {
            System.out.println("Números negativos na lista: " + numerosNegativos);
        } else {
            //Se a lista estiver vazia, imprime a msg abaixo
            System.out.println("A lista não contém números negativos.");
        }
    }
}

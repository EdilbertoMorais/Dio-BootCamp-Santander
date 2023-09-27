package functional_interface.desafios_stream;

import java.util.Arrays;
import java.util.List;

/**
 * Desafio 8 - Somar os dígitos de todos os números da lista:
 * Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
 */
public class Desafio8 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //O método stream() cria um fluxo (stream) a partir da lista numeros, que nos permite realizar operações em seus elementos de forma funcional.
        int somaDigitos = numeros.stream()
                //Aqui, usamos a operação mapToInt para mapear cada elemento num da lista para um valor inteiro.
                // A função lambda (num -> ...) é aplicada a cada elemento da lista.
                // O metodo String.valueOf(num) Converte o número num em uma string para podermos trabalhar com seus dígitos individualmente.
                .mapToInt(num -> String.valueOf(num)
                        //O método chars() transforma a string em uma sequência de valores inteiros representando os caracteres
                        // da string (os códigos ASCII dos caracteres).
                        .chars()
                        //O método map(Character::getNumericValue) pega cada código ASCII de um caractere na string,
                        // e converter o caractere de volta para seu valor numérico (por exemplo, '2' para 2).
                        .map(Character::getNumericValue)
                        //O método sum() soma todos os valores numéricos dos dígitos na string para obter a soma dos dígitos de um número.
                        .sum())
                //O método sum(): Após mapear todos os números para a soma de seus dígitos,
                //usamos sum() novamente para somar esses valores transformados, o que resulta na soma total dos dígitos de todos os números na lista.
                .sum();

        //Imprimimos a variável somaDigitos onde foi armazenado o valor total da soma dos dígitos
        System.out.println("Soma dos dígitos dos números na lista: " + somaDigitos);

    }
}

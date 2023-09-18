package list.ordenacao.numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        //Inicializa a lista "numeros" como um novo ArrayList vazio
        this.numeros = new ArrayList<>();
    }

    // Declara um método para adicionar números à lista
    public void adicionarNumero(int numero) {
        // Adiciona o valor do atributo numero à lista "numeros"
        this.numeros.add(numero);
    }

    // Declara um método para exibir a lista de números em ordem de inserção.
    public void exibirNumeros() {
        // Verifica se a lista não está vazia e a exibe
        if (!numeros.isEmpty()) {
            System.out.println(numeros);
        } else {
            // Caso a lista esteja vazia, exibe uma mensagem informando
            System.out.println("A lista está vazia!");
        }
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(numeros);
        // Verifica se a lista não está vazia e a exibe
        if (!numeros.isEmpty()) {
            //Duplica a lista de números para a lista de numerosAscendente
            //Ordena a lista pessoasPorIdade utilizando o método sort da classe Collections.
            Collections.sort(numerosAscendente);
            //Retorna a lista numerosAscendente ordenada por ordem ascendente.
            return numerosAscendente;
        }
        // Caso a lista esteja vazia, retorna uma lista vazia []
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendente() {
        //Duplica a lista de numeros para a lista de numerosDescendente
        List<Integer> numerosDescendente = new ArrayList<>(numeros);
        if (!numeros.isEmpty()) {
            //Ordena a lista de números utilizando o método sort da classe Collections.
            Collections.sort(numerosDescendente);
            //Inverte a lista de números utilizando o método reverse da classe Collections.
            Collections.reverse(numerosDescendente);
            //Retorna a lista numerosDescendente em ordem descendente(invertida).
            return numerosDescendente;
        }
        // Caso a lista esteja vazia, retorna uma lista vazia []
        return numerosDescendente;
    }
}


/**
 * Faça um programa que calcule e imprima o salário a ser transferido para um funcionário.
 * * Para realizar o cálculo receba o valor bruto do salário e o adicional dos benefícios.
 * O salário a ser transferido é calculado da seguinte maneira:
 * (valor bruto do salário - percentual de imposto mediante ao salário) + adicional dos benefícios
 * * Para calcular o percentual de impostos segue as alíquotas:
 * de R$ 0,00 a R$ 1.100,00 = 5%
 * de R$ 1.100,01 a R$ 2.500,00 = 10%
 * maior que R$ 2.500,00 = 15%
 */

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in) : cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println: imprime um texto de saída (Output) e pulando uma linha.

import java.util.Scanner;

public class DesafioExemplo {
    public static void main(String[] args) throws InterruptedException {
        // Lê os valores de Entrada:
        Scanner leitorDeEntradas = new Scanner(System.in);
        System.out.println("Iniciando processo de cálculos para pagamento...");
        // Define um tempo em milissegundos para que o programa pause.
        Thread.sleep(2000);
        System.out.print("Informe o valor do salário: ");
        // Pega o valor informado pelo usuário e atribuí a variável valorSalario.
        float valorSalario = leitorDeEntradas.nextFloat();
        System.out.print("Informe o valor dos Benefícios: ");
        // Pega o valor informado pelo usuário e atribuí a variável valorBenefício.
        float valorBeneficios = leitorDeEntradas.nextFloat();
        // Encerra o método de entrada de dados. É importante porque, em alguns casos,
        // se você não fechar adequadamente recursos, como arquivos, sockets ou streams,
        // isso pode levar a vazamentos de recursos e problemas de desempenho no seu programa.
        leitorDeEntradas.close();

        //Inicializa a variável valorImposto em 0.
        float valorImposto = 0;
        //Inicializa a variável percentualImposto em 0.
        int percetualImposto = 0;
        // Válida se o salário esta entre 0 e R$ 1.100,00.
        if (valorSalario >= 0 && valorSalario <= 1100) {
            // Atribui a alíquota de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario;
            // Atribui o valor 5 a variável percentualImpost0
            percetualImposto = 5;
            // TODO Criar as demais condições para as alíquotas de 10.00% e 15.00%.
            // Válida se o salário esta entre R$ 1.100,01 e R$ 2.500,00.
        } else if (valorSalario <= 2500) {
            // Atribui a alíquota de 10% mediante o salário:
            valorImposto = 0.10F * valorSalario;
            // Atribui o valor 10 a variável percentualImpost0
            percetualImposto = 10;
        } else {
            // Caso o salário não esteja dentro de nenhuma das opções anteriores,
            // considera-se que ele é maior que R$ 2.500,01.
            // Atribui a alíquota de 15% mediante o salário:
            valorImposto = 0.15F * valorSalario;
            // Atribui o valor 15 a variável percentualImposto.
            percetualImposto = 15;
        }

        // Calcula e atribui o resultado a variável saida:
        float saida = valorSalario - valorImposto + valorBeneficios;
        //Imprime a Saída (com 2 casas decimais).
        System.out.printf("Total a pagar: R$ %.2f%n", saida);
        //Imprime o valor deduzido (com 2 casas decimais).
        System.out.printf("Valor de imposto deduzido R$ %.2f%n", valorImposto);
        //Imprime o percentual de imposto.
        System.out.println("Percentual de imposto aplicado: " + percetualImposto + "%");
    }
}

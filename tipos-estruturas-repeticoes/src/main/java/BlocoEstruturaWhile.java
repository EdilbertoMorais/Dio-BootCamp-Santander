
import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

public class BlocoEstruturaWhile {

    // Estrutura do controle de fluxo while

    // while (expressão boolean de validação) {
    //  comando que será executado até que a
    //  expressão de validação se torne falsa}

    public static void main(String[] args) {

        /*
         * Joãozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces gastar
         * o seu dinheiro, logo, enquanto o valor dos doces não igualar a R$ 50,00
         * ele foi adicionando itens no carrinho.
         */

        double mesada = 50.0;
        int contadorDoces = 0;

        // Válida se o valor da variável mesada é maior que 0. Caso positivo, continua o laço.
        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            // valida que o valor da compra não sera negativo
            if (valorDoce > mesada) {
                // garantimos que o último doce comprado terá o valor do saldo da mesada
                // evitamos assim que o numero se torne negativo
                valorDoce = mesada;
            }

            // Esta linha imprime uma mensagem formatada que inclui o valor da variável "valorDoce" no formato R$ 0,00.
            // O símbolo %.2f é usado para substituir o valor da variável "valorDoce", formatado com duas casas decimais após o ponto.
            // O símbolo %n é utilizado para inserir uma quebra de linha no terminal após a impressão da mensagem.
            System.out.printf("Doce no valor de R$ %.2f adicionado ao carrinho. %n", valorDoce);
            contadorDoces = contadorDoces + 1;
            // Local onde tratamos a variável para que a condição se torne false em algum momento
            mesada = mesada - valorDoce;
            System.out.printf("Mesada restante = R$ %.2f%n", mesada);
        }

        System.out.println("___________________________________________________");
        // Impressão para sinalizar que o while encerrou-se
        System.out.println("Joãozinho gastou todo a sua mesada em doces.");
        // Imprime o total de doces comprados
        System.out.println("Total de doces comprados: " + contadorDoces);
    }

    // Função autoexplicativa, gera um número aleatorio para atribuirmos a variável valorDoce.
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 20);
    }
}

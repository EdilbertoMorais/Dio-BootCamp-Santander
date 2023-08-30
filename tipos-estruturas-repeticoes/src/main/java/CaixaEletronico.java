public class CaixaEletronico {
    public static void main(String[] args) {

        //Exemplo de estrutura condicional. (if-else)
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        // Compara se o valorValor solicitado é menor que o saldo.
        if (valorSolicitado < saldo) {
            // Caso a condição acima seja verdadeira, a variável saldo é atualizada, subtraindo-se o valorSolicitado.
            saldo = saldo - valorSolicitado;
            System.out.println("Operação realizada com sucesso.");
            System.out.println("Saldo atual: " + saldo);
        }else {
            // Caso a condição seja falsa, será impresso na tela a mensagem abaixo:
            System.out.println("Saldo Insuficiente");
            System.out.println("Consulte seu saldo.");
        }
    }
}

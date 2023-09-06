import java.util.Scanner;

public class EquilibrandoSaldo2 {
    public static void main(String[] args) {

        double valorDeposito;
        double valorRetirada;

        Scanner scanner = new Scanner(System.in);

        double saldoAtual = parseInputDouble(scanner.next());

        valorDeposito = obterValorValido(scanner);
        valorRetirada = obterValorValido(scanner);

        scanner.close();

        saldoAtual = calcularSaldoAtualizado(saldoAtual, valorDeposito, valorRetirada);

        exibirSaldoAtualizado(saldoAtual);
    }

    private static double obterValorValido(Scanner scanner) {
        double valor;
        do {
            valor = parseInputDouble(scanner.next());
            if (valor < 0)
                System.out.println("Valor não pode ser menor que 0");
        } while (valor < 0);
        return valor;
    }

    private static double calcularSaldoAtualizado(double saldoAtual, double valorDeposito, double valorRetirada) {
        if (saldoAtual < 0) {
            return saldoAtual + valorDeposito;
        } else if (valorRetirada > saldoAtual + valorDeposito) {
            return saldoAtual + valorDeposito;
        } else {
            return saldoAtual + valorDeposito - valorRetirada;
        }
    }

    private static void exibirSaldoAtualizado(double saldoAtual) {
        System.out.printf("Saldo atualizado na conta: %.1f%n", saldoAtual);
    }

    private static double parseInputDouble(String input) {
        // Substitui ',' por '.' e depois converte para double
        input = input.replaceAll("[^\\d.|/?=-]", ".");
        return Double.parseDouble(input);
    }
}

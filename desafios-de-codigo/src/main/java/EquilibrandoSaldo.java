import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {

        double valorDeposito;
        double valorRetirada;

        Scanner scanner = new Scanner(System.in);

        double saldoAtual = parseInputDouble(scanner.next());

        do {
            valorDeposito = parseInputDouble(scanner.next());
            if (valorDeposito < 0)
                System.out.println("Valor não pode ser menor que 0");
        } while (valorDeposito < 0);

        do {
            valorRetirada = parseInputDouble(scanner.next());
            if (valorRetirada < 0)
                System.out.println("Valor não pode ser menor que 0");
        } while (valorRetirada < 0);

        scanner.close();

        if (saldoAtual < 0) {
            saldoAtual = saldoAtual + valorDeposito;
            System.out.println("Saque não realizado. Saldo Insuficiente.");
            System.out.printf("Saldo atualizado na conta: %.1f%n", saldoAtual);
        } else if (valorRetirada > saldoAtual + valorDeposito) {
            saldoAtual = saldoAtual + valorDeposito;
            System.out.printf("Saldo insuficiente. Saldo na conta: %.1f%n", saldoAtual);
        } else {
            saldoAtual = saldoAtual + valorDeposito - valorRetirada;
            System.out.printf("Saldo atualizado na conta: %.1f%n", saldoAtual);
        }
    }

    private static double parseInputDouble(String input) {
        // Substitui ',' por '.' e depois converte para double
        input = input.replaceAll("[^\\d.|/?=-]", ".");
        return Double.parseDouble(input);
    }
}

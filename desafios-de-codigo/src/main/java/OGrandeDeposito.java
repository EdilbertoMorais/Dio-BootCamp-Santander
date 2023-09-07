import java.util.Locale;
import java.util.Scanner;

public class OGrandeDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double valor = obterValorDoubleValido(scanner);
    }

    private static double obterValorDoubleValido(Scanner scanner) {
        double valor = 1;
        String input = scanner.nextLine();
        valor = analisarEntradaDouble(input);
        if (valor > 0) {
            System.out.printf("Deposito realizado com sucesso!\nSaldo atual: R$ %.2f%n", valor);
        } else if (valor < 0) {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        } else {
            System.out.print("Encerrando o programa...");
        }
        return valor;
    }

    private static double analisarEntradaDouble(String entrada) {
        entrada = entrada.replace(',', '.');
        return Double.parseDouble(entrada);
    }
}

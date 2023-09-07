import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormat df = new DecimalFormat("#.00"); // Formato para duas casas decimais

        double valorInicial = obterValorDoubleValido(scanner);
        double taxaJuros = obterValorDoubleValido(scanner);
        int periodo = obterValorInteiroValido(scanner);
        double valorFinal = valorInicial;

        scanner.close();
        // Iterar ao longo do período para calcular o valor final com juros compostos
        for (int i = 0; i < periodo; i++) {
            valorFinal += valorFinal * taxaJuros;
        }

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
    }

    private static double parseInputDouble(String input) {
        input = input.replace(',', '.');
        return Double.parseDouble(input);
    }

    private static double obterValorDoubleValido(Scanner scanner) {
        double valor = 0;
        boolean entradaValida;
        do {
            String input = scanner.next();
            entradaValida = false;
            try {
                valor = parseInputDouble(input);
                if (valor < 0) {
                    System.out.println("Valor não pode ser menor que 0");
                } else {
                    entradaValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
            }
        } while (!entradaValida);
        return valor;
    }

    private static int obterValorInteiroValido(Scanner scanner) {
        int valor = 0;
        boolean entradaValida;
        do {
            String input = scanner.next();
            entradaValida = false;
            try {
                valor = Integer.parseInt(input);
                if (valor < 0) {
                    System.out.println("Valor não pode ser menor que 0");
                } else {
                    entradaValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro válido.");
            }
        } while (!entradaValida);
        return valor;
    }
}

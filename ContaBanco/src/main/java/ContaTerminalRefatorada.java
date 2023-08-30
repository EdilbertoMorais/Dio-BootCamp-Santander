import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminalRefatorada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numeroConta = obterNumeroConta(scanner);
        int numeroAgencia = obterNumeroAgencia(scanner);
        int digitoAgencia = obterDigitoAgencia(scanner);
        String agencia = String.format("%03d-%d", numeroAgencia, digitoAgencia);
        String nomeCliente = obterNomeCliente(scanner);
        BigDecimal saldo = obterSaldo(scanner);

        scanner.close();

        String saldoFormatado = String.format("R$ %.2f", saldo);

        System.out.println();
        System.out.println("*************************************************");
        System.out.println("Olá " + nomeCliente + ",");
        System.out.println("obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é a " + agencia + ", sua conta " + numeroConta + ",");
        System.out.println("e seu saldo de " + saldoFormatado + " já está disponível para saque.");
    }

    // Métodos auxiliares
    private static int obterNumeroConta(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Por favor, digite o número da Conta: ");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Certifique-se de inserir apenas números válidos.");
                scanner.nextLine(); // Limpa a entrada incorreta
            }
        }
    }

    private static int obterNumeroAgencia(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Por favor, digite o número da agência sem o dígito: ");
                return Integer.parseInt(String.valueOf(scanner.nextInt()));
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Certifique-se de inserir apenas números válidos.");
                scanner.nextLine(); // Limpa a entrada incorreta
            }
        }
    }

    private static int obterDigitoAgencia(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Por favor, digite o número da agência sem o dígito: ");
                return Integer.parseInt(String.valueOf(scanner.nextInt()));
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Certifique-se de inserir apenas números válidos.");
                scanner.nextLine(); // Limpa a entrada incorreta
            }
        }
    }

    private static String obterNomeCliente(Scanner scanner) {
        System.out.print("Digite o nome do cliente: ");
        scanner.nextLine(); // Limpa a nova linha pendente após a entrada anterior
        return scanner.nextLine();
    }

    private static BigDecimal obterSaldo(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Informe o valor para o primeiro depósito: ");
                String saldoInput = scanner.nextLine();
                saldoInput = saldoInput.replace(",", ".");
                return new BigDecimal(saldoInput);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Certifique-se de inserir um valor numérico válido.");
            }
        }
    }
}

import java.util.Scanner;

public class CondicionalmenteRico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saldoTotal = obterValorValido(scanner);
        int valorSaque = obterValorValido(scanner);

        calcularSaldoAtualizado(saldoTotal, valorSaque);
    }

    private static int obterValorValido(Scanner scanner) {
        int valor;
        do {
            valor = scanner.nextInt();
            if (valor < 0)
                System.out.println("Valor não pode ser menor que 0");
        } while (valor < 0);
        return valor;
    }

    private static void calcularSaldoAtualizado(int saldoTotal, int valorSaque) {
        if (saldoTotal > valorSaque) {
            saldoTotal = saldoTotal - valorSaque;
            System.out.print("Saque realizado com sucesso. Novo saldo: " + saldoTotal);
        } else {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }
    }
}

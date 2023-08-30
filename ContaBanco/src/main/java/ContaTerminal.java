import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numeroConta;
        String agencia;
        String nomeCliente;
        //BigDecimal oferece uma representação decimal de ponto fixo,
        //permitindo manipulação precisa de valores decimais sem os problemas de arredondamento inerentes aos tipos de ponto flutuante.
        BigDecimal saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        while (true) {
            try {
                System.out.print("Por favor, digite o número da Conta: ");
                numeroConta = scanner.nextInt();
                // Sai do loop se a entrada for válida
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Certifique-se de inserir apenas números válidos.");
                // Limpa a entrada incorreta
                scanner.nextLine();
            }
        }

        int numeroAgencia;
        while (true) {
            try {
                System.out.print("Por favor, digite o número da agência sem o digito: ");
                numeroAgencia = Integer.parseInt(String.valueOf(scanner.nextInt()));
                break;
            }catch (InputMismatchException e){
                System.out.println("Entrada inválida. Certifique-se de inserir apenas números válidos.");
                // Limpa a entrada incorreta
                scanner.nextLine();
            }
        }

        int digitoAgencia;
        while (true) {
            try {
                System.out.print("Por favor, digite o dígito da agência: ");
                digitoAgencia = Integer.parseInt(String.valueOf(scanner.nextInt()));
                break;
            }catch (InputMismatchException e){
                System.out.println("Entrada inválida. Certifique-se de inserir apenas números válidos.");
                // Limpa a entrada incorreta
                scanner.nextLine();
            }
        }

        //O String.format formata os valores das variáveis numeroAgencia e digitoAgencia em uma representação de agência com três dígitos,
        // preenchendo com zeros à esquerda se necessário, e separa o quarto número com um hífen. Ex: 123-4
        agencia = String.format("%03d-%d", numeroAgencia, digitoAgencia);

        System.out.print("Digite o nome do cliente: ");
        // Esse scanner.next() é apenas para consumir a nova linha pendente após a entrada anterior
        scanner.nextLine();
        nomeCliente = scanner.nextLine();

        while (true) {
            try {
                System.out.print("Informe o valor para primeiro deposito: ");
                String saldoInput = scanner.nextLine();
                //Esta linha utiliza o método replace() para substituir todas as vírgulas (,) na string saldoInput por pontos (.)
                saldoInput = saldoInput.replace(",", ".");
                // Nesta linha, a string saldoInput, que foi processada para usar o ponto como separador decimal, é convertida em um objeto BigDecimal.
                saldo = new BigDecimal(saldoInput);
                break;
            }catch (NumberFormatException e){
                System.out.println("Entrada inválida. Certifique-se de inserir apenas números válidos.");
            }
        }

        scanner.close();

        // Pegamos o valor do saldo e formatamos para ser impressa como R$ 123,45.
        String saldoFormatado = String.format("R$ %.2f", saldo);

        System.out.println();
        System.out.println("*************************************************");
        System.out.println("Olá " + nomeCliente + ",");
        System.out.println("obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é a " + agencia + ", sua conta " + numeroConta + ",");
        System.out.println("e seu saldo de " + saldoFormatado + " já está disponível para saque.");

    }
}

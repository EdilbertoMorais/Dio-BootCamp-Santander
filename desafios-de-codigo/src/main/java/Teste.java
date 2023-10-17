import java.text.DecimalFormat;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        String[] partes = entrada.split(",");

        // Verifique se há quatro elementos separados por vírgula
        if (partes.length != 4) {
            System.out.println("Formato de entrada inválido. Siga o exemplo: data,hora,descricao,valor");
            return;
        }

        String data = partes[0];
        String hora = partes[1];
        String descricao = partes[2];
        double valor = Double.parseDouble(partes[3]);

        // Crie uma instância da classe Transacao com os valores fornecidos
        Transacao transacao = new Transacao(data, hora, descricao, valor);

        // Imprima as informações da transação
        transacao.imprimir();
    }
}

class Transacao {
    private String data;
    private String hora;
    private String descricao;
    private double valor;

    public Transacao(String data, String hora, String descricao, double valor) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println("Transação: " + this.descricao);
        System.out.println("Data: " + this.data);
        System.out.println("Hora: " + this.hora);
        System.out.printf("Valor: R$%.2f%n", this.valor);
    }
}
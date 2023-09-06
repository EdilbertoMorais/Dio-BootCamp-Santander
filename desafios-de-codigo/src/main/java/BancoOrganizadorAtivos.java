import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ativos = new ArrayList<>();

        int quantidadeAtivos = validarQuantidadeAtivos(scanner);

        // Entrada dos códigos dos ativos
        for (int i = 0; i < quantidadeAtivos; i++) {
            String codigoAtivo = scanner.nextLine();
            ativos.add(codigoAtivo);
        }
        scanner.close();

        Collections.sort(ativos);

        for (String ativo : ativos) {
            System.out.println(ativo);
        }
    }

    private static int validarQuantidadeAtivos(Scanner scanner) {
        int quantidadeAtivos;
        do {
            quantidadeAtivos = scanner.nextInt();
            scanner.nextLine();
            if (quantidadeAtivos <= 0)
                System.out.println("Quantidade de ativos deve ser maior que 0.");
        } while (quantidadeAtivos <= 0);
        return quantidadeAtivos;
    }
}

import java.util.Locale;
import java.util.Scanner;

public class AboutMeComScanner {
    public static void main(String[] args) {
        //Criando um objeto Scanner com a convenção americana.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Imprime uma mensagem na tela do terminal, solicitando a entrada de dado pelo usuário.
        System.out.print("Digite seu Nome: ");
        // Pega o dado passado pelo usuário e armazena na variável nome.
        String nome = scanner.next();

        System.out.print("Digite seu sobre nome: ");
        //Essa chamada de método é apenas para burlar uma falha do nextLine().
        scanner.nextLine();
        // Pega o dado passado pelo usuário e armazena na variável sobreNome.
        String sobreNome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        // Pega o dado passado pelo usuário e armazena na variável idade.
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        // Pega o dado passado pelo usuário e armazena na variável altura.
        double altura = scanner.nextDouble();

        //Imprime as informações passadas pelo usuário no terminal.
        System.out.println("Olá, me chamo " + nome + " " + sobreNome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
    }
}

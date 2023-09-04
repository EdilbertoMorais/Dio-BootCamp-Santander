import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        /*
         * Cria uma instância da classe Scanner em Java
         * para ler entrada a partir do fluxo de entrada padrão (normalmente o teclado)
         * e configura essa instância para usar a convenção de
         * localização (locale) dos Estados Unidos (US).
         */
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome =  lerNome(scanner);
        String sobreNome =  lerSobrenome(scanner);
        int idade = lerIdade(scanner);
        double altura = lerAltura(scanner);

        scanner.close();

        imprimirDados(nome, sobreNome, idade, altura);
    }

    // Métodos auxiliares
    private static String lerNome(Scanner scanner) {
        System.out.print("Digite o seu nome: ");
        //Usamos o método replaceAll da classe String juntamente com uma expressão
        // regular [0-9] para substituir todos os caracteres que são dígitos de 0 a 9
        // na string nome por uma string vazia ("").
        return scanner.nextLine().replaceAll("[0-9]", "");
    }

    private static String lerSobrenome(Scanner scanner) {
        System.out.print("Digite o seu sobrenome: ");
        //Usamos o método replaceAll da classe String juntamente com uma expressão
        // regular [0-9] para substituir todos os caracteres que são dígitos de 0 a 9
        // na string sobrenome por uma string vazia ("").
        return scanner.nextLine().replaceAll("[0-9]", "");
    }

    /**
    Esta função lerIdade lê a idade do usuário, garantindo que a entrada seja um número inteiro válido.
    Se o usuário inserir uma entrada inválida, ele será solicitado a tentar novamente até fornecer uma entrada correta.

    @param scanner Dado de entrada do usuário.
    @return Armazena na variável idade o valor informado pelo usuário.
     */
    private static int lerIdade(Scanner scanner) {
        //Inicia um loop infinito para garantir que o usuário forneça uma entrada válida.
        while (true){
            try {
                System.out.print("Digite sua idade: ");
                //Tenta converter o texto lido em um número inteiro usando Integer.parseInt().
                // se o usuário inserir algo que não seja um número inteiro válido (por exemplo, texto ou números com decimais),
                // uma exceção NumberFormatException será lançada.
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Certifique-se de inserir apenas números válidos: ");
            }
        }
    }

    private static double lerAltura(Scanner scanner) {
        //Inicia um loop infinito para garantir que o usuário forneça uma entrada válida.
        while (true) {
            try {
                System.out.print("Digite sua altura: ");
                // Lê a entrada do usuário usando scanner.nextLine() e substitui qualquer vírgula(,) por ponto(.) usando replace.
                String input = scanner.nextLine().replace(',', '.');
                // Tenta analisar a string como um número de ponto flutuante usando, caso contrário, lança uma exceção.
                double altura = Double.parseDouble(input);
                // Arredonda o valor para 2 casas decimais usando Math.round()
                        altura = Math.round(altura * 100.0) / 100.0;
                // Retorna o valor da altura validado e arredondado.
                return altura;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número válido.");
            }
        }
    }

    private static void imprimirDados(String nome, String sobreNome, int idade, double altura) {
        System.out.println("*****************");
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobreNome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm ");
        System.out.println("e é um prazer conhecê-lo");
    }
}

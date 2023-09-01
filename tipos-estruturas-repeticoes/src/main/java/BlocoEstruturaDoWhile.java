import java.util.Random;

public class BlocoEstruturaDoWhile {

    // estrutura do controle de fluxo do-while

    /*
        do
        {
       comando que será executado até que a
       expressão de validação torne-se falsa
        }
        while(expressão boolean de validação);
     */

    public static void main(String[] args) {
        /*
        Joãozinho resolveu ligar para o seu amigo dizendo que hoje se entupiu de doces.
         */

        System.out.println("Discando ...");

        do {
            // executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");
        } while (tocando());

        System.out.println("Alô !!!");
    }

    private static boolean tocando() {
        // O método Random().nextInt() no caso abaixo gera um número aleatório entre 1 e 3 e caso o numero seja
        // igual a 1 ele atribui a variável atendeu o valor true.
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocando
        return !atendeu;
    }
}

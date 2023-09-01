public class ExemploBreakContinue {
    public static void main(String[] args) {

        for (int numero = 1; numero <= 5; numero++){
            // fluxo condicional dentro do laço de repetição que indica que quando a variável
            // número for igual a 3, deve ser entrar do bloco de execução do if e interromper o laco com o comando break.
            if (numero == 3)
                break;

            System.out.println(numero);
        }

        System.out.println("***********************************");

        for (int numero = 1; numero <= 5; numero++){
            // Fluxo condicional dentro do laço de repetição que indica que quando a variável
            // número for igual a 3, deve ser entrar do bloco de execução do if e interromper apenas este laço de repetição.
            // Em outras palavras, é como se ele pulasse(Ignora) o loço em que esta a condição e fosse para o próximo.
            if (numero == 3)
                continue;

            System.out.println(numero);
        }
    }
}

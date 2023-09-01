public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 4;
        /*
        Estrutura de fluxo condicional encadeada
        */

        //Analisa se a nota é maior ou igual a 7.
        if (nota >= 7) {
            // Caso seja verdadeiro, será impresso a mensagem abaixo.
            System.out.println("Aprovado.");
            // Analisa se a nota esta entre 5 e 7.
        } else if (nota >= 5 && nota < 7) {
            // Caso seja verdadeiro, será impresso a mensagem abaixo.
            System.out.println("Prova de Recuperação.");
            // Caso a nota não esteja dentro de nenhuma das condições acima.
        } else {
            // Será impresso a mensagem abaixo.
            System.out.println("Reprovado.");
        }
    }
}

public class ExemploForComArrays {
    public static void main(String[] args) {
        // Definindo um array de tipo String e atribuindo os nomes entre {} como valores aos elementos do array.
        // Cada elemento do array deve ser separado pela vírgula dentro do bloco de elementos que compõem o array.
        String[] alunos = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        // Usamos a variável i para iterar a cada loop do for até que ele seja do mesmo tamanho que o array.
        // Em arrays o índice se inicia em ZERO, por esse motivo o bloco de inicialização usa a sintaxe int i = 0;
        // A incrementação ocorre a cada loop atribuíndo o valor de i em + 1.
        // Representado aqui como alunos.length (função que pega o tamanho do array)
        for (int i = 0; i < alunos.length; i++) {
            // Usamos a concatenação de String com as variáveis para ser impresso da seguinte forma:
            // O aluno no índice 0 = (que é representado pela variável i) é o(a) FELIPE = (que é representado pela variável alunos[i]).
            System.out.println("O aluno no índice " + i + " é o(a) " + alunos[i] + ".");
        }

        //Outro exemplo de forma abreviada

        String[] alunos2 = {"ANA", "JOANA", "MARTA", "SONIA"};

        // Usado apenas para separar as duas impressões no terminal.
        System.out.println("*****************************************************");

        // Neste caso, temos elementos do tipo String, definimos a variável de escopo aluna onde o (:) diz que a cada iteração
        // do array de alunos2 no índice atual, vai atualizar a variável de escopo aluna, onde a cada iteração a variável aluna
        // terá um novo valor correspondente ao valor do índice do array.
        for (String aluna : alunos2) {
            System.out.println("Nome do aluna(a) é: " + aluna);
        }
    }
}

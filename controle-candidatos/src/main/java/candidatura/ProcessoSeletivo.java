package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);

        System.out.println();
        selecaoCandidatos();

        System.out.println();
        imprimirSelecionados();

        System.out.println();
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    /**
     * Entra em contato com um candidato e conta quantas tentativas foram necessárias para obter
     * sucesso ou até que o número máximo de tentativas (3) seja alcançado.
      * @param candidato
     */
    static void entrandoEmContato(String candidato) {
        // Inicializa o contador de tentativas em 1.
        int tentativasRealizadas = 1;
        // Inicializa a variável de controle para continuar tentando como true.
        boolean continuarTentando = true;
        //Inicializa a variável que indica se o contato foi atendido como false.
        boolean atendeu = false;

        // Inicia um loop do-while que continuará executando enquanto continuarTentando for true e tentativasRealizadas for menor que 3.
        do {
            // Chama a função atender() que retorna true se o contato for atendido.
            atendeu = atender();
            // Inverte o valor de continuarTentando se o contato não for atendido.
            continuarTentando = !atendeu;
            if (continuarTentando)
                // Incrementa o contador de tentativas se o contato não for atendido.
                tentativasRealizadas++;
            else
                System.out.print("CONTATO REALIZADO COM SUCESSO.");
            // Condição de saída do loop.
        } while (continuarTentando && tentativasRealizadas < 3);
        // Verifica se o contato foi atendido ou não, e exibe mensagens apropriadas.
        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas);
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADAS.");
    }

    ;

    /**
     * A função atender() visa simular um evento probabilístico que retorna true
     * com uma probabilidade de 1/3 (ou aproximadamente 33,33%) e false
     * com uma probabilidade de 2/3 (ou aproximadamente 66,67%).
     * @return retorna true se o número aleatório for igual a 1 e false caso contrário.
     */
    static boolean atender() {
        //Gera um número aleatório entre 0 (inclusive) e 2 (inclusive).
        //A função retorna true se o número aleatório for igual a 1 e false caso contrário.
        return new Random().nextInt(3) == 1;
    }

    /**
     * Imprime uma lista de nomes de candidatos armazenados em um array.
     */
    static void imprimirSelecionados() {
        // Definir um array de strings com nomes de candidatos
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento: ");
        // Usar um loop for para iterar através do array
        for (int i = 0; i < candidatos.length; i++) {
            // Imprimir o índice do candidato (começando em 1) e o nome do candidato
            System.out.println("O candidato de n° " + (i + 1) + " é " + candidatos[i]);
        }

        System.out.println();
        System.out.println("Forma abreviada de iteração for each");
        // Usa um loop foreach para iterar através do array
        for (String candidato : candidatos) {
            // Imprimir o nome do candidato
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    /**
     * Este método realiza uma seleção de candidatos com base em seus salários pretendidos.
     * Ele começa com uma lista de nomes de candidatos,
     * um salário base para comparação e, em seguida, itera pela lista de candidatos
     */
    static void selecaoCandidatos() {
        // Lista de nomes de candidatos em formato de array
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        // Contadores para o número de candidatosSelecionados e o candidatoAtual
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        // Salário base para comparação
        double salarioBase = 2000.0;
        // Enquanto não forem selecionados 5 candidatos e houver candidatos na lista
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            // Obtém o nome do candidato atual
            String candidato = candidatos[candidatosAtual];
            // Gera um valor de salário pretendido para o candidato e atribui a variável salarioPretendido
            double salarioPretendido = valorPretendido();
            // Exibe o nome do candidato e o salário pretendido formatado (R$ 2000,00)
            System.out.print("O candidato " + candidato + " Solicitou este valor de salário: ");
            System.out.printf("R$ %.2f%n", salarioPretendido);
            // Verifica se o salário base é maior que o salário pretendido do candidato
            if (salarioBase > salarioPretendido) {
                // Se for maior, o candidato é selecionado e o contador é incrementado
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            // Avança para o próximo candidato na lista
            candidatosAtual++;
        }
    }

    /**
     * Método que simula um salarioPretendido informado pelo candidato
     * com variação de R$ 1.800,00 até R$ 2.200,00
     *
     * @return Retorna um valor dentro do range informado(R$ 1.800,00 até R$ 2.200,00)
     */
    static double valorPretendido() {
        return Math.round(ThreadLocalRandom.current().nextDouble(1800, 2200));
    }

    /**
     * Método que válida se o salário pretendido é MAIO, MENOR ou IGUAL
     * ao salário base oferecido para a vaga
     *
     * @param salarioPretendido
     * @return Imprime uma mensagem conforme o resultado da válidação do método
     */
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}

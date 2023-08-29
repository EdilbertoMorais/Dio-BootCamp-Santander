/**
 * Comentarios
 * Esta classe exemplifica a utilização de comentários Javadoc em métodos e parâmetros.
 * Consulte os métodos individualmente para mais detalhes.
 * <p>
 * <b>Note: </b> Leia atentamente a documentação desta classe
 * para desfrutar dos recursos oferecidos pelo autor.
 *
 * @author Edilberto Morais
 * @version 1.0
 * @since 29/08/2023
 */
public class Comentarios {

    /**
     * Método principal que inicia a execução do programa.
     *
     * @param args Os argumentos da linha de comando (não são usados neste exemplo).
     */
    public static void main(String[] args) {
        // Olá, eu sou um comentário em uma única linha.

        /*Olá,
        Eu sou um comentário
        que posso ser mais detalhado
        quando necessário.
         */

        //chamada da função saudacao() que imprime a palavra olá no terminal.
        saudacao();
    }

    /**
     * Construtor padrão da classe Comentarios.
     * Este construtor não realiza nenhuma ação especial.
     */
    public Comentarios() {
        // Nenhum código necessário aqui
    }

    /**
     * Este método é apenas para ilustrar o exemplo de comentário.
     * Estas duas estrelinhas acima
     * é para identificar que você
     * pretende elaborar um comentário
     * a nível de documentação.
     */
    public static void saudacao() {
        System.out.println("Olá");
    }

    // Abaixo uma forma incorreta de se utilizar comentários para explicar um código de péssima qualidade.

    /**
    Este método foi elaborado as pressas
    por isso eu abreviei o nome das variáveis,
    mas olha, ele tem a finalidade de somar ou multiplicar
    dois números.
     */

    /**
     * Realiza a soma e multiplicação de dois números inteiros.
     *
     * @param n O primeiro número inteiro.
     * @param x O segundo número inteiro.
     * @param m Uma string de descrição (que não é utilizada no cálculo).
     * @return O resultado da soma e multiplicação dos números.
     */
    public int somaMultiplica(int n, int x, String m) {
        int r = 0;
        if (m == "M") { // M= Multiplicação
            r = n + x;
        } else {
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }
    //Os comentários acima foram aplicados de forma incorreta, pois estão tentando explicar trechos do código que não estão claros
    //O código deve ser escrito de forma legível sem ser necessário comentários extras para o seu entendimento
}

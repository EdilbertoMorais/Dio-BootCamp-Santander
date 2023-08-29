
/**
 * Assuntos abordados nessa parte do projeto:<p>
 * - Qual proposta principal do método?<p>
 * R: Você deve se perguntar constantemente até compreender a real finalidade do mesmo<p>
 * - Qual o tipo de retorno esperado após a execução do método?<p>
 * R: Você deve analisar se o método será responsável por retornar algum valor ou não. Caso negativo, ele será representado pela palavra void<p>
 * - Quais os parâmetros serão necessários para a execução do método?<p>
 * R: Os métodos às vezes precisão de argumentos como critérios para a execução.<p>
 * - O método possui risco de apresentar alguma exceção?<p>
 * R: Exceções são comuns na execução de métodos, às vezes é necessário prever e tratar a possível existência de uma exceção.<p>
 * - Qual a visibilidade do método?<p>
 * R: Será necessário que o método seja visível a toda a aplicação, somente em mesmo pacotes, através de herança ou somente ao nível a própria classe.<p>
 **/
public class Usuario {
    public static void main(String[] args) {
        //Instânciando o objeto SmartTv
        SmartTv smartTv = new SmartTv();

        //Verificando o status inicial da TV (ligada ou desligada)
        System.out.println("TV Ligada ? = " + smartTv.ligada);
        // Chamando o método que liga a TV
        smartTv.ligar();
        System.out.println("LIGANDO A TV - TV Ligada ? = " + smartTv.ligada);
        // Chamando o método que desliga a TV
        smartTv.desligar();
        System.out.println("DESLIGANDO A TV - TV Ligada ? = " + smartTv.ligada);
        //Pula uma linha no console apenas para facilitar a visualização.
        System.out.println();

        //Os demais métodos seguem o mesmo princípio do ligar e desligar
        System.out.println("Qual volume atual ? = " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("AUMENTANDO O VOLUME - Qual volume atual ? = " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("DIMINUINDO O VOLUME - Qual volume atual ? = " + smartTv.volume);
        System.out.println();

        System.out.println("Qual canal atual ? = " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("AUMENTANDO O CANAL - Qual canal atual ? = " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("DIMINUINDO O CANAL - Qual canal atual ? = " + smartTv.canal);
        //A diferença desse método para o método aumentaCanal, é que esse método recebe um parâmetro de entrada do tipo int (canalSelecionado)
        smartTv.mudarDeCanal(33);
        System.out.println("SELECIONANDO O CANAL - Qual canal atual ? = " + smartTv.canal);
    }
}

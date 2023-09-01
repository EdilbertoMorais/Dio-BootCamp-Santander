public class ResultadoEscolarRefatorado {

    public static void main(String[] args) {

        int nota = 3;

        //Expressão Ternária simples que atribui o resultado a uma variável chamada resultado.
//        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
//        System.out.println(resultado);

        //Expressão Ternária encadeada
        // Mesmo efeito que o if/else-if/else
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}

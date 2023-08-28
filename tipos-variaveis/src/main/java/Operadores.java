public class Operadores {
    public static void main(String[] args) {

        System.out.println("<<<<<<<<<<<<<<< TIPOS DE VARIÁVEIS >>>>>>>>>>>>>>>");
        // exemplo de resto de uma divisão
        int modulo = 18 % 3;
        System.out.println("Valor do resto da divisão de 18/3= " + modulo);

        //Declarando o valor da variável número e atribuindo o valor de 5 à ela.
        int numero = 5;
        // neste caso eu estou apenas invertendo o valor de positivo para negativo sem alterar o valor da variável numero.
        System.out.println(-numero);
        System.out.println(numero);
        // para alterar o valor da variável, deve ser declarado da seguinte forma:
        numero = -numero;
        System.out.println("Novo valor atribuído a variável= " + numero);
        // para pegar o valor de uma variável negativa e invertê-lo para positivo, devemos declarar da seguinte forma:
        numero = numero * -1;
        System.out.println("Invertendo número negativo em positivo= " + numero);

        System.out.println();
        System.out.println("<<<<<<<<<<<<<<< EXEMPLO DE REPETIÇÃO >>>>>>>>>>>>>>>");

        int valorIncremento = 5;
        // Para incrementar o valor da variável em 1 elemento, deve se declarar da seguinte forma:
        valorIncremento++;
        //A declaração acima é o mesmo que declararmos valorIncremento = valorIncremento + 1.

        System.out.println("Resultado do INCREMENTO da variável valorIncremento que valia 5 em mais 1. RESULTADO: " + valorIncremento);

        //Mesma regra se aplica ao Decremento usando o operador de subtração (-)
        valorIncremento--;
        System.out.println("Resultado do DECREMENTO da variável valorIncremento que valia 6 em menos 1. RESULTADO: " + valorIncremento);

        //Negando um valor booleano:
        boolean passouNoTeste = true;
        //Imprimindo o valor da variável passouNoTeste:
        System.out.println("Valor da variável: " + passouNoTeste);
        //Invertendo o valor da variável para false apenas na memoria, pois o valor dela ainda continua sendo true:
        System.out.println("Valor impresso INVERTIDO em memória: " + !passouNoTeste);
        System.out.println("Valor da variável sem alterações: " + passouNoTeste);
        //Para se inverter o valor da variável para false, deve se reatribuir o valor à ela:
        passouNoTeste = !passouNoTeste;
        System.out.println("Novo valor atribuído a variável: " + passouNoTeste);

        System.out.println();
        System.out.println("<<<<<<<<<<<<<<< OPERADOR TERNÁRIO >>>>>>>>>>>>>>>");

        int a = 5;
        int b = 6;
        String resultado = "";
        //Exemplo condicional utilizando uma estrutura if/esle:
        // aqui comparamos o valor das variáveis a e b, para sabermos se são iguais, utilizando o operador de igualdade ==

        if (a == b) {
            resultado = "VERDADEIRO";
        } else {
            resultado = "FALSE";
        }
        System.out.println("Resultado do IF: " + resultado);

        //Porem, podemos utilizar o operador ternário (?:) para chegarmos ao mesmo resultado acima:
        int c = 5;
        int d = 5;
        String resutlado2 = c == d ? "VERDADEIRO" : "FALSE";

        System.out.println("RESULTADO usando o operador ternário (?:) = " + resutlado2);

        System.out.println();
        System.out.println("<<<<<<<<<<<<<<< OPERADOR RELACIONAL >>>>>>>>>>>>>>>");
        // Definindo o valor das variáveis numero1 e numero2.
        int numero1 = 1;
        int numero2 = 2;

        //Definindo a variável simNao com o RESULTADO da comparação entre as variáveis numero1 e numero2.
        boolean simNao = numero1 == numero2;
        System.out.println("A variável numero1 é IGUAL a variável numero2? " + simNao);

        //Alterando a variável simNao com o RESULTADO da comparação entre as variáveis numero1 e numero2.
        simNao = numero1 != numero2;
        System.out.println("A variável numero1 é DIFERENTE a variável numero2? " + simNao);

        //Alterando a variável simNao com o RESULTADO da comparação entre as variáveis numero1 e numero2.
        simNao = numero1 < numero2;
        System.out.println("A variável numero1 é MENOR a variável numero2? " + simNao);

        //Alterando a variável simNao com o RESULTADO da comparação entre as variáveis numero1 e numero2.
        simNao = numero1 <= numero2;
        System.out.println("A variável numero1 é MENOR OU IGUAL a variável numero2? " + simNao);

        //Alterando a variável simNao com o RESULTADO da comparação entre as variáveis numero1 e numero2.
        simNao = numero1 > numero2;
        System.out.println("A variável numero1 é MAIOR a variável numero2? " + simNao);

        //Alterando a variável simNao com o RESULTADO da comparação entre as variáveis numero1 e numero2.
        simNao = numero1 >= numero2;
        System.out.println("A variável numero1 é MAIOR OU IGUAL a variável numero2? " + simNao);

        //Também é possível comparar tipos de variáveis e classes.
        String nome1 = "Edilberto";
        String nome2 = "Edilberto";

        System.out.println("COMPARANDO AS VARIÁVEIS NOME1 E NOME2 ");
        System.out.println(nome1 == nome2);

        // Instânciando a variável nome2 em um OBJETO do tipo STRING.
        nome2 = new String("Edilberto");
        System.out.println("COMPARANDO AS VARIÁVEIS NOME1 E NOME2 APOS ALTERARMOS O TIPO DA VARIÁVEL NOME2 ");
        System.out.println(nome1 == nome2);
        //Se usarmos a sintaxe anterior, teremos como retorno um false, pois desse modo estaríamos comparando se o tipo da variável é igual.
        //Quando estamos falando de OBJETOS ou TEXTOS, normalmente usamos o método equals() para fazer as comparações, como no exemplo abaixo,
        //para saber se o CONTEÚDO desses objetos são iguais.
        System.out.println("COMPARANDO O CONTEÚDO DAS VARIÁVEIS NOME1 E NOME2 ");
        System.out.println(nome1.equals(nome2));

        System.out.println();
        System.out.println("<<<<<<<<<<<<<<< OPERADOR LÓGICO >>>>>>>>>>>>>>>");
        boolean condicao1 = true;
        boolean condicao2 = false;

        //Aqui se verifica se a condição1 E a condição2 é TRUE
        if (condicao1 && condicao2) {
            System.out.println("As duas condições são TRUE");
        } else {
            System.out.println("******  Uma das duas condições é FALSE  ******");
        }

        //Aqui se verifica se a condição1 OU a condição2 é TRUE
        if (condicao1 || condicao2) {
            System.out.println("******** Uma das condições é verdadeiras *************");
        } else {
            System.out.println("Nenhuma das condições é verdadeira");
        }

    }
}

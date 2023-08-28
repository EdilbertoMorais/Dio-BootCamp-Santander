public class TiposVariaveis {
    public static void main(String[] args) {

        //Para se declarar um valor inteiro:
        int quantidadeFuncionarios = 100;

        //convenção americana para se declarar um double
        double salarioMinimo = 2500.33;

        // Tipo recomendado para se atribuir a variáveis como CEP e CPF, pois caso o valor da variável se inicie em 0,
        // o Java descataria o número iniciado em 0.
        String cep = "09999000";

        // Toda variável do tipo FLOAT deve ser declarado com o f no final, caso contrário o compilador pode considerá-la como double.
        float PI = 3.14f;

        // O tipo LONG segue o mesmo conceito do FLOAT.
        long registro = 905843075483336l;

        //Para se declarar uma CONSTANTE, deve se usar a palavra reservada em Java FINAL antes do tipo da variável e escrevê-la toda em uppercase:
        final double VALOR_PI = 3.14;

        System.out.println("Olá turma da Dio.");
        System.out.println("Quantidade de funcionários: " + quantidadeFuncionarios);
        System.out.println("Valor do salario mínimo: " + salarioMinimo);
        System.out.println("CEP de exemplo: " + cep);
        System.out.println("Valor de PI: " + PI);
        System.out.println("Número de registro: " + registro);
        System.out.println("Valor da CONSTANTE PI: " + VALOR_PI);

    }
}

public class PlanoOperadora {
    public static void main(String[] args) {

        String plano = "T";

        // Usando um if - else-if - else
        // Neste caso, temos repetições de código, algo que não é uma boa prática
//        if (plano == "B") {
//            System.out.println("100 minutos de ligação.");
//        } else if (plano == "M") {
//            System.out.println("100 minutos de ligação.");
//            System.out.println("WhatsApp e Instagram grátis");
//        } else if (plano == "T") {
//            System.out.println("100 minutos de ligação.");
//            System.out.println("WhatsApp e Instagram grátis");
//            System.out.println("5 Gb de YouTube");
//        }

        //Refatorando o exemplo acima com o switch-case
        // Sem o uso do BREAK, assim que o switch entrar em uma das condições (case1, case2 ou case3), ele continuará as próximas execuções.
        // No caso de selecionarmos o M, ele imprime todas as mensagens abaixo do case "M" e assim sucessivamente.
        switch (plano) {
            case "T":
                System.out.println("5Gb de YouTube");
            case "M":
                System.out.println("WhatsApp e Instagram grátis");
            case "B":
                System.out.println("100 minutos de ligação.");
        }
    }
}

public class BlocoEstruturaFor {

    //Estrutura de controle de fluxo for

//    for(bloco de inicialização; expressão boolean de validação; bloco de atualização) {
//        comando que será executado até que a expressão de validação torne-se falsa.
//    }

    public static void main(String[] args) {
        // vamos imaginar que Joãozinho precisa contar até 20 carneirinhos para pegar no sono

        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            // Usei um if para imprimir apenas o primeiro carneirinho no singular e os demais no plural
            if (carneirinhos == 1) {
                System.out.println(carneirinhos + " Carneirinho");
            } else {
                System.out.println(carneirinhos + " Carneirinhos");
            }
        }
        System.out.println("JOÃOZINHO DORMIU !!!!!!");
    }
}
package exemplointerface.estabelecimento;

import exemplointerface.equipamentos.multifuncional.Multifuncional;

import java.util.Scanner;

public class Fabrica {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Multifuncional multifuncional = new Multifuncional();

        System.out.println("Escolha uma das opções: ");
        System.out.println("1 - Copiar");
        System.out.println("2 - Imprimir");
        System.out.println("3 - Digitalizar");
        System.out.println("4 - Qualquer tecla para Sair.");
        System.out.print("Digite aqui sua opção: ");
        int opcao = teclado.nextInt();
        teclado.close();

        switch (opcao) {
            case 1 -> multifuncional.copiar();
            case 2 -> multifuncional.imprimir();
            case 3 -> multifuncional.digitalizar();
            default -> System.out.println("Saindo ...");
        }
    }
}

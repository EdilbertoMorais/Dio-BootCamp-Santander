package autodromo;

public class Carro extends Veiculo{
    public void ligar(){
        conferePosicaoCambio();
        confereNivelCombustivel();
        System.out.println("CARRO LIGADO\n" +
                "         ______\n" +
                "  __//  ____  \\\\__\n" +
                "| _|   |_____|   |_ |\n");
    }

    private void confereNivelCombustivel(){
        System.out.println("CONFERINDO COMBUSTIVEL");
    }
    private void conferePosicaoCambio(){
        System.out.println("CONFERINDO CAMBIO EM P");
    }
}

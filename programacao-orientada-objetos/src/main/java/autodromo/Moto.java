package autodromo;

public class Moto extends Veiculo{

    public void ligar(){
        ligandoIgnicao();
        colocarCapacete();
        levantarPeApoioMoto();
        System.out.println("MOTO LIGADA\n" +
                "    ,o__\n" +
                "  _ \\<_\n" +
                "(_)>(_)\n");
    }

    private void ligandoIgnicao(){
        System.out.println("LIGANDO IGNIÇÃO");
    }
    private void colocarCapacete(){
        System.out.println("COLOCANDO CAPACETE");
    }
    private void levantarPeApoioMoto(){
        System.out.println("LEVANTANDO PÉ DE APOIO DA MOTO");
    }
}

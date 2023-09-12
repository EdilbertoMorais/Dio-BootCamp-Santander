package estadosbrasileiros;

public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadosBrasileiros e : EstadosBrasileiros.values()){
            System.out.println(e.getSigla() + " - " + e.getNome() + " - " + "IBGE: " + e.getIbge());
        }

        EstadosBrasileiros eb = EstadosBrasileiros.SAO_PAULO;
        System.out.println("******************************************");
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getIbge());
        System.out.println(eb.getNomeMaiusculo());
    }
}

package exemplointerface.equipamentos.impressoras;

public class LaserJet implements Impressora {
    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO COM LASERJET");
    }
}

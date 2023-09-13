package exemplointerface.equipamentos.impressoras;

public class DeskJet implements Impressora {
    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO COM DESKJET");
    }
}

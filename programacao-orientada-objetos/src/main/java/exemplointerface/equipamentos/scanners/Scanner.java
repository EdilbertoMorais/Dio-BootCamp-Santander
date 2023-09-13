package exemplointerface.equipamentos.scanners;

public class Scanner implements Digitalizadora {
    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO COM SCANNER");
    }
}

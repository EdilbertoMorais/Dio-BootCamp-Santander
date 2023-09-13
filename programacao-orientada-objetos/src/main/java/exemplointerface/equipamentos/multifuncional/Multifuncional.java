package exemplointerface.equipamentos.multifuncional;

import exemplointerface.equipamentos.copiadoras.Copiadora;
import exemplointerface.equipamentos.impressoras.Impressora;
import exemplointerface.equipamentos.scanners.Digitalizadora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("COPIANDO COM MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO COM MULTIFUNCIONAL");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO COM MULTIFUNCIONAL");
    }
}

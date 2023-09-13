package exemplointerface.equipamentos.copiadoras;

public class Xerox implements Copiadora {
    @Override
    public void copiar() {
        System.out.println("COPIANDO COM XEROX");
    }
}

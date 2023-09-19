package set.convidado;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributos
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        if (!convidadosSet.isEmpty()) {
            Convidado convidadoParaRemover = null;
            for (Convidado c : convidadosSet) {
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
            if (convidadoParaRemover != null) {
                convidadosSet.remove(convidadoParaRemover);
            } else {
                System.out.println("Código do convite, não localizado.".toUpperCase());
            }
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public void contarConvidados() {
        if (!convidadosSet.isEmpty()) {
            System.out.println("Total de convidados: " + convidadosSet.size());
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public void exibirConvidados() {
        if (!convidadosSet.isEmpty()) {
            System.out.println(convidadosSet);
        }
    }
}

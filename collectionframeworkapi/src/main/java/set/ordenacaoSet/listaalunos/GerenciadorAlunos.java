package set.ordenacaoSet.listaalunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        alunosSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunosSet.isEmpty()) {
            for (Aluno a : alunosSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("A lista está vazia".toUpperCase());
        }
        if (alunoParaRemover == null) {
            System.out.println("Matricula não encontrada.".toUpperCase());
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        if (!alunosSet.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("A lista está vazia.".toUpperCase());
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!alunosSet.isEmpty()) {
            alunosPorNota.addAll(alunosSet);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("A lista esta vazia".toUpperCase());
        }
    }

    public void exibirAlunos() {
        if (!alunosSet.isEmpty()) {
            System.out.println(alunosSet);
        } else {
            System.out.println("A lista está vazia.".toUpperCase());
        }
    }
}

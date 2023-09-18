package list.ordenacao.pessoa;

import list.ordenacao.pessoa.ComparatorPorAltura;
import list.ordenacao.pessoa.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //Atributos
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        //Instância uma lista de pessoas vazia
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public String ordenarPorIdade(){
        //Duplica a lista de pessoaList para a lista de pessoasPorIdade
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        //Ordena a lista pessoasPorIdade utilizando o método sort da classe Collections.
        Collections.sort(pessoasPorIdade);
        //Retorna a lista pessoasPorIdade ordenada por idade e formatada.
        return formatarLista(pessoasPorIdade);
    }

    public String ordenarPorAltura(){
        //Duplica a lista de pessoaList para a lista de pessoasPorAltura
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        //Ordena a lista pessoasPorAltura utilizando o método sort da classe Collections.
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        //Retorna a lista pessoasPorAltura ordenada por idade
        return formatarLista(pessoasPorAltura);
    }

        private String formatarLista(List<Pessoa> lista) {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de Pessoas: ");

        for (int i = 0; i < lista.size(); i++) {
            Pessoa pessoa = lista.get(i);
            sb.append("\nPessoa{" +
                    "nome='").append(pessoa.getNome())
                    .append("', idade=")
                    .append(pessoa.getIdade())
                    .append(", altura=").
                    append(pessoa.getAltura()).append("}");

            if (i < lista.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    // Método toString original, sem ele, ao invocarmos o System.out.println(ordenacaoPessoa);
    // seria impresso no terminal a referência em memória da lista Ex.: list.ordenacao.OrdenacaoPessoa@7a81197d
    @Override
    public String toString() {
        return formatarLista(pessoaList);
    }

}

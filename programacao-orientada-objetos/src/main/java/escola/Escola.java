package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        //Sem a convenção Java Beans. Não foi utilizado os métodos getter e setter.
//        felipe.nome = "Felipe";
//        felipe.idade = 8;
//        System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos.");

        //Usando a convenção Java Beans. Chamando os métodos getters e setters.
        felipe.setNome("FELIPE");
        felipe.setIdade(8);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos.");

    }
}

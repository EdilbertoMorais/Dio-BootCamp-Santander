package pessoa;

public class SistemaCadastro {
    public static void main(String[] args) {
        //Criamos um objeto do tipo Pessoa no sistema
        Pessoa marcos = new Pessoa("Marcos", "123");

        //definimos o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());

    }
}

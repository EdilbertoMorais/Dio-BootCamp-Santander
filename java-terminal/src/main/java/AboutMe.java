public class AboutMe {
    public static void main(String[] args) {

        /**
         * Arquivo criado apenas para ilustrar como seria, o passo a passo para rodar o programa via terminal:
         *
         * No linux, localize o diretório onde está o arquivo MinhaClasse.java
         * no meu caso o caminho é: /home/edilberto/projetos/Dio - BootCamp Santander/Dio-BootCamp-Santander/java-terminal/src/main
         * clique com o botão direito do mouse e abra um terminal
         * com o terminal aberto no diretório do arquivo, digite=  java MinhaClasse.java (e os dados que você quer apresentar na tela do terminal)
         * você verá o retorno na tela do terminal.
         *
         * DICA: execute o programa na IDE antes de efetuar o passo a passo no terminal. Mesmo que seja retornado um erro, o programa será compilado
         */
        String nome = args [0];
        String sobreNome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobreNome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
    }
}

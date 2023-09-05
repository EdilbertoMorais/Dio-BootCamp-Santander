public class FormatadorCepExemplo {
    public static void main(String[] args) {
        /**
         * O código dentro do bloco try é onde a lógica principal do programa está contida.
         * Ele tenta chamar o método formatarCep("2376506") para formatar um CEP.
         * Se uma exceção do tipo CepInvalidoException for lançada durante a execução do código dentro do bloco try,
         * o controle passará para o bloco catch, onde você lida com a exceção. Neste caso, a exceção é capturada na
         * variável e, mas não é usada posteriormente.
         */
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde com as regras de negócio");
            ;
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        //Verifica se o comprimento da string cep não é igual a 8 caracteres.
        // Se não for, isso indica que o CEP não está no formato esperado lançando uma CepInvalidoException.
        if (cep.length() != 8)
            throw new CepInvalidoException();

        //Se o CEP passar na verificação de comprimento, o método retorna uma string formatada
        // como "23.765-064" (um exemplo de CEP formatado).
        return "23.765-064";

    }
}

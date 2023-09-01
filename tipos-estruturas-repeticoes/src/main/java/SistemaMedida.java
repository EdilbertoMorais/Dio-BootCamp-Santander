public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        // Exemplo de if-else encadeado.
//        if (sigla == "P"){
//            System.out.println("PEQUENO");
//        } else if (sigla == "M") {
//            System.out.println("MÉDIO");
//        } else if (sigla == "G") {
//            System.out.println("GRANDE");
//        } else {
//            System.out.println("INDEFINIDO");
//        }

        // Exemplo de uso de um switch-case com mesmo efeito do if - else-if - else acima.
        switch (sigla) {
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MÉDIO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default:
                System.out.println("INDEFINIDO");
        }
    }
}

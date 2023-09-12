package autodromo;

import javax.swing.*;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        System.out.println("*****************  LIGANDO CARRO *********************");
        jeep.setChassi("123abc456def");
        jeep.ligar();

        System.out.println("*****************  LIGANDO MOTO *********************");
        Moto z400 = new Moto();
        z400.setChassi("987jhg654frd");
        z400.ligar();

        System.out.println("*****************  LIGANDO CORINGA *********************");
        Veiculo coringa = z400;
        coringa.ligar();
    }
}

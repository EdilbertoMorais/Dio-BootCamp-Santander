package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    public static void main(String[] args) {
        // Exemplo de Generics para vários tipos
        List<Object> listaSemGenerics = new ArrayList<>();
        // Permite adicionar qualquer tipo de objeto
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10);
        listaSemGenerics.add(10.1885F);
        listaSemGenerics.add('C');
        listaSemGenerics.add(20.90);

        // Exemplo de Generics do tipo String, neste caso só aceita elementos do tipo String.
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");
//        listaGenerics.add(10); // Não permite adicionar qualquer tipo.

        // Iterando sobre a lista de Generics do tipo String
        System.out.println("Lista COM Generics do tipo String");
        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }

        System.out.println();

        // Iterando sobre a lista de Generics de qualquer tipo (não é necessário o uso do CAST)
        System.out.println("Lista COM Generics de qualquer tipo");
        for (Object elemento : listaSemGenerics) {
            System.out.println(elemento);
        }
    }
}
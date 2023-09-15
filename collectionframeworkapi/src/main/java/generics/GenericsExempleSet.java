package generics;

import java.util.HashSet;
import java.util.Set;
    public class GenericsExempleSet {
        public static void main(String[] args) {
            // Exemplo sem Generics
            Set<Object> conjuntoSemGenerics = new HashSet<>();
            conjuntoSemGenerics.add("Elemento 1");
            conjuntoSemGenerics.add(10); // Permite adicionar qualquer tipo de objeto

            // Exemplo com Generics
            Set<String> conjuntoGenerics = new HashSet<>();
            conjuntoGenerics.add("Elemento 1");
            conjuntoGenerics.add("Elemento 2");

            // Iterando sobre o conjunto de Generics do tipo String
            System.out.println("TIPO STRING");
            for (String elemento : conjuntoGenerics) {
                System.out.println(elemento);
            }

            System.out.println();

            // Iterando sobre o conjunto de Generics de qualquer tipo (sem uso de cast)
            System.out.println("TIPO GENÉRICO");
            for (Object elemento : conjuntoSemGenerics) {
                System.out.println(elemento);
            }
        }
    }

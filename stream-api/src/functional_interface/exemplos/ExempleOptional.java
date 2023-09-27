package functional_interface.exemplos;

import java.util.Optional;

public class ExempleOptional {
    public static void main(String[] args) {
//        Optional<String> optionalValue = Optional.ofNullable("Edilberto");
//        String result = optionalValue.orElse("Default TESTE");
//        System.out.println(result);

//        Optional<String> optionalValue = Optional.ofNullable(null);
//        String result = optionalValue.orElseGet(() -> "Value from Supplier");
//        System.out.println(result);

//        Optional<String> optionalValue = Optional.ofNullable(null);
//        String result = optionalValue.orElseThrow(() -> new RuntimeException("VALUE NOT PRESENT"));

        Optional<String> optionalValue = Optional.of("Hello");
        optionalValue.ifPresent(value -> System.out.println("Valor presente: " + value));
    }
}

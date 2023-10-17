package dio.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "Welcome to My Spring Boot Web API <br> Tradução: Bem-vindo à API da Web My Spring Boot";
    }

    @GetMapping("/users")
    public String users() {
        return "Authorized user <br> Tradução: Usuário autorizado";
    }

    @GetMapping("/managers")
    public String managers() {
        return "Authorized manager <br> Tradução: Gerente autorizado";
    }
}
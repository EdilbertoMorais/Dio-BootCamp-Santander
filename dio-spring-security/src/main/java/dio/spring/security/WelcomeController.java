package dio.spring.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "Welcome to My Spring Boot Web API <br> Tradução: Bem-vindo à API da Web My Spring Boot";
    }

    @GetMapping("/users")
    //realiza uma pré-verificação de autorização considerando o perfil do usuário;
    @PreAuthorize("hasAnyRole('MANAGERS','USERS')")
    public String users() {
        return "Authorized user <br> Tradução: Usuário autorizado";
    }

    @GetMapping("/managers")
    //Somente usuários com perfil MANAGERS poderá acessar este recurso;
    @PreAuthorize("hasRole('MANAGERS')")
    public String managers() {
        return "Authorized manager <br> Tradução: Gerente autorizado";
    }
}
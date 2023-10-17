package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WelcomeController {

 @GetMapping
    public String welcome() {
    return "Welcome to my Spring Boot Web API - \nTradução: Bem-vindo à minha API Web Spring Boot";
    }
}

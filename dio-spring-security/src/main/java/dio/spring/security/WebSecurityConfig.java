package dio.spring.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//Definimos que está é uma classe de configuração;
@Configuration
//Aplica a configuração de segurança padrão do Spring ao nosso aplicativo;
@EnableWebSecurity
//Exige que os usuários tenham um perfil (role) apropriado usando anotações de segurança;
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    //Gerenciador de credenciais em memória;
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                //Determinam a criptografia aplicada na senha de cada usuário.
                .password("{noop}user123")
                .roles("USERS")
                .and()
                .withUser("admin")
                .password("{noop}master123")
                .roles("MANAGERS");
    }
    /**
     * Existem algumas implementações de criptografias utilizadas pelo Spring Security
     * Use {bcrypt} for BCryptPasswordEncoder (mais comum);
     * Use {noop} for NoOpPasswordEncoder;
     * Use {pbkdf2} for Pbkdf2PasswordEncoder;
     * Use {scrypt} for SCryptPasswordEncoder;
     * Use {sha256} for StandardPasswordEncoder.
     */
}


package dio.spring.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
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
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //Determinamos acesso público os nossos recursos de login e boas-vindas;
                .antMatchers("/").permitAll()
                // Configura a regra de segurança para permitir que qualquer solicitação POST
                // para a URL "/login" seja acessada sem autenticação.
                .antMatchers(HttpMethod.POST,"/login").permitAll()
                //Somente usuários com perfil managers poderão acessar este recurso;
                .antMatchers("/managers").hasAnyRole("MANAGERS")
                //Somente logins com perfil users ou managers poderão acessar este recurso;
                .antMatchers("/users").hasAnyRole("USERS","MANAGERS")
                //Determinamos a forma de solicitar a requisição como Form Login.
                .anyRequest().authenticated().and().formLogin();
    }
    @Override
    //Gerenciador de credenciais em memória;
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                //Determinam a criptografia aplicada na senha de cada usuário.
                .password("{noop}user123")
                /**
                 * Existem algumas implementações de criptografias utilizadas pelo Spring Security
                 * Use {bcrypt} for BCryptPasswordEncoder (mais comum);
                 * Use {noop} for NoOpPasswordEncoder;
                 * Use {pbkdf2} for Pbkdf2PasswordEncoder;
                 * Use {scrypt} for SCryptPasswordEncoder;
                 * Use {sha256} for StandardPasswordEncoder.
                 */
                .roles("USERS")
                .and()
                .withUser("admin")
                .password("{noop}master123")
                .roles("MANAGERS");
    }
}


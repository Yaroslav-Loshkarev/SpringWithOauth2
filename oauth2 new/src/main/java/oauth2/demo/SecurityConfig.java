package oauth2.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override // переопределение метода базового класса
    public void configure(HttpSecurity httpSecurity) throws Exception {
        //внутри этого метода определим, какие endпоинты требуют аутентификации, а какие - нет
        httpSecurity
                .antMatcher("/**").authorizeRequests() //обязательно залогинен
                .antMatchers("/openinformation").permitAll()
                .anyRequest().authenticated()
                .and()
                .oauth2Login();

    }
}

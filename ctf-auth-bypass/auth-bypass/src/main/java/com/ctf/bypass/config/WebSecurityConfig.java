package com.ctf.bypass.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.RegexRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // VULNERABLE: This regex can be bypassed with encoded characters or semicolons
        http
            .authorizeRequests()
                .requestMatchers(new RegexRequestMatcher(".*/admin/.*", null))
                .hasRole("ADMIN")
                .anyRequest().permitAll()
                .and()
            .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/")
                .permitAll();
    }
}
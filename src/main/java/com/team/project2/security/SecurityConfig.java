package com.team.project2.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // 권한에 따라 허용하는 url 설정
        http
                .authorizeRequests()
                .antMatchers("/**").permitAll()
                .anyRequest().authenticated();

/*

        // login 설정
        http
                .formLogin()
                .loginPage("/login")    // GET
                .loginProcessingUrl("/auth")    // POST
                .usernameParameter("id")
                .passwordParameter("password")
                .defaultSuccessUrl("/");	// 로그인 성공 후 이동할 페이지

        // logout 설정
        http
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/");	// 로그아웃 후 이동할 페이지

*/

        return http.build();
    }
}


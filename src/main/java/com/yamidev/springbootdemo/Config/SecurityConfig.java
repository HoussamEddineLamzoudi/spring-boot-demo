//package com.yamidev.springbootdemo.Config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
//        httpSecurity
//                .csrf().disable()
//                .authorizeHttpRequests()
//                .requestMatchers("/**").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .httpBasic();
//        return httpSecurity.build();
//    }
//}
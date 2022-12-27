//package com.yamidev.springbootdemo.Config;//package com.yamidev.springbootdemo.Config;
//
//
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//public class WebSecurity extends WebSecurityConfigurerAdapter {
//
//    public void SecurityConfig(HttpSecurity httpSecurity) throws Exception{
//
//        httpSecurity
//                .cors().and()
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers(HttpMethod.POST, "/user")
//                .permitAll()
//                .anyRequest()
//                .authenticated();
//    }
//}

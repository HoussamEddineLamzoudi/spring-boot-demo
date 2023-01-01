package com.yamidev.springbootdemo.Controllers;


import com.yamidev.springbootdemo.Config.JwtUtils;
import com.yamidev.springbootdemo.Models.User;
import com.yamidev.springbootdemo.Request.AuthenticationRequest;
import com.yamidev.springbootdemo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @Autowired
    private  AuthenticationManager authenticationManager;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private UserService userService;
    @Autowired
    private JwtUtils jwtUtils;


    @PostMapping
    public ResponseEntity<String> authenticate(@RequestBody AuthenticationRequest authenticationRequest) {
        System.out.println("---auth controller---");
        System.out.println("apller AuthenticationManager :");
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authenticationRequest.getEmail(), authenticationRequest.getPassword())
        );

        System.out.println("back to auth controller");
        User user = userService.find_user_by_email(authenticationRequest.getEmail());
        if(user!=null){
            System.out.println("user not null");
            UserDetails userDetails = new org.springframework.security.core.userdetails.User(
                    user.getEmail(),
                    user.getPassword(),
                    Collections.singleton(new SimpleGrantedAuthority("Normal_User")));
            System.out.println(userDetails);
            return ResponseEntity.ok(jwtUtils.generateToken(userDetails));
//            return ResponseEntity.ok("jwtUtils.generateToken(userDetails)");
        }
        return ResponseEntity.status(400).body("Some error has occurred");
    }
}

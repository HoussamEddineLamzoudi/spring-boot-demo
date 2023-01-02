package com.yamidev.springbootdemo.Controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/admin")
public class AdminController {
    @GetMapping
    public ResponseEntity<String> welcomeAdmin(){
        return ResponseEntity.ok("welcome admine ^^");
    }
}

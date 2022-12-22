package com.yamidev.springbootdemo.Controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
//equal to :

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan(basePackages = "com.yamidev")
@RestController
public class FirstController {

    @GetMapping(value = "/hello")
    public Response helloString(){
        return new Response(
                "Hello",
                "String Boot",
                List.of("Houssam-Eddine", "Mohammed-Amine", "soumiya"),
                "AL borto9ala Almora"
        );
    }

     record Response(
            String msg,
            String projectType,
            List<String> team,
            String teamName
    ){}

}

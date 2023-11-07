package com.example.notasenem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Scanner;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.notasenem.model"})
@ComponentScan(basePackages = {"com.example.notasenem.*"})
@EnableJpaRepositories(basePackages = {"com.example.notasenem.repository"})
@EnableTransactionManagement
@EnableWebMvc
@RestController
public class NotasEnemApplication {

    public static void main(String[] args) { SpringApplication.run(NotasEnemApplication.class, args);



    }

}

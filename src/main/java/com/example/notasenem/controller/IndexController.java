package com.example.notasenem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/aluno")
public class IndexController {

    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity BuscaDeUsuario(){
        return new ResponseEntity("Olá aluno do enem", HttpStatus.OK);
    }
}

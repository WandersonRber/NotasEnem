package com.example.notasenem.controller;

import com.example.notasenem.model.Usuario;
import com.example.notasenem.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/inscrito")
public class IndexController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity <Usuario> BuscaDeUsuario(@PathVariable(value = "id") Long id) {

        Optional<Usuario> usuario = usuarioRepository.findById(id);

        return new ResponseEntity(usuario.get() ,HttpStatus.OK);
    }

    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity<List<Usuario>> usuario(){

        List<Usuario> list = usuarioRepository.findAll();

        return new ResponseEntity<List<Usuario>>(list, HttpStatus.OK);
    }
}

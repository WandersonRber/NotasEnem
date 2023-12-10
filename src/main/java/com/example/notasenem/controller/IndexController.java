package com.example.notasenem.controller;

import com.example.notasenem.model.Usuario;
import com.example.notasenem.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/inscrito")
public class IndexController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Usuario> buscaDeUsuario(@PathVariable(value = "id") Long id) {

        Optional<Usuario> usuario = usuarioRepository.findById(id);

        return new ResponseEntity(usuario.get(), HttpStatus.OK);
    }

    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity<List<Usuario>> usuario() {

        List<Usuario> list = usuarioRepository.findAll();

        return new ResponseEntity<List<Usuario>>(list, HttpStatus.OK);
    }

    @PostMapping(value = "/", produces = "application/json")
    public ResponseEntity<Usuario> novoInscrito(@RequestBody Usuario usuario) {

        Usuario inscritoSalvo = usuarioRepository.save(usuario);

        return new ResponseEntity<Usuario>(inscritoSalvo, HttpStatus.OK);

    }

    @PutMapping(value = "/", produces = "application/json")
    public ResponseEntity<Usuario> atualizarIncristo(@RequestBody Usuario usuario) {

        Usuario inscritoAtualizado = usuarioRepository.save(usuario);

        return new ResponseEntity<Usuario>(inscritoAtualizado, HttpStatus.OK);

    }

    @GetMapping(value = "/{idUsuario}/media", produces = "application/json")
    public ResponseEntity<Float> mediaDoInscrito(@PathVariable(value = "idUsuario") Long idUsuario) {

        Optional<Usuario> usuario = usuarioRepository.findById(idUsuario);

        float media;

        if (usuario.isPresent()) {
            media = (usuario.get().getRedacao() +
                    usuario.get().getNotaMatematica() +
                    usuario.get().getNotaLiguagem() +
                    usuario.get().getNotaCienciasDaNatureza() +
                    usuario.get().getNotaCienciasHumanas()) / 5;

        } else {
            throw new RuntimeException("Usuário não encontrado.");
        }

        return new ResponseEntity(media, HttpStatus.OK);
    }


}


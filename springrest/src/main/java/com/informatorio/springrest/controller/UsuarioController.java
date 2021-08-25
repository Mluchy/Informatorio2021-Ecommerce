package com.informatorio.springrest.controller;

import com.informatorio.springrest.entity.Usuario;
import com.informatorio.springrest.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    //GET todos los usuarios
    @GetMapping
    public Iterable<Usuario> usuariosAll() {
        return usuarioRepository.findAll();
    }

    //GET un usuario por ID
    @GetMapping(value = "/{id}")
    public Usuario usuarioById(@PathVariable("id") Long id) {
          return usuarioRepository.findOneById(id);
    }

    //POST un usuario
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario usuarioCreate(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    //POST bulk de usuarios
    @PostMapping("/bulk")
    @ResponseStatus(HttpStatus.CREATED)
    public Iterable<Usuario> usuarioCreate(@RequestBody List<Usuario> usuario) {
        return usuarioRepository.saveAll(usuario);
    }

    //DELETE de un usuario por id
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void personaDelete(@PathVariable("id") Long id) {
        usuarioRepository.deleteById(id);
    }
    
}

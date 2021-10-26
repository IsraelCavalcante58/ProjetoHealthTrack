package com.HealthTrack.controller;

import com.HealthTrack.model.Usuario;
import com.HealthTrack.service.EditarDadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class EditarDadosController {

    @Autowired
    EditarDadosService service;

    // Post para criar o usuário
    @PostMapping("/criar")
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return service.salvar(usuario);
    }
    @PutMapping("/editar")
    public Usuario editarUsuario(@RequestBody Usuario usuario){
        return service.editar(usuario);
    }

}

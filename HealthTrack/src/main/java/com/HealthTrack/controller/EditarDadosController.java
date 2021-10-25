package com.HealthTrack.controller;

import com.HealthTrack.model.Usuario;
import com.HealthTrack.repository.EditarDadosRepository;
import com.HealthTrack.service.EditarDadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class EditarDadosController {

    @Autowired
    EditarDadosService service;

    @PostMapping("/criar")
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return service.salvar(usuario);
    }

}

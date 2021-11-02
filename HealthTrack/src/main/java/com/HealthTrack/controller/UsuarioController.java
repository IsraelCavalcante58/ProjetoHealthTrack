package com.HealthTrack.controller;

import com.HealthTrack.model.Usuario;
import com.HealthTrack.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService service;
    // Endpoints do usuário
    // Post para criar o usuário
    @PostMapping("/criar")
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return service.salvar(usuario);
    }
    @PutMapping("/editar")
    public Usuario editarUsuario(@RequestBody Usuario usuario){
        return service.editar(usuario);
    }
    @DeleteMapping("/excluir/{id}")
    public void excluirUsuario(@PathVariable Long id){
        service.excluir(id);
    }
    @PutMapping("/editar-peso")
    public Usuario editarPeso(@RequestBody Usuario usuario){
        return service.editarPeso(usuario);
    }

}

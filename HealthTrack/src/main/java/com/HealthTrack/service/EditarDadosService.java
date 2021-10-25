package com.HealthTrack.service;


import com.HealthTrack.model.Usuario;
import com.HealthTrack.repository.EditarDadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditarDadosService {

    @Autowired
    EditarDadosRepository repository; // Instanciando a classe

    public Usuario salvar(Usuario usuario){
        Usuario emailcheck = repository.findByEmail(usuario.getEmail());
        if (emailcheck != null) {
            System.out.println("Email já cadastrado, escolha outro!");
            return null;
        }
        return repository.save(usuario);
    }
}

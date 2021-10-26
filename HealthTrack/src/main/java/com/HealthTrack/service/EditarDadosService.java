package com.HealthTrack.service;


import com.HealthTrack.model.Usuario;
import com.HealthTrack.repository.EditarDadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditarDadosService {

    @Autowired
    EditarDadosRepository repository; // Instanciando a classe

        // Função para salvar um usuário com a condição de não ter o mesmo E-Mail cadastrado
    public Usuario salvar(Usuario usuario){
        Usuario emailcheck = repository.findByEmail(usuario.getEmail());
        if (emailcheck != null) {
            System.out.println("Email já cadastrado, escolha outro!");
            return null;
        }
        return repository.save(usuario);
    }

    public Usuario editar(Usuario usuario){
        Usuario editarUsuario = repository.findById(usuario.getId()).orElse(null);
        if (editarUsuario == null){
            System.out.println("Esse usuário não existe.");
            return null;
        }
        editarUsuario.setEmail(usuario.getEmail());
        editarUsuario.setPeso(usuario.getPeso());
        editarUsuario.setNumeroCelular(usuario.getNumeroCelular());
        editarUsuario.setAltura(usuario.getAltura());
        editarUsuario.setPais(usuario.getPais());
        editarUsuario.setEstado(usuario.getEstado());
        editarUsuario.setCidade(usuario.getCidade());
        return repository.save(editarUsuario);
    }
    public void excluir(Long id){
        Usuario excluirUsuario = repository.findById(id).orElse(null);
        if (excluirUsuario == null){
            System.out.println("Esse usuário não existe");
            return;
        }
        repository.delete(excluirUsuario);

    }
}

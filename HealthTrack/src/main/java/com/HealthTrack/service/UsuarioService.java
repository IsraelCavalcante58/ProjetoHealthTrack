package com.HealthTrack.service;


import com.HealthTrack.model.Usuario;
import com.HealthTrack.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository; // Instanciando a classe

        // Função para salvar um usuário com a condição de não ter o mesmo E-Mail cadastrado
    public Usuario salvar(Usuario usuario){
        Usuario emailcheck = usuarioRepository.findByEmail(usuario.getEmail());
        if (emailcheck != null) {
            System.out.println("Email já cadastrado, escolha outro!");
            return null;
        }
        return usuarioRepository.save(usuario);
    }

    public Usuario editar(Usuario usuario){
        Usuario editarUsuario = usuarioRepository.findById(usuario.getId()).orElse(null); // Busca usuário pelo ID
        if (editarUsuario == null){ // Verifica se o usuário é existente ou não
            System.out.println("Esse usuário não existe.");
            return null;
        }
        // Clonar Usuário para a variável editarUsuário
        editarUsuario.setEmail(usuario.getEmail());
        editarUsuario.setPeso(usuario.getPeso());
        editarUsuario.setNumeroCelular(usuario.getNumeroCelular());
        editarUsuario.setAltura(usuario.getAltura());
        editarUsuario.setPais(usuario.getPais());
        editarUsuario.setEstado(usuario.getEstado());
        editarUsuario.setCidade(usuario.getCidade());
        return usuarioRepository.save(editarUsuario); // Salvar alterações no banco de dados, isso acontece pelo ID estar igual
    }
    public void excluir(Long id){
        Usuario excluirUsuario = usuarioRepository.findById(id).orElse(null);
        if (excluirUsuario == null){
            System.out.println("Esse usuário não existe");
            return;
        }
        usuarioRepository.delete(excluirUsuario);

    }
    public Usuario editarPeso(Usuario usuario){
        Usuario editarPesoUsuario = usuarioRepository.findById(usuario.getId()).orElse(null);
        if (editarPesoUsuario == null){
            System.out.println("Esse usuário não existe");
            return null;
        }
        editarPesoUsuario.setPeso(usuario.getPeso());
        return usuarioRepository.save(editarPesoUsuario);
    }
}

package com.gabriel.Sistema_de_reservas.service;

import com.gabriel.Sistema_de_reservas.model.DTO.UsuarioCreateDto;
import com.gabriel.Sistema_de_reservas.model.DTO.UsuarioReturnDto;
import com.gabriel.Sistema_de_reservas.model.Usuario;
import com.gabriel.Sistema_de_reservas.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioReturnDto cadastrarUsuario(UsuarioCreateDto usuario) throws Exception{
        if(usuarioRepository.findByEmail(usuario.email()).isPresent()) {
            throw new Exception("Usuario já cadastrado");
        }else{
            Usuario user = new Usuario();
            user.setEmail(usuario.email());
            user.setNome(usuario.nome());
            user.setRole(usuario.role());
            user.setSenha(usuario.senha());
            return new UsuarioReturnDto(usuarioRepository.save(user));
        }
    }
}

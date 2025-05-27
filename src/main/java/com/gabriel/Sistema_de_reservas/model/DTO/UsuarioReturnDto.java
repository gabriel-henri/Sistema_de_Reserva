package com.gabriel.Sistema_de_reservas.model.DTO;

import com.gabriel.Sistema_de_reservas.model.Enums.Roles;
import com.gabriel.Sistema_de_reservas.model.Usuario;

public record UsuarioReturnDto(Long id, String nome, String email, String senha, Roles roles) {
    public UsuarioReturnDto(Usuario usuario){
        this(usuario.getId(), usuario.getNome(),
                usuario.getEmail(), usuario.getSenha(),
                usuario.getRole());
    }
}

package com.gabriel.Sistema_de_reservas.model.DTO;

import com.gabriel.Sistema_de_reservas.model.Enums.Roles;

public record UsuarioCreateDto(String nome, String email, String senha, Roles role) {
}

package com.gabriel.Sistema_de_reservas.model;

import com.gabriel.Sistema_de_reservas.model.DTO.UsuarioCreateDto;
import com.gabriel.Sistema_de_reservas.model.Enums.Roles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;
    private Roles role;

    public Usuario(UsuarioCreateDto usuarioDto){
        this.setNome(usuarioDto.nome());
        this.setEmail(usuarioDto.email());
        this.setSenha(usuarioDto.senha());
        this.setRole(usuarioDto.role());
    }
}

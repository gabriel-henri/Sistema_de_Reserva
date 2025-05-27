package com.gabriel.Sistema_de_reservas.repository;

import com.gabriel.Sistema_de_reservas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public Optional<Usuario> findByEmail(String email);
}

package com.gabriel.Sistema_de_reservas.repository;

import com.gabriel.Sistema_de_reservas.model.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MesaRepository extends JpaRepository<Mesa, Long> {
    public Optional<Mesa> findByNome(String nome);
}

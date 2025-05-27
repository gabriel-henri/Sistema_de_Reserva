package com.gabriel.Sistema_de_reservas.repository;

import com.gabriel.Sistema_de_reservas.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}

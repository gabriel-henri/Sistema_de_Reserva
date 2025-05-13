package com.gabriel.Sistema_de_reservas.model;

import com.gabriel.Sistema_de_reservas.model.Enums.StatusMesa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="reservas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Reservas {
    private Long id;

    @OneToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    @OneToOne
    @JoinColumn(name="mesa_id")
    private Mesa mesa;

    @Column(name = "data_reserva")
    private LocalDateTime dataReserva;

    @Column(name = "status_mesa")
    private StatusMesa statusMesa;
}

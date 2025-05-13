package com.gabriel.Sistema_de_reservas.model;

import com.gabriel.Sistema_de_reservas.model.Enums.StatusMesa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="mesas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Mesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int capacidade;
    private StatusMesa status;
}

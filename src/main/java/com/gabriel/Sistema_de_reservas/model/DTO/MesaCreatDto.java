package com.gabriel.Sistema_de_reservas.model.DTO;

import com.gabriel.Sistema_de_reservas.model.Enums.StatusMesa;

public record MesaCreatDto(String nome, int capacidade,
                           StatusMesa status) {

}

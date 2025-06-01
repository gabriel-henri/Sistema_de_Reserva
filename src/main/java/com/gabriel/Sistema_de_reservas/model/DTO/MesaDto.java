package com.gabriel.Sistema_de_reservas.model.DTO;

import com.gabriel.Sistema_de_reservas.model.Enums.StatusMesa;
import com.gabriel.Sistema_de_reservas.model.Mesa;

public record MesaDto(Long id, String nome,
                      int capaciade,
                      StatusMesa status) {
    public MesaDto(Mesa mesa){
        this(mesa.getId(), mesa.getNome(),
        mesa.getCapacidade(),
        mesa.getStatus());
    }
}

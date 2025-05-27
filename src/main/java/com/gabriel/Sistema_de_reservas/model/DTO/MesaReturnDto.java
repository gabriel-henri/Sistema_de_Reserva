package com.gabriel.Sistema_de_reservas.model.DTO;

import com.gabriel.Sistema_de_reservas.model.Enums.StatusMesa;
import com.gabriel.Sistema_de_reservas.model.Mesa;

public record MesaReturnDto(String nome,
                            StatusMesa status) {
    public MesaReturnDto(Mesa mesa){
        this(mesa.getNome(), mesa.getStatus());
    }
}

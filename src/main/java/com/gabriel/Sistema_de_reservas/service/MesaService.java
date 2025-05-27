package com.gabriel.Sistema_de_reservas.service;

import com.gabriel.Sistema_de_reservas.model.DTO.MesaReturnDto;
import com.gabriel.Sistema_de_reservas.model.Mesa;
import com.gabriel.Sistema_de_reservas.repository.MesaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MesaService {
    private final MesaRepository mesaRepository;

    public List<MesaReturnDto> listarMesas(){
        List<Mesa> mesas = mesaRepository.findAll();
        return mesas.stream().map(MesaReturnDto::new).toList();
    }
}

package com.gabriel.Sistema_de_reservas.service;

import com.gabriel.Sistema_de_reservas.model.DTO.MesaCreatDto;
import com.gabriel.Sistema_de_reservas.model.DTO.MesaDto;
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

    public MesaDto criarMesa(MesaCreatDto mesa) throws Exception{
        if(mesaRepository.findByNome(mesa.nome()).isPresent()){
            throw new Exception("Mesa já existente");
        }
        Mesa mesa1 = new Mesa(mesa);
        return new MesaDto(mesaRepository.save(mesa1));
    }
}

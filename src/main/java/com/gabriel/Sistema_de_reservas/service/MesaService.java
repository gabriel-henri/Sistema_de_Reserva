package com.gabriel.Sistema_de_reservas.service;

import com.gabriel.Sistema_de_reservas.model.DTO.MesaCreatDto;
import com.gabriel.Sistema_de_reservas.model.DTO.MesaDto;
import com.gabriel.Sistema_de_reservas.model.Mesa;
import com.gabriel.Sistema_de_reservas.repository.MesaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MesaService {
    private final MesaRepository mesaRepository;

    public List<MesaDto> listarMesas(){
        List<Mesa> mesas = mesaRepository.findAll();
        return mesas.stream().map(MesaDto::new).toList();
    }

    public MesaDto criarMesa(MesaCreatDto mesa) throws Exception{
        if(mesaRepository.findByNome(mesa.nome()).isPresent()){
            throw new Exception("Mesa já existente");
        }
        Mesa mesa1 = new Mesa(mesa);
        return new MesaDto(mesaRepository.save(mesa1));
    }

    public void alterarMesa(Long id, MesaCreatDto mesadto) throws Exception{
        if(mesaRepository.findById(id).isPresent()){
            Mesa mesa = new Mesa(mesadto);
            mesa.setId(id);
            mesaRepository.save(mesa);
        }else {
            throw new Exception("Mesa não encontrada");
        }
    }

    public void deletarMesa(Long id) throws Exception{
        Mesa mesa = mesaRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Mesa não encontrada")
        );
        mesaRepository.delete(mesa);
    }
}

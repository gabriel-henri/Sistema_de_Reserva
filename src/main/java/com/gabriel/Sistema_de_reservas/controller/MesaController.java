package com.gabriel.Sistema_de_reservas.controller;

import com.gabriel.Sistema_de_reservas.model.DTO.MesaReturnDto;
import com.gabriel.Sistema_de_reservas.service.MesaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mesas")
public class MesaController {
    private final MesaService mesaService;

    @GetMapping
    public ResponseEntity<List<MesaReturnDto>> listarMesas(){
        return ResponseEntity.ok().body(mesaService.listarMesas());
    }
}

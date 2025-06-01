package com.gabriel.Sistema_de_reservas.controller;

import com.gabriel.Sistema_de_reservas.model.DTO.MesaCreatDto;
import com.gabriel.Sistema_de_reservas.model.DTO.MesaDto;
import com.gabriel.Sistema_de_reservas.service.MesaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mesas")
public class MesaController {
    private final MesaService mesaService;

    @GetMapping
    public ResponseEntity<List<MesaDto>> listarMesas(){
        return ResponseEntity.ok().body(mesaService.listarMesas());
    }

    @PostMapping
    public ResponseEntity<?> criarMesa(@RequestBody MesaCreatDto mesadto){
        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(mesaService.criarMesa(mesadto));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> alterarMesa(@PathVariable Long id, @RequestBody MesaCreatDto mesa) {
        try {
            mesaService.alterarMesa(id, mesa);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarMesa(@PathVariable Long id){
        try {
            mesaService.deletarMesa(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}

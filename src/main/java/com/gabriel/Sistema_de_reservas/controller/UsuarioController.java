package com.gabriel.Sistema_de_reservas.controller;

import com.gabriel.Sistema_de_reservas.model.DTO.UsuarioCreateDto;
import com.gabriel.Sistema_de_reservas.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;

    @PostMapping("/registrar")
    public ResponseEntity<?> cadastrarUsuario(@RequestBody UsuarioCreateDto usuarioDto){
        try{
            return ResponseEntity.ok(usuarioService.cadastrarUsuario(usuarioDto));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }
}

package com.examplo.transferencias.controller;

import com.examplo.transferencias.model.Transferencia;
import com.examplo.transferencias.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transferencias")
public class TransferenciaController {

    @Autowired
    private TransferenciaService service;

    @PostMapping
    public ResponseEntity<Transferencia> agendarTransferencia(@RequestBody Transferencia transferencia) {
        Transferencia agendada = service.agendarTransferencia(transferencia);
        return ResponseEntity.ok(agendada);
    }

    @GetMapping
    public ResponseEntity<List<Transferencia>> listarTransferencias() {
        List<Transferencia> transferencias = service.listarTransferencias();
        return ResponseEntity.ok(transferencias);
    }
}
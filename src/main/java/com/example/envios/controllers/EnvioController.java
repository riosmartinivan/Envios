package com.example.envios.controllers;

import com.example.envios.model.Envio;
import com.example.envios.services.EnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvioController {

    private final EnvioService envioService;

    @Autowired
    public EnvioController(EnvioService envioService) {
        this.envioService = envioService;

    }

    @PostMapping(value = "/saveCarta")
    public ResponseEntity<Envio> saveCircle(String remitente, String destinatario) {

        return ResponseEntity.ok(envioService.saveCarta(remitente, destinatario));
    }

    @PostMapping(value = "/savePaquete")
    public ResponseEntity<Envio> saveTriangle(double peso, double alto, double ancho, String remitente, String destinatario) {

        return ResponseEntity.ok(envioService.savePaquete(peso,alto,ancho,remitente,destinatario));
    }


}

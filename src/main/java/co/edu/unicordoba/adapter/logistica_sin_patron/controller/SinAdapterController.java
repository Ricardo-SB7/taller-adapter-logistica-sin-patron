package co.edu.unicordoba.adapter.logistica_sin_patron.controller;

import co.edu.unicordoba.adapter.logistica_sin_patron.model.GestorEnvios;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Controlador REST para exponer la versión defectuosa (SIN PATRÓN) en Render.
 */
@RestController
@RequestMapping("/api/sin-adapter")
public class SinAdapterController {

    @GetMapping("/demo")
    public List<String> ejecutarDemostracion() {
        List<String> resultados = new ArrayList<>();
        GestorEnvios gestor = new GestorEnvios();

        resultados.add("=== DEMOSTRACIÓN DEL SISTEMA SIN PATRÓN (VERSIÓN CON DEFECTO) ===");
        
        // Ejecución con lógica rígida
        resultados.add(gestor.procesarEnvio("LOCAL", "Calle 24 #10-05, Montería", 2.5));
        resultados.add(gestor.procesarEnvio("SERVIENTREGA", "Carrera 5 #40-12, Montería", 3.0));

        return resultados;
    }
}
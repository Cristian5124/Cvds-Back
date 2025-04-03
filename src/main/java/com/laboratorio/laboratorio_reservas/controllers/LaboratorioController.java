package com.laboratorio.laboratorio_reservas.controllers;

import com.laboratorio.laboratorio_reservas.models.Laboratorio;
import com.laboratorio.laboratorio_reservas.services.LaboratorioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/laboratorios")
public class LaboratorioController {

  private final LaboratorioService laboratorioService;

  @Autowired
  public LaboratorioController(LaboratorioService laboratorioService) {
    this.laboratorioService = laboratorioService;
  }

  @GetMapping
  public List<Laboratorio> obtenerLaboratorios() {
    return laboratorioService.listarLaboratorios();
  }
}

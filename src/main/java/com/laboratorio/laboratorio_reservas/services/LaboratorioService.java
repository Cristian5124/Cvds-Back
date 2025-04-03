package com.laboratorio.laboratorio_reservas.services;

import com.laboratorio.laboratorio_reservas.models.Laboratorio;
import com.laboratorio.laboratorio_reservas.repositories.LaboratorioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaboratorioService {

  private LaboratorioRepository laboratorioRepository;

  public LaboratorioService(
    @Autowired LaboratorioRepository laboratorioRepository
  ) {
    this.laboratorioRepository = laboratorioRepository;
  }

  public List<Laboratorio> listarLaboratorios() {
    return laboratorioRepository.findAll();
  }
}

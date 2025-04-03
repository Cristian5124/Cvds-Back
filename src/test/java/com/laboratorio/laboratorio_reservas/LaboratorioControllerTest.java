package com.laboratorio.laboratorio_reservas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.laboratorio.laboratorio_reservas.controllers.LaboratorioController;
import com.laboratorio.laboratorio_reservas.models.Laboratorio;
import com.laboratorio.laboratorio_reservas.services.LaboratorioService;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LaboratorioControllerTest {

  @Mock
  private LaboratorioService laboratorioService;

  @InjectMocks
  private LaboratorioController laboratorioController;

  private Laboratorio laboratorio;

  @BeforeEach
  void setUp() {
    laboratorio = new Laboratorio("Lab 1", 30, "Edificio A", true);
    laboratorio.setId("lab1");
  }

  @Test
  void testObtenerLaboratoriosConDatos() {
    when(laboratorioService.listarLaboratorios())
      .thenReturn(Collections.singletonList(laboratorio));

    List<Laboratorio> laboratorios = laboratorioController.obtenerLaboratorios();

    assertEquals(1, laboratorios.size());
    assertEquals("lab1", laboratorios.get(0).getId());
  }

  @Test
  void testObtenerLaboratoriosSinDatos() {
    when(laboratorioService.listarLaboratorios())
      .thenReturn(Collections.emptyList());

    List<Laboratorio> laboratorios = laboratorioController.obtenerLaboratorios();

    assertEquals(0, laboratorios.size());
  }
}

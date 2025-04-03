package com.laboratorio.laboratorio_reservas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.laboratorio.laboratorio_reservas.controllers.ReservaDTO;
import java.util.Date;
import org.junit.jupiter.api.Test;

class ReservaDTOTest {

  @Test
  void testReservaDTOBuilder() {
    Date fecha = new Date();
    ReservaDTO reserva = new ReservaDTO.Builder()
      .id("1")
      .idLaboratorio("lab1")
      .usuario("usuario1")
      .fecha(fecha)
      .horaInicio("08:00")
      .horaFin("10:00")
      .proposito("Estudio")
      .estado("Confirmada")
      .build();

    assertNotNull(reserva);
    assertEquals("1", reserva.getId());
    assertEquals("lab1", reserva.getIdLaboratorio());
    assertEquals("usuario1", reserva.getUsuario());
    assertEquals(fecha, reserva.getFecha());
    assertEquals("08:00", reserva.getHoraInicio());
    assertEquals("10:00", reserva.getHoraFin());
    assertEquals("Estudio", reserva.getProposito());
    assertEquals("Confirmada", reserva.getEstado());
  }
}

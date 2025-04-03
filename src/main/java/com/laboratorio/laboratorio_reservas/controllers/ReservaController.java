package com.laboratorio.laboratorio_reservas.controllers;

import com.laboratorio.laboratorio_reservas.models.Reserva;
import com.laboratorio.laboratorio_reservas.services.ReservaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

  private final ReservaService reservaService;

  @Autowired
  public ReservaController(ReservaService reservaService) {
    this.reservaService = reservaService;
  }

@PostMapping
  public Reserva crearReserva(@RequestBody ReservaDTO reservaDTO) {
    Reserva reserva = new Reserva();
    reserva.setIdLaboratorio(reservaDTO.getIdLaboratorio());
    reserva.setUsuario(reservaDTO.getUsuario());
    reserva.setFecha(reservaDTO.getFecha());
    reserva.setHoraInicio(reservaDTO.getHoraInicio());
    reserva.setHoraFin(reservaDTO.getHoraFin());
    reserva.setProposito(reservaDTO.getProposito());
    reserva.setEstado(reservaDTO.getEstado());

    return reservaService.crearReserva(reserva);
  }

  @DeleteMapping("/{id}")
  public void cancelarReserva(@PathVariable String id) {
    reservaService.cancelarReserva(id);
  }

  @GetMapping
  public List<Reserva> listarReservas() {
    return reservaService.listarReservas();
  }
}

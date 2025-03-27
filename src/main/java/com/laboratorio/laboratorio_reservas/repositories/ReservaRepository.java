package com.laboratorio.laboratorio_reservas.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.laboratorio.laboratorio_reservas.models.Reserva;

@Repository
public interface ReservaRepository extends MongoRepository<Reserva, String> {
    List<Reserva> findByIdLaboratorioAndFecha(String idLaboratorio, Date fecha);
}

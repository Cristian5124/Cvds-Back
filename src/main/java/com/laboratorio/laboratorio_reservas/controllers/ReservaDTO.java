package com.laboratorio.laboratorio_reservas.controllers;

import java.util.Date;

public class ReservaDTO {

  private String id;
  private String idLaboratorio;
  private String usuario;
  private Date fecha;
  private String horaInicio;
  private String horaFin;
  private String proposito;
  private String estado;

  public ReservaDTO(
    String id,
    String idLaboratorio,
    String usuario,
    Date fecha,
    String horaInicio,
    String horaFin,
    String proposito,
    String estado
  ) {
    this.id = id;
    this.idLaboratorio = idLaboratorio;
    this.usuario = usuario;
    this.fecha = fecha;
    this.horaInicio = horaInicio;
    this.horaFin = horaFin;
    this.proposito = proposito;
    this.estado = estado;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getIdLaboratorio() {
    return idLaboratorio;
  }

  public void setIdLaboratorio(String idLaboratorio) {
    this.idLaboratorio = idLaboratorio;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public String getHoraInicio() {
    return horaInicio;
  }

  public void setHoraInicio(String horaInicio) {
    this.horaInicio = horaInicio;
  }

  public String getHoraFin() {
    return horaFin;
  }

  public void setHoraFin(String horaFin) {
    this.horaFin = horaFin;
  }

  public String getProposito() {
    return proposito;
  }

  public void setProposito(String proposito) {
    this.proposito = proposito;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }
}

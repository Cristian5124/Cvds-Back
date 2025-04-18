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

  // Constructor vacío necesario para la deserialización de JSON
  public ReservaDTO() {}

  private ReservaDTO(Builder builder) {
    this.id = builder.id;
    this.idLaboratorio = builder.idLaboratorio;
    this.usuario = builder.usuario;
    this.fecha = builder.fecha;
    this.horaInicio = builder.horaInicio;
    this.horaFin = builder.horaFin;
    this.proposito = builder.proposito;
    this.estado = builder.estado;
  }

  public static class Builder {

    private String id;
    private String idLaboratorio;
    private String usuario;
    private Date fecha;
    private String horaInicio;
    private String horaFin;
    private String proposito;
    private String estado;

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder idLaboratorio(String idLaboratorio) {
      this.idLaboratorio = idLaboratorio;
      return this;
    }

    public Builder usuario(String usuario) {
      this.usuario = usuario;
      return this;
    }

    public Builder fecha(Date fecha) {
      this.fecha = fecha;
      return this;
    }

    public Builder horaInicio(String horaInicio) {
      this.horaInicio = horaInicio;
      return this;
    }

    public Builder horaFin(String horaFin) {
      this.horaFin = horaFin;
      return this;
    }

    public Builder proposito(String proposito) {
      this.proposito = proposito;
      return this;
    }

    public Builder estado(String estado) {
      this.estado = estado;
      return this;
    }

    public ReservaDTO build() {
      return new ReservaDTO(this);
    }
  }

  public String getId() {
    return id;
  }

  public String getIdLaboratorio() {
    return idLaboratorio;
  }

  public String getUsuario() {
    return usuario;
  }

  public Date getFecha() {
    return fecha;
  }

  public String getHoraInicio() {
    return horaInicio;
  }

  public String getHoraFin() {
    return horaFin;
  }

  public String getProposito() {
    return proposito;
  }

  public String getEstado() {
    return estado;
  }
}

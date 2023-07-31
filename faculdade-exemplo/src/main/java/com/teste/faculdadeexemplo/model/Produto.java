package com.teste.faculdadeexemplo.model;

public class Produto {

  //#region Atributos

  private Integer id;

  private String name;

  private Integer quantidade;

  private Double valor;

  private String observacao;

  //#endregion


  //#region Getters and setters
  public void setId(Integer id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Integer getQuantidade() {
    return quantidade;
  }

  public Double getValor() {
    return valor;
  }

  public String getObservacao() {
    return observacao;
  }

  //#endregion




}

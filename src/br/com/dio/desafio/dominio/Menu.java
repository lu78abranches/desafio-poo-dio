package br.com.dio.desafio.dominio;

public abstract class Menu {

  protected static final double VALOR_INICIAL = 1d;

  private String itensDoCombo;
  private String descricao;

  public abstract double calcularValor();

  public String getItensDoCombo() {
    return itensDoCombo;
  }

  public void setItensDoCombo(String itensDoCombo) {
    this.itensDoCombo = itensDoCombo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}

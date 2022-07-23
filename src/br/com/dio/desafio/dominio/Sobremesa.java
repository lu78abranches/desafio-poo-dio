package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Sobremesa extends Menu {
   private LocalDate data;

    @Override
    public double calcularValor() {
        return VALOR_INICIAL + 10.00;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Sobremesa{" +
                "titulo='" + getItensDoCombo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}

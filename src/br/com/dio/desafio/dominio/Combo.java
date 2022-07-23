package br.com.dio.desafio.dominio;

public class Combo extends Menu {

    private double valorTotal;

    @Override
    public double calcularValor() {
        return VALOR_INICIAL * valorTotal;
    }



    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return
                " Itens do Combo = " + getItensDoCombo() + '\n' +
                "Descri��o do Pedido = " + getDescricao() + '\n' +
                "Pre�o do Pedido = " + valorTotal;
    }


}

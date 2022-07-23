package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Combo combo1 = new Combo();
        combo1.setItensDoCombo("XBurguer + Batata + Refri");
        combo1.setDescricao("(Hamburguer bovino 150 gramas, Queijo especial 50 gramas) - (Batata frita artesanal 200 gramas)" +
                "- (Refrigerante lata 300 ml)");
        combo1.setValorTotal(45.00);

        Combo combo2 = new Combo();
        combo2.setItensDoCombo("XEgg + Batata + Refri ");
        combo2.setDescricao("(Hamburguer bovino 150 gramas, Queijo especial 50 gramas, Ovo Frito, Maionese Artesanal) - (Batata frita artesanal 200 gramas)" +
                "- (Refrigerante lata 300 ml)");
        combo2.setValorTotal(50.00);


        Sobremesa sobremesa = new Sobremesa();
        sobremesa.setItensDoCombo("Pudim de Leite");
        sobremesa.setDescricao("Pudim com leite moça artesanal");
        sobremesa.setData(LocalDate.now());


        Hamburgueria seuPedido = new Hamburgueria();
        seuPedido.setNome("Combo + sobremesa");
        seuPedido.setDescricao("Escolha um combo mais uma sobremesa");
        seuPedido.getMenu().add(combo1);
        seuPedido.getMenu().add(sobremesa);

        Hamburgueria seuPedido2 = new Hamburgueria();
        seuPedido2.getMenu().add(combo2);
        seuPedido2.getMenu().add(sobremesa);


        Cliente luis = new Cliente();
        luis.setNome("Luis");
        luis.fazerPedido(seuPedido);
        System.out.println("Pedido Feito, Luis: " + luis.getPedidoFeito());
        luis.pedidoConcluido();
        luis.pedidoConcluido();
        System.out.println("-");
        System.out.println("Pedido Feito, Luis: " + luis.getPedidoFeito());
        System.out.println("Pedido Retirado, Luis: " + luis.getPedidoRetirado());
        System.out.println("Valor dos itens: " + "\n" + "Combo 1: " + combo1.getValorTotal() + "\n" +
                "Sobremesa: " + sobremesa.calcularValor() + "\n" + "Valor a Pagar: R$ " + luis.calcularValorTotal() );

        System.out.println("----------------------------------");

        Cliente sandra = new Cliente();
        sandra.setNome("Sandra");
        sandra.fazerPedido(seuPedido2);
        System.out.println("Pedido Feito, Sandra: " + sandra.getPedidoFeito());
        sandra.pedidoConcluido();
        sandra.pedidoConcluido();
        System.out.println("-");
        System.out.println("Pedido Feito, Sandra: " + sandra.getPedidoFeito());
        System.out.println("Pedido Retirado, Sandra: " + sandra.getPedidoRetirado());
        System.out.println("Valor dos itens: " + "\n" + "Combo 2: " + combo2.getValorTotal() + "\n" +
                "Sobremesa: " + sobremesa.calcularValor() + "\n" + "Valor a Pagar: R$ " + sandra.calcularValorTotal() );

    }
}

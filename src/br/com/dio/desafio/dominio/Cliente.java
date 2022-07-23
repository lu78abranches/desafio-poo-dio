package br.com.dio.desafio.dominio;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.LinkedHashSet;

public class Cliente {
    private String nome;
    private Set<Menu> pedidoFeito = new LinkedHashSet<>();
    private Set<Menu> pedidoRetirado = new LinkedHashSet<>();

    public void fazerPedido(Hamburgueria pedidoFeito) {
        this.pedidoFeito.addAll(pedidoFeito.getMenu());
        pedidoFeito.getCliente().add(this);
    }

    public void pedidoConcluido() {
      Optional<Menu> conteudo = this.pedidoFeito.stream().findFirst();
        if(conteudo.isPresent()) {
            this.pedidoRetirado.add(conteudo.get());
            this.pedidoFeito.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }
    }

    public double calcularValorTotal() {
        return this.pedidoRetirado
                .stream().mapToDouble(Menu::calcularValor)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Menu> getPedidoFeito() {
        return pedidoFeito;
    }

    public void setPedidoFeito(Set<Menu> pedidoFeito) {
        this.pedidoFeito = pedidoFeito;
    }

    public Set<Menu> getPedidoRetirado() {
        return pedidoRetirado;
    }

    public void setPedidoRetirado(Set<Menu> pedidoRetirado) {
        this.pedidoRetirado = pedidoRetirado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente dev = (Cliente) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(pedidoFeito, dev.pedidoFeito) && Objects.equals(pedidoRetirado, dev.pedidoRetirado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, pedidoFeito, pedidoRetirado);
    }
}

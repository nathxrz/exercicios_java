package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String numero;
    private LocalDate data;
    private BigDecimal total;
    private Estado estado;

    //ligando Pedido com Item
    private List<Item> itens = new ArrayList<>();

    //ligando Pedido com Vendedor
    private Vendedor vendedor;

    public Pedido(){

    }

    public Pedido(String numero, LocalDate data, BigDecimal total, Estado estado, List<Item> itens, Vendedor vendedor) {
        this.numero = numero;
        this.data = data;
        this.total = total;
        this.estado = estado;
        this.itens = itens;
        this.vendedor = vendedor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getData() {
        return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return total;
    }

    public void setValor(BigDecimal total) {
        this.total = total;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero='" + numero + '\'' +
                ", data=" + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", Total=" + total +
                ", estado=" + estado +
                ", itens=" + itens +
                ", vendedor=" + vendedor +
                '}';
    }
}

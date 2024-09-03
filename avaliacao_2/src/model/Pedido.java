package model;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String numero;
    private LocalDate data;
    private BigDecimal total;
    private EstadoDoPedido estado;

    private List<Item> itens = new ArrayList<>();
    private Cliente cliente;

    public Pedido() {
    }

    public Pedido(String numero, LocalDate data, BigDecimal total, EstadoDoPedido estado, List<Item> itens, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.total = total;
        this.estado = estado;
        this.itens = itens;
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public EstadoDoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoDoPedido estado) {
        this.estado = estado;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "\n" +
                "Pedido{" +
                "numero='" + numero+ '\'' +
                ", data=" + data +
                ", total=" + NumberFormat.getCurrencyInstance().format(total)  +
                ", estado=" + estado +
                ", itens=" + itens +
                ", cliente=" + cliente +
                '}';
    }
}

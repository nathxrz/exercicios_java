package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Pedido {
    private Long id_pedido;
    private String formaPagamento;
    private String estado;
    private Calendar dataCriacao;
    private Calendar dataModificacao;
    private Double totalPedido;
    private Boolean situacao;

    //ligação entre as classes Pedido x Cliente (pedido só é vinculado apenas 1 cliente)
    Cliente cliente;

    //Composição com a classe ItemPedido (pedido é vinculado à 1 ou mais itens)
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(){}


    public Pedido(Long id_pedido, String formaPagamento, String estado, Calendar dataCriacao, Calendar dataModificacao, Double totalPedido, Boolean situacao, Cliente cliente) {
        this.id_pedido = id_pedido;
        this.formaPagamento = formaPagamento;
        this.estado = estado;
        this.dataCriacao = dataCriacao;
        this.dataModificacao = dataModificacao;
        this.totalPedido = totalPedido;
        this.situacao = situacao;
        this.cliente = cliente;
    }

    public Pedido(Long id_pedido, String formaPagamento, String estado, Calendar dataCriacao, Calendar dataModificacao, Double totalPedido, Boolean situacao, Cliente cliente, List<ItemPedido> itens) {
        this.dataCriacao = dataCriacao;
        this.id_pedido = id_pedido;
        this.formaPagamento = formaPagamento;
        this.estado = estado;
        this.dataModificacao = dataModificacao;
        this.totalPedido = totalPedido;
        this.situacao = situacao;
        this.cliente = cliente;
        this.itens = itens;
    }

    public Long getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Long id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Calendar getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Calendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Calendar getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(Calendar dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    public Double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(Double totalPedido) {
        this.totalPedido = totalPedido;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "id_pedido=" + id_pedido +
                ", formaPagamento='" + formaPagamento + '\'' +
                ", estado='" + estado + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", dataModificacao=" + dataModificacao +
                ", totalPedido=" + totalPedido +
                ", situacao=" + situacao +
                ", cliente=" + cliente +
                ", itens=" + itens +
                '}';
    }
}

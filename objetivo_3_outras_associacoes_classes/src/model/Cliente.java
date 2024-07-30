package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Long id_cliente;
    private String nome;
    private String sobrenome;
    private Boolean situacao;

    //ligação entre as classes Cliente x Pedido (clientes possuem +1 pedido utiliza-se um array)
    private List<Pedido> pedidos = new ArrayList<>();

    public Cliente() {}

    public Cliente(Long id_cliente, String nome, String sobrenome, Boolean situacao) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.situacao = situacao;
    }

    public Cliente(Long id_cliente, String nome, String sobrenome, Boolean situacao, List<Pedido> pedidos) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.situacao = situacao;
        this.pedidos = pedidos;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "id_cliente=" + id_cliente +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", situacao=" + situacao +
                "}";
    }
}

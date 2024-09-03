package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    protected String nomeCompleto;
    protected String email;
    protected String telefone;

    protected List<Endereco> enderecos = new ArrayList<>();
    protected List<Pedido> pedidos = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nomeCompleto, String email, String telefone, List<Endereco> enderecos) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
        this.enderecos = enderecos;
    }

    public Cliente(String nomeCompleto, String email, String telefone, List<Endereco> enderecos, List<Pedido> pedidos) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
        this.enderecos = enderecos;
        this.pedidos = pedidos;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
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
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", enderecos=" + enderecos +
                ", pedidos=" + pedidos +
                '}';
    }
}

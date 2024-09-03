package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Endereco {
    private String tipoDeLogradouro;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cep;

    private List<Cliente> clientes = new ArrayList<>();

    public Endereco() {
    }

    public Endereco(String bairro, String tipoDeLogradouro, String logradouro, String numero, String cep) {
        this.bairro = bairro;
        this.tipoDeLogradouro = tipoDeLogradouro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
    }

    public Endereco(String tipoDeLogradouro, String logradouro, String numero, String bairro, String cep, List<Cliente> clientes) {
        this.tipoDeLogradouro = tipoDeLogradouro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.clientes = clientes;
    }

    public String getTipoDeLogradouro() {
        return tipoDeLogradouro;
    }

    public void setTipoDeLogradouro(String tipoDeLogradouro) {
        this.tipoDeLogradouro = tipoDeLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "\nEndereco{" +
                "tipoDeLogradouro='" + tipoDeLogradouro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", clientes=" + clientes +
                '}';
    }
}

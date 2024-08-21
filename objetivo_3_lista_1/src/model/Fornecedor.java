package model;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
    private Long cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String email;
    private String telefone;

    //ligando Fornecedor x Produto
    private List<Produto> produtos =  new ArrayList<Produto>();

    public Fornecedor() {}

    public Fornecedor(Long cnpj, String razaoSocial, String nomeFantasia, String email, String telefone) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.email = email;
        this.telefone = telefone;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
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

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return  "cnpj = " + cnpj +
                ", razão sozial = '" + razaoSocial + '\'' +
                ", nome = '" + nomeFantasia + '\'' +
                ", email = '" + email + '\'' +
                ", telefone = '" + telefone + '\'' +
                ", produtos = " + produtos;
    }
}

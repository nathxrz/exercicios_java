package model;

import java.math.BigDecimal;
import java.util.List;

public class Produto {
    private String sku;
    private String nome;
    private String descricao;
    private Integer quantidade;
    private BigDecimal precoDeCusto;
    private BigDecimal precoDeVenda;

    private List<Fornecedor> fornecedores;

    public Produto(){

    }

    public Produto(String sku, String nome, String descricao, Integer quantidade, BigDecimal precoDeCusto, BigDecimal precoDeVenda){
        this.sku = sku;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoDeCusto = precoDeCusto;
        this.precoDeVenda = precoDeVenda;
    }

    public Produto(String sku, String nome, String descricao, Integer quantidade, BigDecimal precoDeCusto, BigDecimal precoDeVenda, List<Fornecedor> fornecedores) {
        this.sku = sku;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoDeCusto = precoDeCusto;
        this.precoDeVenda = precoDeVenda;
        this.fornecedores = fornecedores;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecoDeCusto() {
        return precoDeCusto;
    }

    public void setPrecoDeCusto(BigDecimal precoDeCusto) {
        this.precoDeCusto = precoDeCusto;
    }

    public BigDecimal getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(BigDecimal precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "sku='" + sku + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", precoDeCusto=" + precoDeCusto +
                ", precoDeVenda=" + precoDeVenda +
//                ", fornecedores=" + fornecedores +
                '}';
    }
}

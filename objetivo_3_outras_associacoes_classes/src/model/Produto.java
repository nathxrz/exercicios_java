package model;

public class Produto {
    private Long id_produto;
    private String nome;
    private String descricao;
    private Double valor;
    private Boolean situacao;

    public Produto() {}

    public Produto(Long id_produto, String nome, String descricao, Double valor, Boolean situacao) {
        this.id_produto = id_produto;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.situacao = situacao;
    }

    public Long getId_produto() {
        return id_produto;
    }

    public void setId_produto(Long id_produto) {
        this.id_produto = id_produto;
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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "\nProduto{" +
                "id_produto=" + id_produto +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", situacao=" + situacao +
                "}";
    }
}

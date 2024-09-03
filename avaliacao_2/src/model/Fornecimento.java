package model;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;

public class Fornecimento {
    private LocalDate data;
    private Integer quantidade;
    private BigDecimal total;

    private Fornecedor fornecedor;
    private Produto produto;

    public Fornecimento() {
    }

    public Fornecimento(LocalDate data, Integer quantidade, BigDecimal total, Fornecedor fornecedor, Produto produto) {
        this.data = data;
        this.quantidade = quantidade;
        this.total = total;
        this.fornecedor = fornecedor;
        this.produto = produto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nFornecimento{" +
                "data=" + data +
                ", quantidade=" + quantidade +
                ", total=" + NumberFormat.getCurrencyInstance().format(total) +
                ", fornecedor=" + fornecedor +
                ", produto=" + produto +
                '}';
    }
}

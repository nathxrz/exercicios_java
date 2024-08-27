package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fornecimento {
    private LocalDate data;
    private Integer quantidade;
    private BigDecimal total;

    private Produto produto;
    private Fornecedor fornecedor;

    public Fornecimento() {}

    public Fornecimento(LocalDate data, Integer quantidade, BigDecimal total, Produto produto, Fornecedor fornecedor) {
        this.data = data;
        this.quantidade = quantidade;
        this.total = total;
        this.produto = produto;
        this.fornecedor = fornecedor;
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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Fornecimento{" +
                "data=" + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", quantidade=" + quantidade +
                ", total=" + total +
                ", produto=" + produto +
                ", fornecedor=" + fornecedor +
                '}';
    }
}

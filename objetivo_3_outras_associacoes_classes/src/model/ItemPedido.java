package model;

public class ItemPedido {
    private Long id_item_pedido;
    private Integer quantidade;
    private Double totalItem;
    private Boolean situacao;

    //composição com a classe Produto
    private Produto produto;

    public ItemPedido() {}

    public ItemPedido(Long id_item_pedido, Integer quantidade, Double totalItem, Boolean situacao) {
        this.id_item_pedido = id_item_pedido;
        this.quantidade = quantidade;
        this.totalItem = totalItem;
        this.situacao = situacao;
    }

    public ItemPedido(Long id_item_pedido, Integer quantidade, Double totalItem, Boolean situacao, Produto produto) {
        this.id_item_pedido = id_item_pedido;
        this.quantidade = quantidade;
        this.totalItem = totalItem;
        this.situacao = situacao;
        this.produto = produto;
    }

    public Long getId_item_pedido() {
        return id_item_pedido;
    }

    public void setId_item_pedido(Long id_item_pedido) {
        this.id_item_pedido = id_item_pedido;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(Double totalItem) {
        this.totalItem = totalItem;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nItemPedido{" +
                "id_item_pedido=" + id_item_pedido +
                ", quantidade=" + quantidade +
                ", totalItem=" + totalItem +
                ", situacao=" + situacao +
                ", produto=" + produto +
                '}';
    }
}

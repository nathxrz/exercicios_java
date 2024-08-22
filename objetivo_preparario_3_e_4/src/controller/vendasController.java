package controller;

import model.*;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class vendasController {
    public static void main(String[] args) {
        //Registrar o Vendedor, os Produtos, e o Carrinho (uma lista de Item);
        Vendedor vendedor1 = new Vendedor(1L, "Rafael Pinto", "rafael@email.com", "(12) 123456789", new BigDecimal(1200), 10.0, Regiao.Sul, null);
        Fornecedor fornecedor1 = new Fornecedor("3123TD545", "Papel123", "papel@email.com", "(31) 097312312", null);
        Fornecedor fornecedor2 = new Fornecedor("52343YJ545", "Mundo das canetas", "mdcanetas@email.com", "(31) 53212312", null);

        Produto p1 = new Produto("34T263", "Caderno", "200 folhas x 10 matérias", 200, new BigDecimal(20), new BigDecimal(40), null, null);
        Produto p2 = new Produto("749T74", "Lápis", "nº4", 400, new BigDecimal(0.50), new BigDecimal(2), null, null);
        Produto p3 = new Produto("95384T", "Caneta", "Azul", 250, new BigDecimal(1.50), new BigDecimal(3), null, null);
        Produto p4 = new Produto("0338K8", "Caneta", "Preta", 250, new BigDecimal(1.50), new BigDecimal(3), null, null);

        Item item1 = new Item(100, Situacao.Ativo, p1, new BigDecimal(100).multiply(p1.getPrecoDeVenda()));
        Item item2 = new Item(150, Situacao.Ativo, p2, new BigDecimal(150).multiply(p2.getPrecoDeVenda()));

        //ligando fornecedor e produto
        fornecedor1.getProdutos().add(p1);
        fornecedor1.getProdutos().add(p2);
        fornecedor2.getProdutos().add(p3);
        fornecedor2.getProdutos().add(p4);
        p1.getFornecedores().add(fornecedor1);
        p2.getFornecedores().add(fornecedor2);
        p3.getFornecedores().add(fornecedor1);
        p4.getFornecedores().add(fornecedor2);

        //ligando produto e item
        p1.getItens().add(item1);
        p2.getItens().add(item2);

        //criando carrinho de itens do pedido
        List<Item> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);

        //calculando o valor total do carrinho
        BigDecimal totalDoCarrinho = new BigDecimal(0);
        for (Item item : itens) {
            totalDoCarrinho = totalDoCarrinho.add(item.getTotal());
        }

        //Registrar os detalhes de Pedido, como, número do pedido, total do pedido e a data do pedido;
        Pedido pedido1 = new Pedido("11", LocalDate.now(), totalDoCarrinho, Estado.Faturado, itens, vendedor1);
        System.out.println("Número do pedido: " + pedido1.getNumero());
        System.out.println("Total: " + NumberFormat.getCurrencyInstance().format(pedido1.getValor()));
        System.out.println("Data da compra: " + pedido1.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        // Baixar o estoque de Produto;


        // Imprimir o Pedido com seus detalhes, como, os Itens, o total de cada Item, o total do Pedido, e os demais atributos do Pedido;
        System.out.println("-------------------------------------------------------------");
        System.out.println("Itens do pedido:" + pedido1.getItens());
        System.out.println("Total de cada item:");
        for (Item item : pedido1.getItens()) {
//            System.out.println("\n" + item.getProduto().toString() + " = " + item.getTotal().toString());
            System.out.println(item.getTotal().toString());
        }
        System.out.println("Total:" + pedido1.getValor());
        System.out.println("Número do pedido: " + pedido1.getNumero());
        System.out.println("Estado: " + pedido1.getEstado());
        System.out.println("Data da compra: " + pedido1.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Vendedor: " + pedido1.getVendedor());

    }
}

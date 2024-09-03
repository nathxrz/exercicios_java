package controller;

import exception.FaltaEnderecoDeEntregaException;
import model.*;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class pedidoController {
    public static void main(String[] args) {
//        ------------------------ C ------------------------

//        i. ------------------------------------------------
        EnderecoDeEntrega enderecoEntrega = new EnderecoDeEntrega("Centro", "A", "rua", "12345", "1912321");
        EnderecoDeCobranca enderecoCobranca = new EnderecoDeCobranca("Centro", "A", "rua", "12345", "1912321");

//      registrando cliente
        ClientePessoaFisica cliente1 = new ClientePessoaFisica("Renata Araujo", "renata@gmail.com", "(12) 123456789", List.of(enderecoEntrega, enderecoCobranca), "423424234");
        enderecoEntrega.getClientes().add(cliente1);
        enderecoCobranca.getClientes().add(cliente1);

//        registrando fornecedor
        Fornecedor fornecedor1 = new Fornecedor("123D31", "Papelaria-RS", "papel@gmail.com", "(12) 343231331");

//        registrando produtos
        Produto produto1 = new Produto(UUID.randomUUID().toString(), "Caderno", "10 matérias", 100, BigDecimal.valueOf(10), BigDecimal.valueOf(25), List.of(fornecedor1));
        Produto produto2 = new Produto(UUID.randomUUID().toString(), "A4", "100 unidade", 50, BigDecimal.valueOf(5.50), BigDecimal.valueOf(10), List.of(fornecedor1));
        Produto produto3 = new Produto(UUID.randomUUID().toString(), "Borracha", "branca", 150, BigDecimal.valueOf(0.70), BigDecimal.valueOf(1.500), List.of(fornecedor1));

        fornecedor1.getProdutos().add(produto1);
        fornecedor1.getProdutos().add(produto2);
        fornecedor1.getProdutos().add(produto3);

//        registrando itens
        Item item1 = new Item(15, new BigDecimal(15).multiply(produto1.getPrecoDeVenda()), Situacao.Ativo, produto1);
        Item item2 = new Item(10, new BigDecimal(10).multiply(produto2.getPrecoDeVenda()), Situacao.Ativo, produto2);
        Item item3 = new Item(20, new BigDecimal(20).multiply(produto3.getPrecoDeVenda()), Situacao.Ativo, produto3);

//        criando o carrinho de compras
        List<Item> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);
        itens.add(item3);

//        ii. ------------------------------------------------
//        calculando o carrinho
        BigDecimal totalCarrinho = BigDecimal.ZERO;
        for (Item item : itens) {
            totalCarrinho = totalCarrinho.add(item.getTotal());
        }

//        registrando o pedido
        Pedido pedido1 = new Pedido(UUID.randomUUID().toString(), LocalDate.of(2024, 8, 15), totalCarrinho, EstadoDoPedido.Em_Transporte, itens, cliente1);
        cliente1.getPedidos().add(pedido1);

//        ------------------------------------------- excpetion -------------------------------------------
        EnderecoDeCobranca enderecoCobranca1 = new EnderecoDeCobranca("Centro", "A", "rua", "12345", "1912321");

        ClientePessoaFisica cliente2 = new ClientePessoaFisica("Regina Paz", "regina@gmail.com", "(00) 2341231223", List.of(enderecoCobranca), null, "231232321");
        enderecoCobranca1.getClientes().add(cliente2);

        Pedido pedido3 = new Pedido(UUID.randomUUID().toString(), LocalDate.of(2024, 8, 15), totalCarrinho, EstadoDoPedido.Em_Transporte, itens, cliente2);
        cliente1.getPedidos().add(pedido1);

        for(Endereco endereco : pedido3.getCliente().getEnderecos()) {
            if(!(endereco instanceof EnderecoDeEntrega)) {
                throw new FaltaEnderecoDeEntregaException("Falta cadastrar o endereço de entrega de entrega do cliente");
            }
        }

//        iii. ------------------------------------------------
//        baixando estoque do produto
        Produto.baixaEstoque(itens);

//        iv. ------------------------------------------------
//        imprimindo o pedido
        System.out.println("\nDetalhes do 1º pedido:");
        System.out.println(pedido1);

//        ------------------------ D ------------------------
//        registrando outro pedido
        Item item4 = new Item(20, new BigDecimal(20).multiply(produto1.getPrecoDeVenda()), Situacao.Ativo, produto1);
        Item item5 = new Item(16, new BigDecimal(16).multiply(produto2.getPrecoDeVenda()), Situacao.Ativo, produto2);
        Item item6 = new Item(15, new BigDecimal(15).multiply(produto3.getPrecoDeVenda()), Situacao.Ativo, produto3);

//        registrando itens carrinho 2
        itens.clear();
        itens.add(item4);
        itens.add(item5);
        itens.add(item6);

//        calculando o carrinho 2
        totalCarrinho = BigDecimal.ZERO;
        for (Item item : itens) {
            totalCarrinho = totalCarrinho.add(item.getTotal());
        }

//        registrando o pedido 2
        Pedido pedido2 = new Pedido(UUID.randomUUID().toString(), LocalDate.of(2024, 6, 10), totalCarrinho, EstadoDoPedido.Entregue, itens, cliente1);
        cliente1.getPedidos().add(pedido2);

//        baixando estoque do produto
        Produto.baixaEstoque(itens);

//        ------------------------ E ------------------------
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);

        System.out.println("\n------------------------------------------------------");
        System.out.println("Relatório de pedidos:");
        System.out.println(pedidos);

//        ------------------------ F ------------------------

        System.out.println("\n------------------------------------------------------");
        System.out.println("\nRelatório de vendas do último semestre: ");
        BigDecimal totalVendasSemestral = BigDecimal.ZERO;
        for(Pedido pedido : pedidos){
            if(pedido.getData().isAfter(LocalDate.now().minusMonths(6L))) {
                totalVendasSemestral = totalVendasSemestral.add(pedido.getTotal());
            }
        }
        System.out.println("Total de vendas do semestre: " + NumberFormat.getCurrencyInstance().format(totalVendasSemestral));

//        ------------------------ G ------------------------
        System.out.println("\n------------------------------------------------------");
        System.out.println("\nRelatório de vendas do último mês: ");
        BigDecimal totalVendasMensal = BigDecimal.ZERO;
        for(Pedido pedido : pedidos){
            if(pedido.getData().isAfter(LocalDate.now().minusMonths(1L))) {
                totalVendasMensal = totalVendasMensal.add(pedido.getTotal());
            }
        }
        System.out.println("Total de vendas do mês: " + NumberFormat.getCurrencyInstance().format(totalVendasMensal));

    }

}

package controller;

import exception.EstoqueInsuficiente;
import model.*;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class vendasController {
    public static void main(String[] args) {

    //  -------------------------------- C --------------------------------

    //  i. Registrar o Vendedor, os Produtos, e o Carrinho (uma lista de Item)
        Vendedor vendedor1 = new Vendedor(1L, "Rafael Pinto", "rafael@email.com", "(12) 123456789", new BigDecimal(1200), 10.0, Regiao.Sul);

        Fornecedor fornecedor1 = new Fornecedor("3123TD545", "Papel123", "papel@email.com", "(31) 097312312");
        Fornecedor fornecedor2 = new Fornecedor("52343YJ545", "Mundo das canetas", "mdcanetas@email.com", "(31) 53212312");

        Produto p1 = new Produto(UUID.randomUUID().toString(), "Caderno", "200 folhas x 10 matérias", 200, new BigDecimal(20), new BigDecimal(40), List.of(fornecedor1, fornecedor2));
        Produto p2 = new Produto(UUID.randomUUID().toString(), "Lápis", "nº4", 100, BigDecimal.valueOf(0.50), new BigDecimal(2), List.of(fornecedor1));
        Produto p3 = new Produto(UUID.randomUUID().toString(), "Caneta", "Azul", 250, BigDecimal.valueOf(1.50), new BigDecimal(3), List.of(fornecedor2));
        Produto p4 = new Produto(UUID.randomUUID().toString(), "Caneta", "Preta", 250, BigDecimal.valueOf(1.50), new BigDecimal(3), List.of(fornecedor1, fornecedor2));

        Item item1 = new Item(10, Situacao.Ativo, p1, new BigDecimal(10).multiply(p1.getPrecoDeVenda()));
        Item item2 = new Item(15, Situacao.Ativo, p2, new BigDecimal(15).multiply(p2.getPrecoDeVenda()));

        //ligando fornecedor e produto
        fornecedor1.getProdutos().add(p1);
        fornecedor1.getProdutos().add(p2);
        fornecedor1.getProdutos().add(p4);
        fornecedor2.getProdutos().add(p1);
        fornecedor2.getProdutos().add(p3);
        fornecedor2.getProdutos().add(p4);

        //criando carrinho de itens do pedido
        List<Item> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);

    //  ii. Registrar os detalhes de Pedido, como, número do pedido, total do pedido e a data do pedido

        //calculando o valor total do carrinho
        BigDecimal totalDoCarrinho = new BigDecimal(0);
        for (Item item : itens) {
            totalDoCarrinho = totalDoCarrinho.add(item.getTotal());
        }

        Pedido pedido1 = new Pedido(UUID.randomUUID().toString(), LocalDate.now(), totalDoCarrinho, Estado.Faturado, itens, vendedor1);
        vendedor1.getPedidos().add(pedido1);
        System.out.println("Número do pedido: " + pedido1.getNumero());
        System.out.println("Total: " + NumberFormat.getCurrencyInstance().format(pedido1.getValor()));
        System.out.println("Data da compra: " + pedido1.getData());

        try { //tenta executar
            Produto.baixarEstoqueComException(itens); //vai lança a exceção aqui, antes de registrar um pedido
        } catch (EstoqueInsuficiente e) { //se lançar uma exceção a captura aqui
            e.printStackTrace(); //imprime a pilha de exceção
        }


    //  iii. Baixar o estoque de Produto
        Produto.baixaEstoque(itens);

    //  iv. Imprimir o Pedido com seus detalhes, como, os Itens, o total de cada Item, o total do Pedido, e os demais atributos do Pedido;
        System.out.print("\n-------------------------- pedido 1 --------------------------");
        System.out.println(pedido1);

    //  -------------------------------- D --------------------------------

    //  Faça a aplicação realizar outro pedido, no mesmo formato, variando apenas a quantidade de cada Item;

    //  limpando a lista para reutilizar
        itens.clear();

    //  criando itens para novo pedido
        Item item3 = new Item(70, Situacao.Ativo, p1, new BigDecimal(70).multiply(p1.getPrecoDeVenda()));
        Item item4 = new Item(40, Situacao.Ativo, p2, new BigDecimal(40).multiply(p1.getPrecoDeVenda()));

    //  add novos itens no carrinho
        itens.add(item3);
        itens.add(item4);

    //  calculando o valor total do carrinho
        totalDoCarrinho = new BigDecimal(0);
        for(Item item : itens){
            totalDoCarrinho = totalDoCarrinho.add(item.getTotal());
        }

    //  baixando o estoque dos produtos
        Produto.baixaEstoque(itens);

    //  criando um novo pedido
        Pedido pedido2 = new Pedido(UUID.randomUUID().toString(), LocalDate.now(), totalDoCarrinho, Estado.Faturado, itens, vendedor1);
        vendedor1.getPedidos().add(pedido2);

    //  imprimindo o pedido 2
        System.out.print("\n-------------------------- pedido 2 --------------------------");
        System.out.println(pedido2);

    //  -------------------------------- E --------------------------------
    //  Faça a aplicação registrar os dois pedidos (os realizados nos itens c e d) em uma coleção de pedidos;
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);

    //  -------------------------------- F --------------------------------

    //  Faça o programa imprimir o Relatório de Vendas, isto é, todos os pedidos realizados, bem como, o total de vendas;

        //calculando o total de vendas
        BigDecimal totalVendas = new BigDecimal(0);
        for(Pedido pedido : pedidos){
            totalVendas = totalVendas.add(pedido.getValor());
        }

        System.out.print("\n-------------------------- Pedidos realizados --------------------------");
        System.out.println(pedidos);
        System.out.println("Total de vendas: " + NumberFormat.getCurrencyInstance().format(totalVendas));

    //  -------------------------------- G --------------------------------

    //  Faça o programa realizar a entrada de produtos no estoque. Garanta que o programa registre, o Fornecedor, o Fornecimento, e o Produto,
    //  em como, atualize o estoque. Imprima a nova posição de estoque;
        Fornecimento fornecimento1 = new Fornecimento(LocalDate.now(), 150, new BigDecimal(150).multiply(p1.getPrecoDeCusto()), p1, fornecedor1);
        Produto.atualizaEstoque(fornecimento1);

        Fornecimento fornecimento2 = new Fornecimento(LocalDate.now(), 200, new BigDecimal(200).multiply(p2.getPrecoDeCusto()), p2, fornecedor1);
        Produto.atualizaEstoque(fornecimento2);

        System.out.print("\n-------------------------- Atualização dos estoques --------------------------\n");
        System.out.println("Produto: " + fornecimento1.getProduto().getNome() + "\nEstoque atual: " + fornecimento1.getProduto().getEstoque());
        System.out.println("Produto: " + fornecimento2.getProduto().getNome() + "\nEstoque atual: " + fornecimento2.getProduto().getEstoque());


    //  -------------------------------- G --------------------------------

    //  Faça o programa registrar os fornecimentos em uma coleção de Fornecimento. Depois, faça o programa imprimir o Relatório de Fornecimentos, isto é, todos os fornecimentos
    //  realizados, bem como, o total fornecido;

        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(fornecimento1);
        fornecimentos.add(fornecimento2);

    //  -------------------------------- i --------------------------------

        BigDecimal totalCompra = new BigDecimal(0);
        for (Fornecimento fornecimento : fornecimentos){
            totalCompra = totalCompra.add(fornecimento.getTotal());
        }

        System.out.print("\n-------------------------- Fornecimentos realizados --------------------------\n");
        System.out.println(fornecimentos);
        System.out.println("Total comprado: " + NumberFormat.getCurrencyInstance().format(totalCompra));

    //  -------------------------------- i --------------------------------

    //  Crie uma classe de Exceção, a classe EstoqueInsuficiente, que emita a seguinte mensagem
    //  de exceção “Estoque Insuficiente”, e faça o programa lançar essa exceção, ao baixar o
    //  estoque, toda vez que a quantidade de produto for insuficiente.


    }
}

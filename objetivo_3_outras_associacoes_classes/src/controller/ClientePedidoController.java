package controller;

import java.util.*;

import model.Cliente;
import model.ItemPedido;
import model.Pedido;
import model.Produto;

import java.util.GregorianCalendar;

public class ClientePedidoController {
    public static void main(String[] args) {

        //cadastrando user no sistema
        Cliente cliente1 = new Cliente(1L, "Ana", "da Silva", true);
        System.out.println("\nCliente " + cliente1.getNome() + " " + cliente1.getSobrenome() + " cadastrado com sucesso!");

        //add produto no sistema
        Produto produto1 = new Produto(1L, "Arroz", "5kg Ceolin", 18.5, true);

        //add produtos no Pedido (cria um ItemPedido)
        ItemPedido item1 = new ItemPedido(1L, 2, (2 * produto1.getValor()), true, produto1);

        //Lista de itens do Pedido
        List<ItemPedido> itens = new ArrayList<ItemPedido>();
        itens.add(item1);

        //cadastra um pedido para o cliente
        Pedido pedido1 = new Pedido(
                1L,
                "à vista",
                "aberto",
                new GregorianCalendar(2021, Calendar.MAY, 12),
                new GregorianCalendar(2021, Calendar.MAY, 12),
                item1.getQuantidade() * produto1.getValor(),
                true, //somente com um item adicionado
                cliente1,
                itens);

        System.out.println("\nPedido realizado com sucesso. \nNúmero do pedido: " + pedido1.getId_pedido() + "\nDetalhes do pedido:" + pedido1.toString());

        //add pedido na lista de pedidos do cliente1 (já que nn possui bd)
        cliente1.getPedidos().add(pedido1);

        //Relatório do sistema (relação de pedidos com um cliente)
        System.out.println("\n\nPedidos do(a) cliente " + cliente1.getNome() + " " + cliente1.getSobrenome() + "\n" + cliente1.getPedidos());
    }
}

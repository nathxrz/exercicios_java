package controller;

import model.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class vendasController {
    public static void main(String[] args) {
        //Registrar o Vendedor, os Produtos, e o Carrinho (uma lista de Item);
        Vendedor vendedor1 = new Vendedor(1L, "Rafael Pinto", "rafael@email.com", "(12) 123456789", new BigDecimal(1200), 10.0, Regiao.Sul, null);

        Produto p1 = new Produto("34T263", "Caderno", "200 folhas x 10 matérias", 200, new BigDecimal(20), new BigDecimal(40), null, null);
        Produto p2 = new Produto("749T74", "Lápis", "nº4", 400, new BigDecimal(0.50), new BigDecimal(2.5), null, null);
        Produto p3 = new Produto("95384T", "Caneta", "Azul", 250, new BigDecimal(1.50), new BigDecimal(3), null, null);
        Produto p4 = new Produto("0338K8", "Caneta", "Preta", 250, new BigDecimal(1.50), new BigDecimal(3), null, null);

        Item item1 = new Item(100, Situacao.Ativo, p1, new BigDecimal(p1.getPrecoDeVenda()));

        List<Item> itens = new ArrayList<>();






    }
}

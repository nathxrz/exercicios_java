package controller;

import model.Carro;
import model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args) {
        Produto prod1 = new Produto(1, "Caderno", "10 Matérias", 30.00, 30);
        Produto prod2 = new Produto(2, "Caneta", "Azul", 1.00, 100);
        Produto prod3 = new Produto(3, "Lápis", 1.00);
        Produto prod4 = new Produto(4, "Lapiseira", 7.00);
        Produto prod5 = new Produto();
        Produto prod6 = new Produto();

        System.out.println("----- toString -----");
        System.out.println(prod1.toString());
        System.out.println(prod2.toString());
        System.out.println(prod3.toString());
        System.out.println(prod4.toString());
        System.out.println(prod5.toString());
        System.out.println(prod6.toString());

        prod1.setEstoque(40);
        prod2.setDescricao("Preta");
        prod3.setDescricao("2.0");
        prod4.setDescricao("2.5");
        prod5.setId(5);
        prod5.setNome("Borracha");
        prod6.setId(6);
        prod6.setNome("Estojo");

        System.out.println("----- getters-prod1 -----");
        System.out.println(prod1.getId());
        System.out.println(prod1.getNome());
        System.out.println(prod1.getDescricao());
        System.out.println(prod1.getValor());
        System.out.println(prod1.getEstoque());

        System.out.println("----- getters-prod2 -----");
        System.out.println(prod2.getId());
        System.out.println(prod2.getNome());
        System.out.println(prod2.getDescricao());
        System.out.println(prod2.getValor());
        System.out.println(prod2.getEstoque());

        System.out.println("----- getters-prod3 -----");
        System.out.println(prod3.getId());
        System.out.println(prod3.getNome());
        System.out.println(prod3.getDescricao());
        System.out.println(prod3.getValor());

        System.out.println("----- getters-prod4 -----");
        System.out.println(prod4.getId());
        System.out.println(prod4.getNome());
        System.out.println(prod4.getDescricao());
        System.out.println(prod4.getValor());

        System.out.println("----- getters-prod5 -----");
        System.out.println(prod5.getId());
        System.out.println(prod5.getNome());

        System.out.println("----- getters-prod6 -----");
        System.out.println(prod6.getId());
        System.out.println(prod6.getNome());

        List<Produto> produtos = new ArrayList<>();
        produtos.add(prod1);
        produtos.add(prod2);
        produtos.add(prod3);
        produtos.add(prod4);
        produtos.add(prod5);
        produtos.add(prod6);

        System.out.println("-----Lista-----");
        System.out.println(produtos);

        System.out.println("-----Lista Decrescente-----");
        produtos.sort(Comparator.comparing(Produto::getId).reversed());
        System.out.println(produtos);

        System.out.println("-----Lista Objeto id=3-----");
        Produto produtoFind = produtos.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(produtoFind);

        Map<Integer, Produto> produtosMap = new HashMap<>();
        produtosMap.put(prod1.getId(), prod1);
        produtosMap.put(prod2.getId(), prod2);
        produtosMap.put(prod3.getId(), prod3);
        produtosMap.put(prod4.getId(), prod4);
        produtosMap.put(prod5.getId(), prod5);
        produtosMap.put(prod6.getId(), prod6);

        System.out.println("----Map ----");
        System.out.println(produtosMap);

        System.out.println("----Map não permite a ordenação ----");

        System.out.println("-----Map Objeto id=3-----");
        System.out.println(produtosMap.get(3));
    }
}

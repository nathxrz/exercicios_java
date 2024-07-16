package controller;

import model.Marca;

import java.util.*;

public class MarcaController {
    public static void main(String[] args) {
        Marca marca1 = new Marca(1, "Fiat");
        Marca marca2 = new Marca(2, "Citroën");
        Marca marca3 = new Marca();
        Marca marca4 = new Marca();
        Marca marca5 = new Marca(5);
        Marca marca6 = new Marca(6);


        System.out.println("----- toString -----");
        System.out.println(marca1.toString());
        System.out.println(marca2.toString());
        System.out.println(marca3.toString());
        System.out.println(marca4.toString());
        System.out.println(marca5.toString());
        System.out.println(marca6.toString());

        marca1.setDescricao("Mercedes");
        marca2.setDescricao("Fiat");
        marca3.setId(3);
        marca4.setId(4);
        marca5.setDescricao("Honda");
        marca6.setDescricao("Gol");

        System.out.println("----- getters-marca1 -----");
        System.out.println(marca1.getId());
        System.out.println(marca1.getDescricao());

        System.out.println("----- getters-marca2 -----");
        System.out.println(marca2.getId());
        System.out.println(marca2.getDescricao());

        System.out.println("----- getters-marca3 -----");
        System.out.println(marca3.getId());

        System.out.println("----- getters-marca4 -----");
        System.out.println(marca4.getId());

        System.out.println("----- getters-marca5 -----");
        System.out.println(marca5.getId());
        System.out.println(marca5.getDescricao());

        System.out.println("----- getters-marca6 -----");
        System.out.println(marca6.getId());
        System.out.println(marca6.getDescricao());

        List<Marca> marcas = new ArrayList<>();
        marcas.add(marca1);
        marcas.add(marca2);
        marcas.add(marca3);
        marcas.add(marca4);
        marcas.add(marca5);
        marcas.add(marca6);

        System.out.println("-----Lista-----");
        System.out.println(marcas);

        System.out.println("-----Lista Decrescente-----");
        marcas.sort(Comparator.comparing(Marca::getId).reversed());
        System.out.println(marcas);

        System.out.println("-----Lista Objeto id=3-----");
        Marca marcaFind = marcas.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(marcaFind);

        Map<Integer, Marca> marcasMap = new HashMap<>();
        marcasMap.put(marca1.getId(), marca1);
        marcasMap.put(marca2.getId(), marca2);
        marcasMap.put(marca3.getId(), marca3);
        marcasMap.put(marca4.getId(), marca4);
        marcasMap.put(marca5.getId(), marca5);
        marcasMap.put(marca6.getId(), marca6);

        System.out.println("----Map ----");
        System.out.println(marcasMap);

        System.out.println("----Map não permite a ordenação ----");

        System.out.println("-----Map Objeto id=3-----");
        System.out.println(marcasMap.get(3));
    }
}

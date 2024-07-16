package controller;

import model.Carro;

import java.util.*;

public class CarroController {
    public static void main(String[] args) {
        Carro carro1 = new Carro(1, "Fiat", "Pulse", 2023);
        Carro carro2 = new Carro(2, "Honda", "Inline", 2020);
        Carro carro3 = new Carro();
        Carro carro4 = new Carro();
        Carro carro5 = new Carro(5, "BMW");
        Carro carro6 = new Carro(6, "Chevrolet");

        System.out.println("----- toString -----");
        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
        System.out.println(carro3.toString());
        System.out.println(carro4.toString());
        System.out.println(carro5.toString());
        System.out.println(carro6.toString());

        carro1.setAnoFabricacao(2024);
        carro2.setModelo("Fan");
        carro3.setId(3);
        carro3.setMarca("Audi");
        carro4.setId(4);
        carro4.setMarca("BYD");
        carro5.setMarca("Chevrolet");
        carro6.setMarca("Chevrolet");

        System.out.println("----- getters-carro1 -----");
        System.out.println(carro1.getId());
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAnoFabricacao());

        System.out.println("----- getters-carro2 -----");
        System.out.println(carro2.getId());
        System.out.println(carro2.getMarca());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getAnoFabricacao());

        System.out.println("----- getters-carro3 -----");
        System.out.println(carro3.getId());
        System.out.println(carro3.getMarca());

        System.out.println("----- getters-carro4 -----");
        System.out.println(carro4.getId());
        System.out.println(carro4.getMarca());

        System.out.println("----- getters-carro5 -----");
        System.out.println(carro5.getId());
        System.out.println(carro5.getMarca());

        System.out.println("----- getters-carro6 -----");
        System.out.println(carro6.getId());
        System.out.println(carro6.getMarca());

        List<Carro> carros = new ArrayList<>();
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);
        carros.add(carro5);
        carros.add(carro6);

        System.out.println("-----Lista-----");
        System.out.println(carros);

        System.out.println("-----Lista Decrescente-----");
        carros.sort(Comparator.comparing(Carro::getId).reversed());
        System.out.println(carros);

        System.out.println("-----Lista Objeto id=3-----");
        Carro carroFind = carros.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(carroFind);

        Map<Integer, Carro> carrosMap = new HashMap<>();
        carrosMap.put(carro1.getId(), carro1);
        carrosMap.put(carro2.getId(), carro2);
        carrosMap.put(carro3.getId(), carro3);
        carrosMap.put(carro4.getId(), carro4);
        carrosMap.put(carro5.getId(), carro5);
        carrosMap.put(carro6.getId(), carro6);

        System.out.println("----Map ----");
        System.out.println(carrosMap);

        System.out.println("----Map não permite a ordenação ----");

        System.out.println("-----Map Objeto id=3-----");
        System.out.println(carrosMap.get(3));

    }
}

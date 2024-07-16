package controller;

import model.Automovel;

import java.util.*;

public class AutomovelController {
    public static void main(String[] args) {
        Automovel auto1 = new Automovel(1, "1231232", "12HDIS4", "Prata", 4, "50", 100, "3FHKD44", 120);
        Automovel auto2 = new Automovel();
        Automovel auto3 = new Automovel(3, "GTHD431", "Roxo");
        Automovel auto4 = new Automovel(4, "HGDD94R", "Preto");
        Automovel auto5 = new Automovel(5, "8523432", "SDFTS642", "Vermelho", 4, "50", 120, "DEDF938", 85);
        Automovel auto6 = new Automovel();

        System.out.println("----- toString -----");
        System.out.println(auto1.toString());
        System.out.println(auto2.toString());
        System.out.println(auto3.toString());
        System.out.println(auto4.toString());
        System.out.println(auto5.toString());
        System.out.println(auto6.toString());
        auto1.setCor("Azul");
        auto1.setCombustivel("55");
        auto2.setId(2);
        auto2.setRenavan("7583473");
        auto3.setNum_rodas(2);
        auto4.setPlaca("DSAS231");
        auto5.setChassi("2312312ffd");
        auto6.setId(6);

        System.out.println("----- getters-auto1 -----");
        System.out.println(auto1.getId());
        System.out.println(auto1.getRenavan());
        System.out.println(auto1.getPlaca());
        System.out.println(auto1.getCor());
        System.out.println(auto1.getNum_rodas());
        System.out.println(auto1.getCombustivel());
        System.out.println(auto1.getQuilometragem());
        System.out.println(auto1.getChassi());
        System.out.println(auto1.getValor_locacao());

        System.out.println("----- getters-auto2 -----");
        System.out.println(auto2.getId());
        System.out.println(auto2.getRenavan());

        System.out.println("----- getters-auto3 -----");
        System.out.println(auto3.getId());
        System.out.println(auto3.getPlaca());
        System.out.println(auto3.getCor());

        System.out.println("----- getters-auto4 -----");
        System.out.println(auto4.getId());
        System.out.println(auto4.getPlaca());
        System.out.println(auto4.getCor());

        System.out.println("----- getters-auto5 -----");
        System.out.println(auto5.getId());
        System.out.println(auto5.getRenavan());
        System.out.println(auto5.getPlaca());
        System.out.println(auto5.getCor());
        System.out.println(auto5.getNum_rodas());
        System.out.println(auto5.getCombustivel());
        System.out.println(auto5.getQuilometragem());
        System.out.println(auto5.getChassi());
        System.out.println(auto5.getValor_locacao());

        System.out.println("----- getters-auto6 -----");
        System.out.println(auto6.getId());

        List<Automovel> automoveis = new ArrayList<>();
        automoveis.add(auto1);
        automoveis.add(auto2);
        automoveis.add(auto3);
        automoveis.add(auto4);
        automoveis.add(auto5);
        automoveis.add(auto6);

        System.out.println("-----Lista-----");
        System.out.println(automoveis);

        System.out.println("-----Lista Decrescente-----");
        automoveis.sort(Comparator.comparing(Automovel::getId).reversed());
        System.out.println(automoveis);

        System.out.println("-----Lista Objeto id=3-----");
        Automovel autoFind = automoveis.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(autoFind);

        Map<Integer, Automovel> automoviesMap = new HashMap<>();
        automoviesMap.put(auto1.getId(), auto1);
        automoviesMap.put(auto2.getId(), auto2);
        automoviesMap.put(auto3.getId(), auto3);
        automoviesMap.put(auto4.getId(), auto4);
        automoviesMap.put(auto5.getId(), auto5);
        automoviesMap.put(auto6.getId(), auto6);

        System.out.println("----Map ----");
        System.out.println(automoviesMap);

        System.out.println("----Map não permite a ordenação ----");

        System.out.println("-----Map Objeto id=3-----");
        System.out.println(automoviesMap.get(3));
    }
}

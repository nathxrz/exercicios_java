package controller;

import model.Modelo;

import java.util.*;

public class ModeloController {
    public static void main(String[] args) {
        Modelo modelo1 = new Modelo();
        Modelo modelo2 = new Modelo();
        Modelo modelo3 = new Modelo(3, "SUV");
        Modelo modelo4 = new Modelo(4, "Picape");
        Modelo modelo5 = new Modelo(5);
        Modelo modelo6 = new Modelo(6);

        System.out.println("----- toString -----");
        System.out.println(modelo1.toString());
        System.out.println(modelo2.toString());
        System.out.println(modelo3.toString());
        System.out.println(modelo4.toString());
        System.out.println(modelo5.toString());
        System.out.println(modelo6.toString());

        modelo1.setId(1);
        modelo2.setId(2);
        modelo3.setDescricao("Sedan");
        modelo4.setDescricao("Esportivo");
        modelo5.setDescricao("Minivan");
        modelo1.setDescricao("Hatch");


        System.out.println("----- getters-modelo1 -----");
        System.out.println(modelo1.getId());

        System.out.println("----- getters-modelo2 -----");
        System.out.println(modelo2.getId());

        System.out.println("----- getters-modelo3 -----");
        System.out.println(modelo3.getId());
        System.out.println(modelo3.getDescricao());

        System.out.println("----- getters-modelo4 -----");
        System.out.println(modelo4.getId());
        System.out.println(modelo4.getDescricao());

        System.out.println("----- getters-modelo5 -----");
        System.out.println(modelo5.getId());
        System.out.println(modelo5.getDescricao());

        System.out.println("----- getters-modelo6 -----");
        System.out.println(modelo6.getId());
        System.out.println(modelo6.getDescricao());

        List<Modelo> modelos = new ArrayList<>();
        modelos.add(modelo1);
        modelos.add(modelo2);
        modelos.add(modelo3);
        modelos.add(modelo4);
        modelos.add(modelo5);
        modelos.add(modelo6);

        System.out.println("-----Lista-----");
        System.out.println(modelos);

        System.out.println("-----Lista Decrescente-----");
        modelos.sort(Comparator.comparing(Modelo::getId).reversed());
        System.out.println(modelos);

        System.out.println("-----Lista Objeto id=3-----");
        Modelo modeloFind = modelos.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(modeloFind);

        Map<Integer, Modelo> modelosMap = new HashMap<>();
        modelosMap.put(modelo1.getId(), modelo1);
        modelosMap.put(modelo2.getId(), modelo2);
        modelosMap.put(modelo3.getId(), modelo3);
        modelosMap.put(modelo4.getId(), modelo4);
        modelosMap.put(modelo5.getId(), modelo5);
        modelosMap.put(modelo6.getId(), modelo6);

        System.out.println("----Map ----");
        System.out.println(modelosMap);

        System.out.println("----Map não permite a ordenação ----");

        System.out.println("-----Map Objeto id=3-----");
        System.out.println(modelosMap.get(3));

    }
}

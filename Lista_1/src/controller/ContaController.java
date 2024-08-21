package controller;

import model.Conta;

import java.util.*;

public class ContaController {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta conta3 = new Conta(3, 100);
        Conta conta4 = new Conta(4,0);

        System.out.println("----- toString -----");
        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
        System.out.println(conta3.toString());
        System.out.println(conta4.toString());

        conta1.setId(1);
        conta1.setSaldo(0);
        conta2.setId(2);
        conta2.setSaldo(10);
        conta3.saca(50);
        conta4.deposita(150);

        System.out.println("----- getters-conta1 -----");
        System.out.println(conta1.getId());
        System.out.println(conta1.getSaldo());

        System.out.println("----- getters-conta2 -----");
        System.out.println(conta2.getId());
        System.out.println(conta2.getSaldo());

        System.out.println("----- getters-conta3 -----");
        System.out.println(conta3.getId());
        System.out.println(conta3.getSaldo());

        System.out.println("----- getters-conta4 -----");
        System.out.println(conta4.getId());
        System.out.println(conta4.getSaldo());

        List<Conta> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);

        System.out.println("-----Lista-----");
        System.out.println(contas);

        System.out.println("-----Lista Decrescente-----");
        contas.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println(contas);

        System.out.println("-----Lista Objeto id=3-----");
        Conta contaFind = contas.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(contaFind);

        Map<Integer, Conta> contasMap = new HashMap<>();
        contasMap.put(conta1.getId(), conta1);
        contasMap.put(conta2.getId(), conta2);
        contasMap.put(conta3.getId(), conta3);
        contasMap.put(conta4.getId(), conta4);

        System.out.println("----Map ----");
        System.out.println(contasMap);

        System.out.println("----Map não permite a ordenação ----");

        System.out.println("-----Map Objeto id=3-----");
        System.out.println(contasMap.get(3));
    }
}

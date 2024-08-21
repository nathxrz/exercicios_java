package controller;

import model.Locacao;

import java.time.LocalDateTime;
import java.util.*;

public class LocacaoController {
    public static void main(String[] args) {
        Locacao aluguel1 = new Locacao(1, LocalDateTime.of(2024, 2, 10, 10, 0), LocalDateTime.of(2024, 2, 10, 10, 0), LocalDateTime.of(2024, 3, 10, 10, 0), LocalDateTime.of(2024, 3, 10, 10, 0), 100, 110, 470, false);
        Locacao aluguel2 = new Locacao(2, LocalDateTime.of(2024, 4, 5, 10, 0), LocalDateTime.of(2024, 4, 5, 10, 0), LocalDateTime.of(2024, 5, 12, 10, 0), LocalDateTime.of(2024, 5, 12, 10, 0), 230, 140, 500, false);
        Locacao aluguel3 = new Locacao(3, LocalDateTime.of(2024, 6, 3, 10, 0), LocalDateTime.of(2024, 4, 6, 10, 0), 431, false);
        Locacao aluguel4 = new Locacao(4, LocalDateTime.of(2024, 2, 2, 10, 0), LocalDateTime.of(2024, 4, 7, 10, 0), 464, false);
        Locacao aluguel5 = new Locacao(5, LocalDateTime.of(2024, 4, 6, 10, 0), LocalDateTime.of(2024, 4, 3, 10, 0), 764, false);
        Locacao aluguel6 = new Locacao();
        Locacao aluguel7 = new Locacao();

        System.out.println("----- toString -----");
        System.out.println(aluguel1.toString());
        System.out.println(aluguel2.toString());
        System.out.println(aluguel3.toString());
        System.out.println(aluguel4.toString());
        System.out.println(aluguel5.toString());
        System.out.println(aluguel6.toString());
        System.out.println(aluguel7.toString());

        aluguel1.setDevolvido(true);
        aluguel1.setDataDevolucao(LocalDateTime.of(2024, 3, 14, 10, 0));
        aluguel2.setQuilometragem(430);
        aluguel3.setValorCalcao(230);
        aluguel4.setQuilometragem(200);
        aluguel5.setDevolvido(true);
        aluguel6.setId(6);
        aluguel6.setValorCalcao(200);
        aluguel7.setId(7);
        aluguel7.setValorCalcao(180);

        System.out.println("----- getters-aluguel1 -----");
        System.out.println(aluguel1.getId());
        System.out.println(aluguel1.getDataLocacao());
        System.out.println(aluguel1.getHoraLocacao());
        System.out.println(aluguel1.getDataDevolucao());
        System.out.println(aluguel1.getHoraDevolucao());
        System.out.println(aluguel1.getQuilometragem());
        System.out.println(aluguel1.getValorCalcao());
        System.out.println(aluguel1.getValorLocacao());
        System.out.println(aluguel1.getDevolvido());

        System.out.println("----- getters-aluguel2 -----");
        System.out.println(aluguel2.getId());
        System.out.println(aluguel2.getDataLocacao());
        System.out.println(aluguel2.getHoraLocacao());
        System.out.println(aluguel2.getDataDevolucao());
        System.out.println(aluguel2.getHoraDevolucao());
        System.out.println(aluguel2.getQuilometragem());
        System.out.println(aluguel2.getValorCalcao());
        System.out.println(aluguel2.getValorLocacao());
        System.out.println(aluguel2.getDevolvido());

        System.out.println("----- getters-aluguel3 -----");
        System.out.println(aluguel3.getId());
        System.out.println(aluguel3.getDataLocacao());
        System.out.println(aluguel3.getDataDevolucao());
        System.out.println(aluguel3.getDevolvido());

        System.out.println("----- getters-aluguel4 -----");
        System.out.println(aluguel4.getId());
        System.out.println(aluguel4.getDataLocacao());
        System.out.println(aluguel4.getDataDevolucao());
        System.out.println(aluguel4.getDevolvido());

        System.out.println("----- getters-aluguel5 -----");
        System.out.println(aluguel5.getId());
        System.out.println(aluguel5.getDataLocacao());
        System.out.println(aluguel5.getDataDevolucao());
        System.out.println(aluguel5.getDevolvido());

        System.out.println("----- getters-aluguel6 -----");
        System.out.println(aluguel6.getId());
        System.out.println(aluguel6.getValorCalcao());

        System.out.println("----- getters-aluguel7 -----");
        System.out.println(aluguel7.getId());
        System.out.println(aluguel7.getValorCalcao());

        List<Locacao> locacoes = new ArrayList<>();
        locacoes.add(aluguel1);
        locacoes.add(aluguel2);
        locacoes.add(aluguel3);
        locacoes.add(aluguel4);
        locacoes.add(aluguel5);
        locacoes.add(aluguel6);
        locacoes.add(aluguel7);

        System.out.println("-----Lista-----");
        System.out.println(locacoes);

        System.out.println("-----Lista Decrescente-----");
        locacoes.sort(Comparator.comparing(Locacao::getId).reversed());
        System.out.println(locacoes);

        System.out.println("-----Lista Objeto id=3-----");
        Locacao locacaoFind = locacoes.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(locacaoFind);

        Map<Integer, Locacao> locacoesMap = new HashMap<>();
        locacoesMap.put(aluguel1.getId(), aluguel1);
        locacoesMap.put(aluguel2.getId(), aluguel2);
        locacoesMap.put(aluguel3.getId(), aluguel3);
        locacoesMap.put(aluguel4.getId(), aluguel4);
        locacoesMap.put(aluguel5.getId(), aluguel5);
        locacoesMap.put(aluguel6.getId(), aluguel6);
        locacoesMap.put(aluguel7.getId(), aluguel7);

        System.out.println("----Map----");
        System.out.println(locacoesMap);

        System.out.println("----Map não permite a ordenação ----");

        System.out.println("-----Map Objeto id=3-----");
        System.out.println(locacoesMap.get(3));
    }
}

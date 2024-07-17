package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FuncionarioController {
    public static void main(String[] args) {

//        ---- questão 1 ----
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Felipe", 2500);
        Desenvolvedor desenvolvedor2 = new Desenvolvedor("Rafaela", 2500);
        Desenvolvedor desenvolvedor3 = new Desenvolvedor("Leticia", 2500);
        Desenvolvedor desenvolvedor4 = new Desenvolvedor("Henrique", 2500);
        Desenvolvedor desenvolvedor5 = new Desenvolvedor("Luiz", 2500);
        Desenvolvedor desenvolvedor6 = new Desenvolvedor("Carla", 2500);

        Gerente gerente1 = new Gerente("Ana Silva", 8500.00, "TSLA", 150);
        Gerente gerente2 = new Gerente("Carlos Souza", 9200.00, "AAPL", 200);
        Gerente gerente3 = new Gerente("Mariana Costa", 7800.00, "GOOGL", 180);
        Gerente gerente4 = new Gerente("Ricardo Pereira", 9900.00, "AMZN", 220);
        Gerente gerente5 = new Gerente("Fernanda Lima", 8700.00, "MSFT", 170);
        Gerente gerente6 = new Gerente("Juliana Oliveira", 9300.00, "NFLX", 190);

        Cliente cliente1 = new Cliente("Lucas", "Pereira", "AAPL", 50);
        Cliente cliente2 = new Cliente("Mariana", "Souza", "GOOGL", 30);
        Cliente cliente3 = new Cliente("João", "Silva", "AMZN", 45);
        Cliente cliente4 = new Cliente("Ana", "Costa", "MSFT", 20);
        Cliente cliente5 = new Cliente("Pedro", "Lima", "NFLX", 60);
        Cliente cliente6 = new Cliente("Fernanda", "Oliveira", "TSLA", 25);

        System.out.println("\n\nDesenvolvedores:");
        System.out.println(desenvolvedor1.toString());
        System.out.println(desenvolvedor2.toString());
        System.out.println(desenvolvedor3.toString());
        System.out.println(desenvolvedor4.toString());
        System.out.println(desenvolvedor5.toString());
        System.out.println(desenvolvedor6.toString());
        System.out.println("\n\nGerentes:");
        System.out.println(gerente1.toString());
        System.out.println(gerente2.toString());
        System.out.println(gerente3.toString());
        System.out.println(gerente4.toString());
        System.out.println(gerente5.toString());
        System.out.println(gerente6.toString());
        System.out.println("\n\nClientes:");
        System.out.println(desenvolvedor1.toString());
        System.out.println(desenvolvedor2.toString());
        System.out.println(desenvolvedor3.toString());
        System.out.println(desenvolvedor4.toString());
        System.out.println(desenvolvedor5.toString());
        System.out.println(desenvolvedor6.toString());

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(desenvolvedor1);
        funcionarios.add(desenvolvedor2);
        funcionarios.add(desenvolvedor3);
        funcionarios.add(desenvolvedor4);
        funcionarios.add(desenvolvedor5);
        funcionarios.add(desenvolvedor6);
        funcionarios.add(gerente1);
        funcionarios.add(gerente2);
        funcionarios.add(gerente3);
        funcionarios.add(gerente4);
        funcionarios.add(gerente5);
        funcionarios.add(gerente6);
//        funcionarios.add(cliente1); não permite, pois não é subclasse de funcionario

        List<Investidor> investidores = new ArrayList<>();
        investidores.add(cliente1);
        investidores.add(cliente2);
        investidores.add(cliente3);
        investidores.add(cliente4);
        investidores.add(cliente5);
        investidores.add(cliente6);
        investidores.add(gerente1);
        investidores.add(gerente2);
        investidores.add(gerente3);
        investidores.add(gerente4);
        investidores.add(gerente5);
        investidores.add(gerente6);

        System.out.println("\n\nFuncionarios: (ordem: decrescente - salario");
        funcionarios.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println(funcionarios);
//        for (Funcionario funcionario : funcionarios) {
//            System.out.println(funcionario);
//        }

        System.out.println("\n\nInvestidores: (ordem: decrescente - ações");
        investidores.sort(Comparator.comparing(Investidor::getQuantidade).reversed());
        System.out.println(investidores);
//        for (Investidor investidor : investidores) {
//            System.out.println(investidor);
//        }

        System.out.println("\n\nFuncionario com o maior salario:");
        // collections.max() pega o maior salario;
        Funcionario func_maior_salario = Collections.max(funcionarios, Comparator.comparing(Funcionario::getSalario));

        funcionarios.forEach(f -> {
        // compara os demais salarios com o maior para escrever na tela os funcs que possuem o mesmo salario (maior)
            if(f.getSalario() >= func_maior_salario.getSalario()) {
                System.out.print(f);
            }
        });

        System.out.println("\n\nInvestidor com a maior quantidade de ações:");
        Investidor inves_maior_quant_acoes = Collections.max(investidores, Comparator.comparing(Investidor::getQuantidade));

        investidores.forEach(f -> {
            if(f.getQuantidade() >= inves_maior_quant_acoes.getQuantidade()) {
                System.out.print(f);
            }
        });

    }
}

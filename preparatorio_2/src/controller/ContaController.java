package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContaController {
    public static void main(String[] args) {
        ContaCorrente contaCorente1 = new ContaCorrente(1000, 10, 500.00);
        ContaCorrente contaCorente2 = new ContaCorrente(2000, 20, 500.00);
        ContaCorrente contaCorente3 = new ContaCorrente(3000, 5, 1000.00);

        ContaPoupanca contaPoupanca1 = new ContaPoupanca(500);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca(600);
        ContaPoupanca contaPoupanca3 = new ContaPoupanca(700);

        Cliente cliente1 = new Cliente("Fernando", 2, 300.00);
        Cliente cliente2 = new Cliente("Renata", 3, 500.00);
        Cliente cliente3 = new Cliente("Julia", 5, 1000.00);

        System.out.println("Imprimindo os objetos:");
        System.out.println(contaCorente1);
        System.out.println(contaCorente2);
        System.out.println(contaCorente3);
        System.out.println(contaPoupanca1);
        System.out.println(contaPoupanca2);
        System.out.println(contaPoupanca3);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);

        List<Conta> contas = new ArrayList<Conta>();
        contas.add(contaCorente1);
        contas.add(contaCorente2);
        contas.add(contaCorente3);
        contas.add(contaPoupanca1);
        contas.add(contaPoupanca2);
        contas.add(contaPoupanca3);

        List<Associado> associados = new ArrayList<Associado>();
        associados.add(contaCorente1);
        associados.add(contaCorente2);
        associados.add(contaCorente3);
        associados.add(cliente1);
        associados.add(cliente2);
        associados.add(cliente3);

        contaPoupanca1.deposita(1000.00);
        contaCorente1.atualiza(5);
        contaPoupanca1.saca(50.00);

        contaCorente1.deposita(500.00);
        contaCorente1.saca(400.00);

//        atualizando a quantidade de cotas dos associados:
        contaCorente1.setQdeCotas(100);
        contaCorente2.setQdeCotas(400);
        contaCorente3.setQdeCotas(600);
        cliente1.setQdeCotas(300);
        cliente2.setQdeCotas(600);
        cliente3.setQdeCotas(600);

        System.out.println("Imprimindo lista de associados:");
        System.out.println(associados);

//        ordenando lista de associados
//        Collections.sort(associados, new Comparator<Associado>(){
//            public int compare(Associado a1, Associado a2) {
//                return Integer.compare(a2.getQdeCotas(), a1.getQdeCotas());
//            }
//        });
//        associados.sort(Comparator.comparing(Associado::lucros.qdeCotas).reversed);
//
    }
}

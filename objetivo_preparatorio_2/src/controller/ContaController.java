package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContaController {
    public static void main(String[] args) {

//        ------------------------- A ---------------------------
        ContaCorrente contaCorente1 = new ContaCorrente(1000, 10, 500.00);
        ContaCorrente contaCorente2 = new ContaCorrente(2000, 20, 500.00);
        ContaCorrente contaCorente3 = new ContaCorrente(3000, 5, 1050.00);

        ContaPoupanca contaPoupanca1 = new ContaPoupanca(500);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca(600);
        ContaPoupanca contaPoupanca3 = new ContaPoupanca(700);

        Cliente cliente1 = new Cliente("Fernando", 2, 300.00);
        Cliente cliente2 = new Cliente("Renata", 3, 500.00);
        Cliente cliente3 = new Cliente("Julia", 5, 1000.00);

        System.out.println("\nImprimindo os objetos:");
        System.out.println(contaCorente1);
        System.out.println(contaCorente2);
        System.out.println(contaCorente3);
        System.out.println(contaPoupanca1);
        System.out.println(contaPoupanca2);
        System.out.println(contaPoupanca3);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);

//        ------------------------- B ---------------------------
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

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        List<ContaCorrente> contasCorrente = new ArrayList<>();
        contasCorrente.add(contaCorente1);
        contasCorrente.add(contaCorente2);
        contasCorrente.add(contaCorente3);

        System.out.println("\nImprimindo lista de contas:");
        System.out.println(contas);

        System.out.println("\nImprimindo lista de associados:");
        System.out.println(associados);

        System.out.println("\nImprimindo lista de clientes:");
        System.out.println(clientes);

        System.out.println("\nImprimindo lista de contas correntes:");
        System.out.println(contasCorrente);

//        ------------------------- C ---------------------------
        contaPoupanca1.deposita(1000.00);
        contaCorente1.atualiza(5);
        contaPoupanca1.saca(50.00);

//        ------------------------- D ---------------------------
        contaCorente1.deposita(500.00);
        contaCorente1.saca(400.00);

//        ------------------------- E ---------------------------
        contaCorente1.setQdeCotas(100);
        contaCorente2.setQdeCotas(400);
        contaCorente3.setQdeCotas(600);
        cliente1.setQdeCotas(300);
        cliente2.setQdeCotas(600);
        cliente3.setQdeCotas(600);

//        ------------------------- F ---------------------------
        clientes.sort(Comparator.comparing(Cliente::getQdeCotas).reversed());
        contasCorrente.sort(Comparator.comparing(ContaCorrente::getQdeCotas).reversed());

        System.out.println("\nClientes associados (decrescente): " + clientes);
        System.out.println("\nContas correntes associadas (decrescente): " + contasCorrente);

        System.out.println("\n---- Clientes com maiores quantidade de cotas: ----");
        Cliente clienteMaiorQuantCotas = Collections.max(clientes, Comparator.comparing(Cliente::getQdeCotas)); //primeiro define a maior quantidade de cotas;
        for (Cliente cliente : clientes) {
                if(cliente.getQdeCotas() >= clienteMaiorQuantCotas.getQdeCotas()) { //compara com os demais
                    System.out.println(cliente);
                }
        }

        System.out.println("\n---- Contas Correntes com maiores quantidade de cotas: ----");
        ContaCorrente cCMaiorQuantCotas = Collections.max(contasCorrente, Comparator.comparing(ContaCorrente::getQdeCotas));
        for (ContaCorrente cc : contasCorrente) {
            if(cc.getQdeCotas() >= cCMaiorQuantCotas.getQdeCotas()) {
                System.out.println(cc);
            }
        }

//        ------------------------- G ---------------------------

        // contas cadastradas no sistema, ordenadas pelo critério saldo, em ordem decrescente
        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("\n---- Contas cadastradas no sistema em ordem decrescente (saldo): ----");
        System.out.println(contas);

        //imprima todas associados que sejam Associado e possua conta cadastradas no sistema, em qualquer ordem
        System.out.println("---- Associados ao sistema: ----");
        System.out.println(associados);

        //Também faça o programa imprimir a lista de contas com maior saldo bancário.
        System.out.println("---- Contas com maiores saldos: ----");
        Conta maiorSaldo = Collections.max(contas, Comparator.comparing(Conta::getSaldo));
        System.out.println("-------" + maiorSaldo);

        contas.forEach(conta -> {
            if(conta.getSaldo() >= maiorSaldo.getSaldo()) {
                System.out.println(conta);
            }
        });


    }
}

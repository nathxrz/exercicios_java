package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocioController {
    public static void main(String[] args) {

//        ------------- B -------------
        ClientePessoaFisica clienteFisico1 = new ClientePessoaFisica("Leticia", "Pereira", "123.432.342-42", "leticia@gmail.com", 50, 459);
        ClientePessoaFisica clienteFisico2 = new ClientePessoaFisica("Bruno", "Gonçalves", "923.325.222-34", "bruno@gmail.com", 30, 350);

        ClientePessoaJuridica clienteJuridico1 = new ClientePessoaJuridica("Ana", "Fernandes", "23123123123", "ana@gmail.com", 50, 500);
        ClientePessoaJuridica clienteJuridico2 = new ClientePessoaJuridica("Ricardo", "Mendes", "5433424324", "Ricardo@gmail.com", 45, 200);

        Vendedor vendedor1 = new Vendedor("Paula", "Bueno", 4000, 5, 60, 300);
        Vendedor vendedor2 = new Vendedor("Gabriel", "Cardoso", 4900, 10, 55, 450);

        Gerente gerente1 = new Gerente("Felipe", "Fagundes", 8000.00, 20, 80, 500);
        Gerente gerente2 = new Gerente("Rafael", "Bartz", 9000.00, 15, 70, 500);

//        ------------- C -------------
        System.out.println("\nClientes:");
        System.out.print(clienteFisico1);
        System.out.print(clienteFisico2);
        System.out.print(clienteJuridico1);
        System.out.print(clienteJuridico2);

        System.out.println("\nFuncionários:");
        System.out.print(vendedor1);
        System.out.print(vendedor2);
        System.out.print(gerente1);
        System.out.print(gerente2);

//        ------------- D -------------
        List<Socio> socios = new ArrayList<>();
        socios.add(clienteFisico1);
        socios.add(clienteFisico2);
        socios.add(clienteJuridico1);
        socios.add(clienteJuridico2);
        socios.add(gerente1);
        socios.add(gerente2);
        socios.add(vendedor1);
        socios.add(vendedor2);

//        ------------- E -------------
        vendedor1.setSalario(3000.00);
        vendedor1.setTaxaDeComissao(5.0);
        vendedor2.setSalario(3000.0);
        vendedor2.setTaxaDeComissao(5.0);
        gerente1.setSalario(12000.0);
        gerente1.setTaxaDeBonificacao(2.0);
        gerente2.setSalario(12000.0);
        gerente2.setTaxaDeBonificacao(2.0);

//        ------------- F -------------
        double folhaSalarial = 0.0;
        for(Socio s: socios) {
            if( s instanceof Funcionario) {
                folhaSalarial += ((Funcionario) s).getSalario();
            }
        }
        System.out.println("\nFolha salarial: " + folhaSalarial);

//        ------------- G -------------
        double custoVendedor = 0.0;
        double custoGerente = 0.0;
        for(Socio s: socios) {
            if( s instanceof Vendedor) {
                custoVendedor += ((Vendedor) s).getSalario() + (500000.00 * (((Vendedor) s).getTaxaDeComissao())/100);
            }
            else if( s instanceof Gerente) {
            custoGerente += ((Gerente) s).getSalario() + (1000000.00 * (((Gerente) s).getTaxaDeBonificacao())/100);

            }
        }
        System.out.println("\nCusto dos vendedores: " + custoVendedor);
        System.out.println("Custo dos gerentes: " + custoGerente);

//        ------------- H -------------
        clienteFisico1.setQuantidadeDeAcoes(12);
        clienteFisico2.setQuantidadeDeAcoes(30);
        clienteJuridico1.setQuantidadeDeAcoes(22);
        clienteJuridico2.setQuantidadeDeAcoes(34);
        vendedor1.setQuantidadeDeAcoes(20);
        vendedor2.setQuantidadeDeAcoes(34);
        gerente1.setQuantidadeDeAcoes(10);
        gerente2.setQuantidadeDeAcoes(26);

        socios.sort(Comparator.comparing(Socio::getQuantidadeDeAcoes));
        System.out.println("\nOrdenação dos sócios em ordem crescente: \n" + socios);

//        ------------- I -------------
        socios.sort(Comparator.comparing(Socio::getNome));
        System.out.println("\nCliente me ordem crescente (nome):");
        socios.forEach(s -> {
            if(s instanceof Cliente) {
                System.out.print(s);
            }
        });

//        ------------- J -------------
        clienteFisico1.setValorDaAcao(10.0);
        clienteFisico2.setValorDaAcao(10.0);
        clienteJuridico1.setValorDaAcao(10.0);
        clienteJuridico2.setValorDaAcao(10.0);
        vendedor1.setValorDaAcao(10.0);
        vendedor2.setValorDaAcao(10.0);
        gerente1.setValorDaAcao(10.0);
        gerente2.setValorDaAcao(10.0);

        int totalAcoes = 0;
        for(Socio s: socios) {
            totalAcoes += s.getQuantidadeDeAcoes();
        }

        System.out.println("\nValor total das ações: " + totalAcoes);
        System.out.println("Valor de mercado: " + totalAcoes * 10.0);

//        ------------- K -------------
        Socio s_mais_quant_acoes = Collections.max(socios, Comparator.comparing(Socio::getQuantidadeDeAcoes));
        System.out.println("\nSocios com o maior número de ações:");
        socios.forEach(s -> {
        if(s.getQuantidadeDeAcoes() >= s_mais_quant_acoes.getQuantidadeDeAcoes()) {
            System.out.print(s);
        }
    });
    }
}

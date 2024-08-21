package controller;

import model.Empresa;
import model.Funcionario;

import java.time.LocalDate;
import java.util.Comparator;

public class EmpresaFuncionarioController {
    public static void main(String[] args) {
        //Instânciando objeto empresa
        Empresa empresa = new Empresa("Tech Solutions", "Tech Solutions LTDA", "12.345.678/0001-99");

        //Instânciando objetos funcionários
        Funcionario funcionario1 = new Funcionario(1L, "123.456.789-00", "Carlos", "Silva", LocalDate.of(1985, 5, 15));
        Funcionario funcionario2 = new Funcionario(2L, "987.654.321-00", "Ana", "Oliveira", LocalDate.of(1990, 8, 25));
        Funcionario funcionario3 = new Funcionario(3L, "321.654.987-00", "João", "Pereira", LocalDate.of(1982, 3, 10));
        Funcionario funcionario4 = new Funcionario(4L, "456.789.123-00", "Mariana", "Costa", LocalDate.of(1995, 12, 5));
        Funcionario funcionario5 = new Funcionario(5L, "789.123.456-00", "Fernando", "Almeida", LocalDate.of(1988, 7, 22));

        //add funcionários à empresa
        empresa.getFuncionarios().add(funcionario1);
        empresa.getFuncionarios().add(funcionario2);
        empresa.getFuncionarios().add(funcionario3);
        empresa.getFuncionarios().add(funcionario4);
        empresa.getFuncionarios().add(funcionario5);

        //ordenando a lista por ordem crescente referente ao nome do funcionário
        empresa.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println("\nInformações da empresa:");
        System.out.println(empresa);

    }
}

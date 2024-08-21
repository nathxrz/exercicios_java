package controller;

import model.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    public static void main(String[] args) {

//        Funcionario funcionario = new Funcionario(); não é possível criar instâncias

        Desenvolvedor d1 = new Desenvolvedor();
        Desenvolvedor d2 = new Desenvolvedor("Rafael", 1200);
        Gerente g1 = new Gerente();
        Gerente g2 = new Gerente("Paulo", 5000);

        System.out.println("\n---- Imprimindo os objetos toString() ----");
        System.out.print(d1.toString());
        System.out.print(d2.toString());
        System.out.print(g1.toString());
        System.out.print(g2.toString());

        d1.setNome("Ana");
        d1.setSalario(1000);
        d1.setSalario(-1000); //não vai permitir alterar para menor que 0.
        g1.setNome("Gabriela");
        g1.setSalario(5500);

        System.out.println("\n---- Imprimindo os objetos alterados ----");
        System.out.print(d1.toString());
        System.out.print(g1.toString());

        System.out.println("\n---- Imprimindo o bônus ----");
        System.out.println("O bônus do(a) desenvolvedor(a) " + d1.getNome() + " é de R$" + d1.getBonus());
        System.out.println("O bônus do(a) desenvolvedor(a) " + d2.getNome() + " é de R$" + d2.getBonus());
        System.out.println("O bônus do(a) desenvolvedor(a) " + g1.getNome() + " é de R$" + g1.getBonus());
        System.out.println("O bônus do(a) desenvolvedor(a) " + g2.getNome() + " é de R$" + g2.getBonus());

//      funcionarios para a coleção de objetos
        GerenteGeral gerente1 = new GerenteGeral("Carlos", 6.400);
        GerenteDesenvolvimento gerente2 = new GerenteDesenvolvimento("Renata", 4.500);

        DesenvolvedorSenior desenvolvedorSenior1 = new DesenvolvedorSenior("Ricardo", 3500);
        DesenvolvedorSenior desenvolvedorSenior2 = new DesenvolvedorSenior("Angela", 3500);
        DesenvolvedorSenior desenvolvedorSenior3 = new DesenvolvedorSenior("Pamela", 3500);
        DesenvolvedorSenior desenvolvedorSenior4 = new DesenvolvedorSenior("Carlos", 3500);
        DesenvolvedorSenior desenvolvedorSenior5 = new DesenvolvedorSenior("Gabriel", 3500);
        DesenvolvedorSenior desenvolvedorSenior6 = new DesenvolvedorSenior("Luiz", 3500);

        DesenvolvedorPleno desenvolvedorPleno1 = new DesenvolvedorPleno("Paloma", 2500);
        DesenvolvedorPleno desenvolvedorPleno2 = new DesenvolvedorPleno("Ronaldo", 2500);
        DesenvolvedorPleno desenvolvedorPleno3 = new DesenvolvedorPleno("Fernando", 2500);
        DesenvolvedorPleno desenvolvedorPleno4 = new DesenvolvedorPleno("Gabriela", 2500);
        DesenvolvedorPleno desenvolvedorPleno5 = new DesenvolvedorPleno("Carina", 2500);
        DesenvolvedorPleno desenvolvedorPleno6 = new DesenvolvedorPleno("Carol", 2500);

        DesenvolvedorJunior desenvolvedorJunior1 = new DesenvolvedorJunior("Julia", 1800);
        DesenvolvedorJunior desenvolvedorJunior2 = new DesenvolvedorJunior("Juliano", 1800);
        DesenvolvedorJunior desenvolvedorJunior3 = new DesenvolvedorJunior("Bruno", 1800);
        DesenvolvedorJunior desenvolvedorJunior4 = new DesenvolvedorJunior("Brenda", 1800);
        DesenvolvedorJunior desenvolvedorJunior5 = new DesenvolvedorJunior("Beatriz", 1800);
        DesenvolvedorJunior desenvolvedorJunior6 = new DesenvolvedorJunior("José", 1800);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(desenvolvedorSenior1);
        funcionarios.add(desenvolvedorSenior2);
        funcionarios.add(desenvolvedorSenior3);
        funcionarios.add(desenvolvedorSenior4);
        funcionarios.add(desenvolvedorSenior5);
        funcionarios.add(desenvolvedorSenior6);
        funcionarios.add(desenvolvedorPleno1);
        funcionarios.add(desenvolvedorPleno2);
        funcionarios.add(desenvolvedorPleno3);
        funcionarios.add(desenvolvedorPleno4);
        funcionarios.add(desenvolvedorPleno5);
        funcionarios.add(desenvolvedorPleno6);
        funcionarios.add(desenvolvedorJunior1);
        funcionarios.add(desenvolvedorJunior2);
        funcionarios.add(desenvolvedorJunior3);
        funcionarios.add(desenvolvedorJunior4);
        funcionarios.add(desenvolvedorJunior5);
        funcionarios.add(desenvolvedorJunior6);

        System.out.println("\n------Folha salarial COM bônus------");
        double totalBonus = 0.0;
        for(Funcionario f: funcionarios) {
            totalBonus += f.getSalario() + f.getBonus();
        }
        System.out.println(NumberFormat.getCurrencyInstance().format(totalBonus));

        System.out.println("\n------Folha salarial SEM bônus------");
        double total = 0.0;
        for(Funcionario f: funcionarios) {
            total += f.getSalario();
        }
        System.out.println(NumberFormat.getCurrencyInstance().format(total));

        System.out.println("\n------Salario e Bônus------");

        funcionarios.forEach(f -> {
            System.out.println(f.getNome() + " - Salario: " + NumberFormat.getCurrencyInstance().format(f.getSalario()) + " - Bonus: " + NumberFormat.getCurrencyInstance().format(f.getBonus()));
        });

        System.out.println("\n------Folha salarial com aumento de 5%------");
        double totalAumento = 0.0;
        for(Funcionario f: funcionarios) {
            f.setSalario(f.getSalario() + (f.getSalario() * 0.05));
            totalAumento += f.getSalario() + f.getBonus();
        }
        System.out.println(NumberFormat.getCurrencyInstance().format(totalAumento));
    }
}



//   ---------     RESPOSTAS     ---------
//   i) Foi possível criar instâncias da classe Funcionario? Justifique sua resposta.
//      Não foi possível criar objetos da classe Funcionaria, pois está é abstrata, sendo assim, não permite a criação de instâncias a partir dela.

//    ii) Onde você inseriu asregras de negócio solicitadas na questão “f”? Na classe Controller?
//       Foi inseridas nas classws de Gerente e Desenvolvedor, pois cada uma possuía sua peculiariedade. Apenas foi colocada na classe Funcionario como abstrata para
//        obrigar as subclasses a manterem a classe getBonus.
package controller;

import model.Aluno;

import java.util.*;

public class AlunoController {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno(3, 2332413, "Leticia", "Magalhães", "leticia@gmail.com");
        Aluno aluno4 = new Aluno(4, 43242312, "Bruna", "Vieira", "brunavieira@gmail");
        Aluno aluno5 = new Aluno(5, "Mateus", "Vergara");
        Aluno aluno6 = new Aluno(6, "Rafaela", "Medina");

        System.out.println("\n---- toString ----");
        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());
        System.out.println(aluno3.toString());
        System.out.println(aluno4.toString());
        System.out.println(aluno5.toString());
        System.out.println(aluno6.toString());

        aluno1.setId(1);
        aluno1.setCpf(342123);
        aluno1.setNome("Juliana");
        aluno1.setSobrenome("Cardoso");
        aluno1.setEmail("juliana@gmail.com");

        aluno2.setId(2);
        aluno2.setCpf(364345);
        aluno2.setNome("Rafael");
        aluno2.setSobrenome("Bueno");
        aluno2.setEmail("rafael@gmail.com");

        System.out.println("---- Aluno 1 ----");
        System.out.println(aluno1.getId());
        System.out.println(aluno1.getCpf());
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getSobrenome());
        System.out.println(aluno1.getEmail());

        System.out.println("---- Aluno 2 ----");
        System.out.println(aluno2.getId());
        System.out.println(aluno2.getCpf());
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getSobrenome());
        System.out.println(aluno2.getEmail());

        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        alunos.add(aluno6);

        Map<Integer, Aluno> mapAlunos = new HashMap<Integer, Aluno>();
        mapAlunos.put(aluno1.getId(), aluno1);
        mapAlunos.put(aluno2.getId(), aluno2);
        mapAlunos.put(aluno3.getId(), aluno3);
        mapAlunos.put(aluno4.getId(), aluno4);
        mapAlunos.put(aluno5.getId(), aluno5);
        mapAlunos.put(aluno6.getId(), aluno6);

        System.out.println("---- List ----");
        System.out.println(alunos);


        System.out.println("---- Map ----");
        System.out.println(mapAlunos);

        System.out.println("---- List id = 3----");
        Aluno alunoFind = alunos.stream().filter(aluno -> aluno.getId() ==5).findFirst().get();
        System.out.println(alunoFind);

        System.out.println("---- Map id = 3----");
        System.out.println(mapAlunos.get(5));

        System.out.println("---- List decrescente ----");
        alunos.sort(Comparator.comparing(Aluno::getId).reversed());

//        mapAlunos.sort(Comparator.comparing(mapAlunos::getId).reversed()); não permite reordenar


    }
}

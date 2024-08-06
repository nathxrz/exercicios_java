package controller;

import model.Aluno;
import model.Disciplina;

import java.util.Comparator;

public class AlunoDisciplinaController {
    public static void main(String[] args) {

        //instânciando objetos alunos
        Aluno aluno1 = new Aluno(1L, "Rafael", "Duarte");
        Aluno aluno2 = new Aluno(2L, "Elisa", "Vieira");

        //instânciando objetos disciplinas
        Disciplina disciplina1 = new Disciplina(1L, "Português");
        Disciplina disciplina2 = new Disciplina(2L, "Matemática");
        Disciplina disciplina3 = new Disciplina(3L, "Geografia");

        //add disciplinas aos alunos
        aluno1.getDisciplinas().add(disciplina1);
        aluno1.getDisciplinas().add(disciplina2);
        aluno2.getDisciplinas().add(disciplina1);
        aluno2.getDisciplinas().add(disciplina2);
        aluno2.getDisciplinas().add(disciplina3);

        //ordenando por ordem crescente referente ao nome das disciplinas
        aluno1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        aluno2.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));

        System.out.println("\nRelatório das disciplinas por aluno:");
        System.out.println(aluno1);
        System.out.println(aluno2);
    }
}

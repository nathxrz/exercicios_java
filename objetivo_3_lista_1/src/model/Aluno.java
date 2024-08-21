package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private Long matricula;
    private String nome;
    private String sobrenome;

    //agregando disciplina
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Aluno() {}

    public Aluno(Long matricula, String nome, String sobrenome) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

//    public Aluno(Long matricula, String nome, String sobrenome, List<Disciplina> disciplinas) {
//        this.matricula = matricula;
//        this.nome = nome;
//        this.sobrenome = sobrenome;
//        this.disciplinas = disciplinas;
//    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "\nInformações do aluno:" +
                "\n- Matrícula: " + matricula +
                "\n- Nome: " + nome + " " + sobrenome +
                "\n- Disciplinas: " + disciplinas;
    }
}

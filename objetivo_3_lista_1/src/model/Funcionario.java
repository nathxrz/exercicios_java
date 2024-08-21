package model;

import java.time.LocalDate;

public class Funcionario {
    private Long id;
    private String cpf;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    public Funcionario() {}

    public Funcionario(Long id, String cpf, String nome, String sobrenome, LocalDate dataNascimento) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "\n   - [" + id + "] " + nome + " " + sobrenome + " | " + cpf + " | " + dataNascimento;
    }
}

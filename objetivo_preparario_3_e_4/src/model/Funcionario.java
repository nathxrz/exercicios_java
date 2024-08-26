package model;

import java.math.BigDecimal;

public abstract class Funcionario {
    protected Long matricula;
    protected String nomeCompleto;
    protected String email;
    protected String telefone;
    protected BigDecimal salario;

    public Funcionario() {}

    public Funcionario(Long id, String nome, String email, String telefone, BigDecimal salario) {
        this.matricula = id;
        this.nomeCompleto = nome;
        this.email = email;
        this.telefone = telefone;
        this.salario = salario;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

//    @Override
//    public String toString() {
//        return "Funcionario{" +
//                "matricula=" + matricula +
//                ", nomeCompleto='" + nomeCompleto + '\'' +
//                ", email='" + email + '\'' +
//                ", telefone='" + telefone + '\'' +
//                ", salario=" + salario +
//                '}';
//    }
}

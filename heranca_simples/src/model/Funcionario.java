package model;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(){
    };

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void setSalario(double salario){
        double salarioAtual = salario;
        if(salarioAtual > 0){
            this.salario = salario;
        }
    }

    public double getSalario(){
        return salario;
    }

    public abstract double getBonus();

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
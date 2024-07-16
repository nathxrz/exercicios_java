package model;

public class Gerente extends Funcionario{

    public Gerente(){
        super();
    }

    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    public double getBonus(){
        return getSalario() * 0.2;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                ", Bonus=" + getBonus() +
                "\n";
    }
}

package model;

public class GerenteDesenvolvimento extends Funcionario{

    public GerenteDesenvolvimento(){
        super();
    }

    public GerenteDesenvolvimento(String nome, double salario){
        super(nome, salario);
    }

    public double getBonus(){
        return getSalario() * 0.2;
    }

    @Override
    public String toString() {
        return "Gerente de desenvolvimento{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                ", Bonus=" + getBonus() +
                "\n";
    }
}

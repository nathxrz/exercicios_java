package model;

public class DesenvolvedorSenior extends Funcionario{

    public DesenvolvedorSenior() {
        super();
    }

    public DesenvolvedorSenior(String nome, double salario) {
        super(nome, salario);
    }

    public double getBonus(){
        return getSalario() * 0.1;
    }

    @Override
    public String toString() {
        return "Desenvolvedor Señior{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                ", Bonus=" + getBonus() +
                "\n";
    }

}

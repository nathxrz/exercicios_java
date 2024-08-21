package model;

public class DesenvolvedorJunior extends Funcionario{

    public DesenvolvedorJunior() {
        super();
    }

    public DesenvolvedorJunior(String nome, double salario) {
        super(nome, salario);
    }

    public double getBonus(){
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor Júnior{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                ", Bonus=" + getBonus() +
                "\n";
    }

}

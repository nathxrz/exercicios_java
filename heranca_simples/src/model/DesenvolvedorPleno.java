package model;

public class DesenvolvedorPleno extends Funcionario{

    public DesenvolvedorPleno() {
        super();
    }

    public DesenvolvedorPleno(String nome, double salario) {
        super(nome, salario);
    }

    public double getBonus(){
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor Pleno{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                ", Bonus=" + getBonus() +
                "\n";
    }

}

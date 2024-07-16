package model;

public class GerenteGeral extends Funcionario{

        public GerenteGeral(){
            super();
        }

        public GerenteGeral(String nome, double salario){
            super(nome, salario);
        }

        public double getBonus(){
            return getSalario() * 0.4;
        }

        @Override
        public String toString() {
            return "Gerente Geral{" +
                    "nome='" + getNome() + '\'' +
                    ", salario=" + getSalario() +
                    ", Bonus=" + getBonus() +
                    "\n";
        }
    }

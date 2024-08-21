package model;

public class Gerente extends Funcionario implements Socio{
    private double taxaDeBonificacao;

    private int quantidadeDeAcoes;;
    private double valorDaAcao;

    public Gerente(){
        super();
    }

    public Gerente(String nome, String sobrenome, double salario, double taxaDeBonificacao, int quantidadeDeAcoes, double valorDaAcao){
        super(nome, sobrenome, salario);
        this.taxaDeBonificacao = taxaDeBonificacao;
        this.quantidadeDeAcoes = quantidadeDeAcoes;
        this.valorDaAcao = valorDaAcao;
    }

    public double getTaxaDeBonificacao() {
        return taxaDeBonificacao;
    }

    public void setTaxaDeBonificacao(double taxaDeBonificacao) {
        this.taxaDeBonificacao = taxaDeBonificacao;
    }

    @Override
    public int getQuantidadeDeAcoes() {
        return quantidadeDeAcoes;
    }

    public void setQuantidadeDeAcoes(int quantidadeDeAcoes) {
        this.quantidadeDeAcoes = quantidadeDeAcoes;
    }

    @Override
    public double getValorDaAcao() {
        return valorDaAcao;
    }

    public void setValorDaAcao(double valorDaAcao) {
        this.valorDaAcao = valorDaAcao;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "taxaDeBonificacao=" + taxaDeBonificacao +
                ", quantidadeDeAcoes=" + quantidadeDeAcoes +
                ", valorDaAcao=" + valorDaAcao +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", salario=" + salario +
                "}\n";
    }
}

package model;

public class Vendedor extends Funcionario implements Socio{
    private double taxaDeComissao;

    private int quantidadeDeAcoes;;
    private double valorDaAcao;

    public Vendedor(){
        super();
    }

    public Vendedor(String nome, String sobrenome, double salario, double taxaDeComissao, int quantidadeDeAcoes, double valorDaAcao) {
        super(nome, sobrenome, salario);
        this.taxaDeComissao = taxaDeComissao;
        this.quantidadeDeAcoes = quantidadeDeAcoes;
        this.valorDaAcao = valorDaAcao;
    }

    public double getTaxaDeComissao() {
        return taxaDeComissao;
    }

    public void setTaxaDeComissao(double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
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
        return "Vendedor{" +
                "taxaDeComissao=" + taxaDeComissao +
                ", quantidadeDeAcoes=" + quantidadeDeAcoes +
                ", valorDaAcao=" + valorDaAcao +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", salario=" + salario +
                "}\n";
    }
}

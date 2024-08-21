package model;

public class ClientePessoaJuridica extends Cliente implements Socio{
    private String cnpj;

    private int quantidadeDeAcoes;;
    private double valorDaAcao;

    public ClientePessoaJuridica() {
        super();
    }

    public ClientePessoaJuridica(String nome, String sobrenome, String cnpj, String email, int quantidadeDeAcoes, double valorDaAcao) {
        super(nome, sobrenome, email);
        this.cnpj = cnpj;
        this.quantidadeDeAcoes = quantidadeDeAcoes;
        this.valorDaAcao = valorDaAcao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
        return "ClientePessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", quantidadeDeAcoes=" + quantidadeDeAcoes +
                ", valorDaAcao=" + valorDaAcao +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                "}\n";
    }
}

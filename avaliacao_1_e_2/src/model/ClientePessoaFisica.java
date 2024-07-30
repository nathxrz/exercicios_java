package model;

public class ClientePessoaFisica extends Cliente implements Socio{
    private String cpf;

    private int quantidadeDeAcoes;
    private double valorDaAcao;

    public ClientePessoaFisica(){
        super();
    }

    public ClientePessoaFisica(String nome, String sobrenome, String cpf, String email, int quantidadeDeAcoes, double valorDaAcao){
        super(nome, sobrenome, email);
        this.cpf = cpf;
        this.quantidadeDeAcoes = quantidadeDeAcoes;
        this.valorDaAcao = valorDaAcao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
        return "Cliente pessoa física{" +
                "cpf='" + cpf + '\'' +
                ", quantidadeDeAcoes=" + quantidadeDeAcoes +
                ", valorDaAcao=" + valorDaAcao +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                "}\n";
    }
}

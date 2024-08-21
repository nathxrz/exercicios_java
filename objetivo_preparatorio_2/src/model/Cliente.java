package model;

public class Cliente implements Associado{
    private String nome;

    private int qdeCotas;
    private double valorCota;

    public Cliente(){
        super();
    }

    public Cliente(String nome){
        this.nome = nome;
    }

    public Cliente(String nome, int qdeCotas, double valorCota){
        this.nome = nome;
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQdeCotas() {
        return qdeCotas;
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        this.valorCota = valorCota;
    }

    public double lucros(int qdeCotas, double valorCota){
        return qdeCotas*valorCota;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", qdeCotas=" + qdeCotas +
                ", valorCota=" + valorCota +
                "}\n";
    }
}

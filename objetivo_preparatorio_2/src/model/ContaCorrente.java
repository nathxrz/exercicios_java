package model;

public class ContaCorrente extends Conta implements Associado{

    private int qdeCotas;
    private double valorCota;

    public ContaCorrente(){
        super();
    }

    public ContaCorrente(double saldo){
        super(saldo);
    }

    public ContaCorrente(double saldo, int qdeCotas, double valorCota){
        super(saldo);
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
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
        return "ContaCorrente{" +
                "saldo=" + saldo +
                ", qdeCotas=" + qdeCotas +
                ", valorCota=" + valorCota +
                "}\n";
    }
}

package model;

public abstract class Conta {
    protected double saldo;

    public Conta(){

    }

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor){
//        this.saldo += valor;
        this.saldo = this.saldo + valor;
    }

    public void saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void atualiza(double taxa){
        if(taxa > 0){
            this.saldo += saldo * (taxa/100);
        }else{
            System.out.println("A taxa não pode ser zero.");
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                "}\n";
    }
}

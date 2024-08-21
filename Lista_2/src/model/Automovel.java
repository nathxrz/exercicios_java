package model;

public class Automovel {

    private int id;
    private String renavan;
    private String placa;
    private String cor;
    private int num_rodas;
    private String combustivel;
    private int quilometragem;
    private String chassi;
    private double valor_locacao;

    public Automovel(){
    }
    public Automovel(int id, String renavan, String placa, String cor, int num_rodas, String combustivel, int quilometragem, String chassi, double valor_locacao){
        this.id = id;
        this.renavan = renavan;
        this.placa = placa;
        this.cor = cor;
        this.num_rodas = num_rodas;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.chassi = chassi;
        this.valor_locacao = valor_locacao;
    }

    public Automovel(int id, String placa, String cor){
        this.id = id;
        this.placa = placa;
        this.cor = cor;
    }

    public int getId(){
        return id;
    }

    public String getRenavan(){
        return renavan;
    }

    public String getPlaca(){
        return placa;
    }

    public String getCor(){
        return cor;
    }

    public int getNum_rodas(){
        return num_rodas;
    }

    public String getCombustivel(){ return combustivel; }

    public int getQuilometragem(){ return quilometragem; }

    public String getChassi(){ return chassi; }

    public double getValor_locacao(){ return valor_locacao; }

    public void setId(int id){
        this.id = id;
    }

    public void setRenavan(String renavan){
        this.renavan = renavan;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setNum_rodas(int num_rodas) {
        this.num_rodas = num_rodas;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setValor_locacao(double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    public String toString() {
        return "Automovel{" +
                "id=" + id +
                ", renavan='" + renavan + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", num_rodas=" + num_rodas +
                ", combustivel='" + combustivel + '\'' +
                ", quilometragem=" + quilometragem +
                ", chassi='" + chassi + '\'' +
                ", valor_locacao=" + valor_locacao +
                "}\n";
    }
}
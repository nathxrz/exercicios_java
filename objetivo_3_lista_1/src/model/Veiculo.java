package model;

public class Veiculo {
    private String placa;
    private String renavam;
    private String fabricante;
    private String modelo;
    private Integer anoFabricacao;

    //ligando Veículo x Motorista
    private Motorista motorista;

    public Veiculo() {
    }

    public Veiculo(String placa, String renavam, String fabricante, String modelo, Integer anoFabricacao, Motorista motorista) {
        this.placa = placa;
        this.renavam = renavam;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.motorista = motorista;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "\nVeiculo{" +
                "placa='" + placa + '\'' +
                ", renavam='" + renavam + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", motorista=" + motorista +
                '}';
    }
}

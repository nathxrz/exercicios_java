package model;

import java.time.LocalDateTime;

public class Locacao {
    private int id;
    private LocalDateTime dataLocacao;
    private LocalDateTime horaLocacao;
    private LocalDateTime dataDevolucao;
    private LocalDateTime horaDevolucao;
    private int quilometragem;
    private double valorCalcao;
    private double valorLocacao;
    private boolean devolvido;

    public Locacao(){}

    public Locacao(int id, LocalDateTime dataLocacao, LocalDateTime horaLocacao, LocalDateTime dataDevolucao, LocalDateTime horaDevolucao, int quilometragem, double valorCalcao, double valorLocacao, boolean devolvido){
        this.id = id;
        this.dataLocacao = dataLocacao;
        this.horaLocacao = horaLocacao;
        this.dataDevolucao = dataDevolucao;
        this.horaDevolucao = horaDevolucao;
        this.quilometragem = quilometragem;
        this.valorCalcao = valorCalcao;
        this.valorLocacao = valorLocacao;
        this.devolvido = devolvido;
    }

    public Locacao(int id, LocalDateTime dataLocacao, LocalDateTime dataDevolucao, int quilometragem, boolean devolvido){
        this.id = id;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.quilometragem = quilometragem;
        this.devolvido = devolvido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDateTime dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDateTime getHoraLocacao() {
        return horaLocacao;
    }

    public void setHoraLocacao(LocalDateTime horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDateTime getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(LocalDateTime horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getValorCalcao() {
        return valorCalcao;
    }

    public void setValorCalcao(double valorCalcao) {
        this.valorCalcao = valorCalcao;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public boolean getDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public String toString() {
        return "Locacao{" +
                "id=" + id +
                ", dataLocacao=" + dataLocacao +
                ", horaLocacao=" + horaLocacao +
                ", dataDevolucao=" + dataDevolucao +
                ", horaDevolucao=" + horaDevolucao +
                ", quilometragem=" + quilometragem +
                ", valorCalcao=" + valorCalcao +
                ", valorLocacao=" + valorLocacao +
                ", devolvido=" + devolvido +
                "}\n";
    }
}


package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Corrida{
    private BigDecimal valor;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    //enum
    private FormaDePagamento formaDePagamento;
    private Situacao situacao;

    //ligação entre Corrida x Usuario
    private Usuario usuario;

    //ligação entre Corrida x Motorista
    private Motorista motorista;

    public Corrida() {
    }

    public Corrida(BigDecimal valor, LocalDate dataInicio, LocalDate dataFim, FormaDePagamento formaDePagamento, Situacao situacao, Usuario usuario, Motorista motorista) {
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.formaDePagamento = formaDePagamento;
        this.situacao = situacao;
        this.usuario = usuario;
        this.motorista = motorista;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "valor=" + valor +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", formaDePagamento=" + formaDePagamento +
                ", situacao=" + situacao +
                ", usuario=" + usuario +
                ", motorista=" + motorista +
                "}\n";
    }
}

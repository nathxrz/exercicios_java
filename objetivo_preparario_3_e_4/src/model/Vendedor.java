package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Funcionario{
    private double taxaDeComissao;
    private Regiao regiao;

    //ligando Vendedor com Pedido
    private List<Pedido> pedidos = new ArrayList<>();

    public Vendedor() {
        super();
    }

    public Vendedor(Long id, String nome, String email, String telefone, BigDecimal salario, double taxaDeComissao, Regiao regiao) {
        super(id, nome, email, telefone, salario);
        this.taxaDeComissao = taxaDeComissao;
        this.regiao = regiao;
    }

    public Vendedor(Long id, String nome, String email, String telefone, BigDecimal salario, double taxaDeComissao, Regiao regiao, List<Pedido> pedidos) {
        super(id, nome, email, telefone, salario);
        this.taxaDeComissao = taxaDeComissao;
        this.regiao = regiao;
        this.pedidos = pedidos;
    }

    public double getTaxaDeComissao() {
        return taxaDeComissao;
    }

    public void setTaxaDeComissao(double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "\nVendedor{" +
                "taxaDeComissao=" + taxaDeComissao +
                ", regiao=" + regiao +
                ", matricula=" + matricula +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", salario=" + salario +
//                ", pedidos=" + pedidos +
                '}';
    }
}

package model;

import java.util.List;

public class ClientePessoaFisica extends Cliente{
    private String cpf;

    public ClientePessoaFisica() {
    }

    public ClientePessoaFisica(String nomeCompleto, String email, String telefone, List<Endereco> enderecos, String cpf) {
        super(nomeCompleto, email, telefone, enderecos);
        this.cpf = cpf;
    }

    public ClientePessoaFisica(String nomeCompleto, String email, String telefone, List<Endereco> enderecos, List<Pedido> pedidos, String cpf) {
        super(nomeCompleto, email, telefone, enderecos, pedidos);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\nClientePessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", enderecos=" + enderecos +
//                ", pedidos=" + pedidos +
                '}';
    }
}

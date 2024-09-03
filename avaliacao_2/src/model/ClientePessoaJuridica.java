package model;

import java.util.List;

public class ClientePessoaJuridica extends Cliente{
    private String cnpj;

    public ClientePessoaJuridica() {
    }

    public ClientePessoaJuridica(String nomeCompleto, String email, String telefone, List<Endereco> enderecos, String cnpj) {
        super(nomeCompleto, email, telefone, enderecos);
        this.cnpj = cnpj;
    }

    public ClientePessoaJuridica(String nomeCompleto, String email, String telefone, List<Endereco> enderecos, List<Pedido> pedidos, String cnpj) {
        super(nomeCompleto, email, telefone, enderecos, pedidos);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cpf) {
        this.cnpj = cpf;
    }

    @Override
    public String toString() {
        return "\nClientePessoaJuridica" +
                "cpf='" + cnpj + '\'' +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", enderecos=" + enderecos +
//                ", pedidos=" + pedidos +
                '}';
    }
}

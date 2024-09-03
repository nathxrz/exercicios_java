package model;

import java.util.List;

public class EnderecoDeEntrega extends Endereco{
    public EnderecoDeEntrega() {
        super();
    }

    public EnderecoDeEntrega(String bairro, String tipoDeLogradouro, String logradouro, String numero, String cep) {
        super(bairro, tipoDeLogradouro, logradouro, numero, cep);
    }

    public EnderecoDeEntrega(String tipoDeLogradouro, String logradouro, String numero, String bairro, String cep, List<Cliente> clientes) {
        super(tipoDeLogradouro, logradouro, numero, bairro, cep, clientes);
    }


    @Override
    public String toString() {
        return "\nEndereco de entrega{" +
                "tipoDeLogradouro='" + getTipoDeLogradouro() + '\'' +
                ", logradouro='" + getLogradouro() + '\'' +
                ", numero='" + getNumero() + '\'' +
                ", bairro='" + getBairro() + '\'' +
                ", cep='" + getCep() + '\'' +
//                ", clientes=" + getClientes() +
                '}';
    }
}

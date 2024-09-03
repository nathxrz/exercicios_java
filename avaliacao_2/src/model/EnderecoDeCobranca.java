package model;

import java.util.List;

public class EnderecoDeCobranca  extends Endereco{
    public EnderecoDeCobranca() {
        super();
    }

    public EnderecoDeCobranca(String bairro, String tipoDeLogradouro, String logradouro, String numero, String cep) {
        super(bairro, tipoDeLogradouro, logradouro, numero, cep);
    }

    public EnderecoDeCobranca(String tipoDeLogradouro, String logradouro, String numero, String bairro, String cep, List<Cliente> clientes) {
        super(tipoDeLogradouro, logradouro, numero, bairro, cep, clientes);
    }


    @Override
    public String toString() {
        return "\nEndereco de cobranca{" +
                "tipoDeLogradouro='" + getTipoDeLogradouro() + '\'' +
                ", logradouro='" + getLogradouro() + '\'' +
                ", numero='" + getNumero() + '\'' +
                ", bairro='" + getBairro() + '\'' +
                ", cep='" + getCep() + '\'' +
//                ", clientes=" + getClientes() +
                '}';
    }
}

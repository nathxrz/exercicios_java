package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;

    //compondo Funcionario
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Empresa() {
    }

    public Empresa(String nomeFantasia, String razaoSocial, String cnpj) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

//    public Empresa(String nomeFantasia, String razaoSocial, String cnpj, List<Funcionario> funcionarios) {
//        this.nomeFantasia = nomeFantasia;
//        this.razaoSocial = razaoSocial;
//        this.cnpj = cnpj;
//        this.funcionarios = funcionarios;
//    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "- CNPJ: " + cnpj +
                "\n- Nome: '" + nomeFantasia + "'" +
                "\n- Razão Social: '" + razaoSocial + "'" +
                "\n- Funcionários: " + funcionarios +
                '}';
    }
}

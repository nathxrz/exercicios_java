package model;

import java.util.ArrayList;
import java.util.List;

public class Motorista {
    private String nome;
    private String email;
    private String telefone;

    //ligando Motorista x Veículo
    private Veiculo veiculo;

    //ligando Motorista x Corrida
    private List<Corrida> corridas = new ArrayList<Corrida>();

    public Motorista() {
    }

    public Motorista(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Corrida> getCorridas() {
        return corridas;
    }

    public void setCorridas(List<Corrida> corridas) {
        this.corridas = corridas;
    }

    @Override
    public String toString() {
        return "\nMotorista{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", veiculo=" + veiculo +
                ", corridas=" + corridas +
                '}';
    }
}

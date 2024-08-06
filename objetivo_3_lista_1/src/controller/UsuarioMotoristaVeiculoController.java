package controller;

import model.Corrida;
import model.Usuario;
import model.Motorista;
import model.Veiculo;
import model.FormaDePagamento;
import model.Situacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class UsuarioMotoristaVeiculoController {
    public static void main(String[] args) {

        //instânciando objeto usuário
        Usuario usuario1 = new Usuario("Leticia", "leticia@email.com", "(53) 983212322");

        //instânciando objeto motorista
        Motorista motorista1 = new Motorista("João Souza", "joao.souza@example.com", "(11) 91234-5678");

        //instânciando objeto veículo
        Veiculo v = new Veiculo("DSW1234", "T7WER8F", "Fiat", "Pulse", 2023, motorista1);

        //instânciando objetos corridas
        Corrida corrida1 = new Corrida(new BigDecimal("50.75"), LocalDate.of(2024, 8, 1), LocalDate.of(2024, 8, 1), FormaDePagamento.cartaoCredito, Situacao.faturada, usuario1, motorista1);

        Corrida corrida2 = new Corrida(new BigDecimal("120.00"), LocalDate.of(2024, 8, 3), LocalDate.of(2024, 8, 3), FormaDePagamento.pix, Situacao.em_andamento, usuario1, motorista1);

//        usuario1.getCorridas().add(corrida1);
//        usuario1.getCorridas().add(corrida2);
        motorista1.getCorridas().add(corrida1);
//        motorista1.getCorridas().add(corrida2);

        System.out.println("Corridas de cada usuário:");
        System.out.println(motorista1);

    }
}

package controller;

import model.Corrida;
import model.Usuario;
import model.Motorista;
import model.Veiculo;
import model.FormaDePagamento;
import model.Situacao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UsuarioMotoristaVeiculoController {
    public static void main(String[] args) {

        //instânciando objeto usuário
        Usuario usuario1 = new Usuario("Leticia Lima", "leticia@email.com", "(53) 983212322");
        Usuario usuario2 = new Usuario("Rafaela Teixeira", "rafaela@email.com", "(53) 743435312");

        //instânciando objeto motorista
        Motorista motorista1 = new Motorista("João Souza", "joao.souza@example.com", "(11) 91234-5678");

        //instânciando objeto veículo
        Veiculo v = new Veiculo("DSW1234", "T7WER8F", "Fiat", "Pulse", 2023, motorista1);

        //instânciando objetos corridas
        Corrida corrida1 = new Corrida(new BigDecimal("50.75"), LocalDate.of(2024, 8, 1), LocalDate.of(2024, 8, 1), FormaDePagamento.cartaoCredito, Situacao.faturada, usuario1, motorista1);
        Corrida corrida2 = new Corrida(new BigDecimal("120.00"), LocalDate.of(2024, 8, 3), LocalDate.of(2024, 8, 3), FormaDePagamento.pix, Situacao.em_andamento, usuario1, motorista1);

        Corrida corrida3 = new Corrida(new BigDecimal("60.00"), LocalDate.of(2024, 8, 2), LocalDate.of(2024, 8, 3), FormaDePagamento.pix, Situacao.em_andamento, usuario2, motorista1);

        List<Corrida> corridas = new ArrayList<>();
        corridas.add(corrida1);
        corridas.add(corrida2);
        corridas.add(corrida3);

        //ordenando corridas por valor
        corridas.sort(Comparator.comparing(Corrida::getValor).reversed());

        //mostrando as corridas de cada usuário:
        System.out.print("\nCorridas do(a) usuário(a) " + usuario1.getNome() + ": \n");
        for (Corrida corrida : corridas) {
            if(corrida.getUsuario().equals(usuario1)){
                System.out.println("- " + corrida);
            }
        }

        System.out.print("\nCorridas do(a) usuário(a) " + usuario2.getNome() + ": \n");
        for (Corrida corrida : corridas) {
            if(corrida.getUsuario().equals(usuario2)){
                System.out.println("- " + corrida);
            }
        }

        //ordenando corridas por data de início
        corridas.sort(Comparator.comparing(Corrida::getDataInicio));

        //mostrando as corridas de cada motorista:
        System.out.print("\nCorridas do(a) motorista(a) " + motorista1.getNome() + ": \n");
        for (Corrida corrida : corridas) {
            if(corrida.getMotorista().equals(motorista1)){
                System.out.println("- " + corrida);
            }
        }

        //calculando o valor total das corridas por motorista
        BigDecimal valorTotalMotorista1 = BigDecimal.ZERO;
        for (Corrida corrida : corridas) {
            if(corrida.getMotorista().equals(motorista1)){
                valorTotalMotorista1 = valorTotalMotorista1.add(corrida.getValor());
            }
        }

        //impriminto o total de corrida de cada motorista
        System.out.println("Motorista: " + motorista1.getNome() + "\nValor total: " + valorTotalMotorista1);
    }
}

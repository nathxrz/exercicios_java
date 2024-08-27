package controller;

import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

import java.math.BigDecimal;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

public class comprasController {
    public static void main(String[] args) {

//      ----------------- A -----------------
//      Dado o Instant 1723066578101, em UTC-0, faça o programa imprimir a data e a hora no formato dd/MM/yyyy HH:mm referente a este instante em UTC-0;
        Instant dateTime = Instant.ofEpochMilli(1723066578101L);
        LocalDateTime date = LocalDateTime.ofInstant(dateTime, ZoneId.of("UTC-0"));
        System.out.println("\nInstant: " + dateTime);
        System.out.println("Data e Hora UTC-0: " + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(date));

//      ----------------- B -----------------
//      Dado o mesmo Instant do item “a” faça o programa imprimir a data e a hora no formato dd/MM/yyyy HH:mm referente a este instante em UTC-3, e UTC+1;

        System.out.println("\nData e Hora UTC-3: " + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(LocalDateTime.ofInstant(dateTime, ZoneId.of("UTC-3"))));
        System.out.println("Data e Hora UTC+1: " + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(LocalDateTime.ofInstant(dateTime, ZoneId.of("UTC+1"))));

//      ----------------- C -----------------
//      Dado o mesmo Instant do item “a” faça o programa imprimir a data e a hora no formato dd/MM/yyyy HH:mm referente a este instante em “America/Sao_Paulo”, e “Europe/Paris”.

        System.out.println("\nData e Hora America/Sao_Paulo: " + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(LocalDateTime.ofInstant(dateTime, ZoneId.of("America/Sao_Paulo"))));
        System.out.println("Data e Hora Europe/Paris: " + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(LocalDateTime.ofInstant(dateTime, ZoneId.of("Europe/Paris"))));

//      Agora responda (como comentário no código): Existe diferença entre o horário UTC-3 e “America/Sao_Paulo”? E UTC+1 e “Europe/Paris”? Justifique suas respostas.
//      No momento não possui diferença, mas com o horário de verão, America/Sao_paulo será UTC-2 e Europe/Paris será UTC+2, sendo assim, serão diferentes em algum momento do ano.

//      ----------------- D -----------------
//      Dada a String “07/08/2024” faça o programa criar uma instância para armazenar esta data, depois, imprima o resultado no formato dd/MM/yyyy;

        LocalDate dataString1 = LocalDate.parse("07/08/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("\nData: " + dataString1);

        LocalDate dataString = LocalDate.parse("07/08/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("\nData: " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataString));

//      ----------------- E -----------------
//      Dada a String 14:05 faça o programa criar uma instância para armazenar esta hora, depois, imprima o resultado no formato HH:mm;

        LocalTime timeString = LocalTime.parse("14:05", DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println("\nTime: " + timeString);

//      ----------------- F -----------------
//      Data a data 07/09/1822 faça o programa calcular quantos Anos, Meses, e dias se passaram até o dia de hoje. Imprima o resultado;

        LocalDate old_date = LocalDate.of(1822, 9, 7);
        LocalDate now_date = LocalDate.now();
        Period period = Period.between(old_date, now_date);
        System.out.println("\nPeríodo: " + period);
        System.out.println("Período: " + period.getYears() + " anos, " + period.getMonths() + " meses, e " + period.getDays() + " dias.");

//      ----------------- G -----------------
//      Dado o timestamp 2024-08-07T21:50:41Z de início de execução de um algoritmo e o timestamp 2024-08-07T21:50:44Z de fim de execução do mesmo algoritmo, faça o programa calcular o tempo que o algoritmo levou em execução (resultado = 3s);

        Instant inicio = Instant.parse("2024-08-07T21:50:41Z");
        Instant fim = Instant.parse("2024-08-07T21:50:44Z");
        Duration duration = Duration.between(inicio, fim);
        System.out.println("\nDuration: " + duration);
        System.out.println("\nSegundos: " + duration.getSeconds());

//        ----------------- H -----------------
//      O front-end de uma aplicação enviou a seguinte data e hora para ser armazena no back-end “12/06/2014 17:00” (uma String). Com base nesse dado, faça o programa armazena esta data e hora e imprima o resultado no formato dd/MM/yyyy HH:mm;
        String dateStringFront = new String("12/06/2014 17:00");
        LocalDateTime dateFront = LocalDateTime.parse(dateStringFront, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println("Data formatada: " + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(dateFront));

        Fornecedor fornecedor = new Fornecedor(3213L, "Papelaria", "Papel", "papelaria@email.com", "(21) 123456789");
        Produto produto = new Produto(UUID.randomUUID().toString(), "Caderno", "10 matérias", 0, BigDecimal.valueOf(10), BigDecimal.valueOf(20), List.of(fornecedor));

        Fornecimento fornecimento = new Fornecimento(LocalDate.now(), 100, BigDecimal.valueOf(100).multiply(produto.getPrecoDeCusto()), )




    }
}

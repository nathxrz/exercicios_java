package controller;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class questao2Controller {
    public static void main(String[] args) {
        Instant instant = Instant.ofEpochMilli(1723987846070L);
        System.out.println("\nInstant: " + instant);
        System.out.println("\nData e Hora America/Montevideo: " + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(LocalDateTime.ofInstant(instant, ZoneId.of("America/Montevideo"))));
        System.out.println("Data e Hora America/Chicago: " + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(LocalDateTime.ofInstant(instant, ZoneId.of("America/Chicago"))));
    }
}

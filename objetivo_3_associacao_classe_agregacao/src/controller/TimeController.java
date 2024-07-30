package controller;

import model.Atleta;
import model.Time;

import java.util.ArrayList;
import java.util.List;

public class TimeController {
    public static void main(String[] args) {

        //criando atletas
        Atleta atleta1= new Atleta(1L, "123.456.123-11", "Pedro", "Silva", "10/02/1999");
        Atleta atleta2= new Atleta(2L, "123.456.123-11", "Rafael", "Leal", "17/05/1998");
        Atleta atleta3= new Atleta(3L, "123.456.123-11", "Bruno", "Costa", "25/12/1997");

        //add em um array de ocntroller
        List<Atleta> atletas = new ArrayList<>();
        atletas.add(atleta1);
        atletas.add(atleta2);
        atletas.add(atleta3);

        //criando time
        Time time1 = new Time(1L, "Internacional", "RS", atletas);

        //imprimindo dados do time
        System.out.println("\nTime: " + time1);

        atletas.remove(atleta3);
        System.out.println("\nTime com desfalque: " + time1);

    }
}

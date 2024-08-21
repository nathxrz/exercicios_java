package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AutomovelController {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta(2, "Manual", "Caloi", "Elite", 2023, 26, "BC123456");
        Carro carro = new Carro("123456789", "9BWZZZ377VT004251", "ABC-1234", 2, "Gasolina", "Toyota", "Corolla", 2021, 470);
        Caminhao caminhao = new Caminhao("987654321", "1HTMKADN43H561298", "XYZ-9876", 3, "Diesel", "Volvo", "FH16", 2022, 20000);

        System.out.println("\n---- Imprimindo o objeto bicicleta");
        System.out.println(bicicleta.toString());

        System.out.println("\n---- Imprimindo o objeto carro");
        System.out.println(carro.toString());

        System.out.println("\n---- Imprimindo o objeto caminhão");
        System.out.println(caminhao.toString());

        // list de veiculos
        Bicicleta bicicleta1 = new Bicicleta(1, "Humana", "Caloi", "Elite Carbon", 2020, 29, "BIC001");
        Bicicleta bicicleta2 = new Bicicleta(1, "Humana", "Specialized", "Epic", 2021, 29, "BIC002");
        Bicicleta bicicleta3 = new Bicicleta(1, "Humana", "Trek", "Supercaliber", 2019, 29, "BIC003");
        Bicicleta bicicleta4 = new Bicicleta(1, "Humana", "iannondale", "Scalpel", 2020, 29, "BIC004");
        Bicicleta bicicleta5 = new Bicicleta(1, "Humana", "Scott", "Spark", 2021, 29, "BIC005");

        // Adicionando carros
        Carro carro1 = new Carro("123456789", "9BWZZZ377VT004251", "ABC-1234", 2, "Gasolina", "Toyota", "Corolla", 2021, 470);
        Carro carro2 = new Carro("987654321", "8AWZZZ377VT004252", "DEF-5678", 2, "Diesel", "Ford", "Focus", 2019, 430);
        Carro carro3 = new Carro("456789123", "7CWZZZ377VT004253", "GHI-9101", 2, "Gasolina", "Honda", "Civic", 2020, 450);
        Carro carro4 = new Carro("321654987", "6DWZZZ377VT004254", "iKL-1121", 2, "Flex", "Chevrolet", "Cruze", 2022, 460);
        Carro carro5 = new Carro("654987321", "5EWZZZ377VT004255", "INO-3141", 2, "Elétrico", "Tesla", "Model 3", 2023, 500);

        // Adicionando caminhões

        Caminhao caminhao1 = new Caminhao("112233445", "4FWZZZ377VT004256", "IQR-5161", 4, "Diesel", "Volvo", "FH", 2020, 10000);
            Caminhao caminhao2 = new Caminhao("223344556", "3GWZZZ377VT004257", "iTU-7181", 4, "Diesel", "Scania", "R450", 2018, 12000);
        Caminhao caminhao3 = new Caminhao("334455667", "2HWZZZ377VT004258", "VWX-9201", 4, "Diesel", "Mercedes-Benz", "Actros", 2021, 15000);
        Caminhao caminhao4 = new Caminhao("445566778", "1IWZZZ377VT004259", "YZA-1221", 4, "Diesel", "MAN", "TGX", 2019, 14000);
        Caminhao caminhao5 = new Caminhao("556677889", "0JWZZZ377VT004260", "BCD-3241", 4, "Diesel", "Iveco", "Stralis", 2022, 13000);

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(bicicleta1);
        veiculos.add(bicicleta2);
        veiculos.add(bicicleta3);
        veiculos.add(bicicleta4);
        veiculos.add(bicicleta5);
        veiculos.add(carro1);
        veiculos.add(carro2);
        veiculos.add(carro3);
        veiculos.add(carro4);
        veiculos.add(carro5);
        veiculos.add(caminhao1);
        veiculos.add(caminhao2);
        veiculos.add(caminhao3);
        veiculos.add(caminhao4);
        veiculos.add(caminhao5);

        veiculos.sort(Comparator.comparing(Veiculo::getAnoFabricacao).reversed());
        System.out.println("Lista de todos os veículos: " + veiculos);

        System.out.println("Lista dos automóveis: ");
        veiculos.forEach(v -> {
            if(v instanceof Automovel) {
                System.out.println(v);
            }
        });

        System.out.println("Lista de bicicletas: ");
        veiculos.forEach(v -> {
            if(v instanceof Bicicleta) {
                System.out.println(v);
            }
        });

        veiculos.sort(Comparator.comparing(Veiculo::getAnoFabricacao));
        System.out.println("Lista dos automóveis com placa I/i: ");
        veiculos.forEach(v -> {
            if(v instanceof Automovel) {
                if( ((Automovel) v).getPlaca().startsWith("I") || ((Automovel) v).getPlaca().startsWith("i") ) {
                    System.out.print(v);
                }
            }
        });
    }
}

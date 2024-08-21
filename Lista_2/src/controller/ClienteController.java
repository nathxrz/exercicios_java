package controller;

import model.Cliente;

import java.util.*;

public class ClienteController {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "123213", "Nathalia", "Machado", "Centro", "943242", "9912323", "nathalia@gmail.com");
        Cliente cliente2 = new Cliente(2, "88484884", "Regina", "Falcão", "Porto", "233432323", "999323231", "reginafalcao@gmail.com");
        Cliente cliente3 = new Cliente(3, "3232332", "Leonardo", "Barroso");
        Cliente cliente4 = new Cliente(4, "4323432", "Mirian", "Raimundo");
        Cliente cliente5 = new Cliente();
        Cliente cliente6 = new Cliente(6, "5545233", "Maria", "Gill");
        Cliente cliente7 = new Cliente();

        System.out.println("----- toString -----");
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(cliente3.toString());
        System.out.println(cliente4.toString());
        System.out.println(cliente5.toString());
        System.out.println(cliente6.toString());
        System.out.println(cliente7.toString());

        cliente1.setNome("Fernanda");
        cliente2.setSobrenome("Dias");
        cliente3.setCep("4323233");
        cliente4.setCpf("048343234");
        cliente5.setId(6);
        cliente6.setSobrenome("Pedroso");
        cliente7.setId(7);
        cliente7.setNome("Francisco");

        System.out.println("----- getters-cliente1 -----");
        System.out.println(cliente1.getId());
        System.out.println(cliente1.getCpf());
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getEndereco());
        System.out.println(cliente1.getCep());
        System.out.println(cliente1.getTelefone());
        System.out.println(cliente1.getEmail());

        System.out.println("----- getters-cliente2 -----");
        System.out.println(cliente2.getId());
        System.out.println(cliente2.getCpf());
        System.out.println(cliente2.getNome());
        System.out.println(cliente2.getSobrenome());
        System.out.println(cliente2.getEndereco());
        System.out.println(cliente2.getCep());
        System.out.println(cliente2.getTelefone());
        System.out.println(cliente2.getEmail());

        System.out.println("----- getters-cliente3 -----");
        System.out.println(cliente3.getId());
        System.out.println(cliente3.getCpf());
        System.out.println(cliente3.getNome());
        System.out.println(cliente3.getSobrenome());

        System.out.println("----- getters-cliente4 -----");
        System.out.println(cliente4.getId());
        System.out.println(cliente4.getCpf());
        System.out.println(cliente4.getNome());
        System.out.println(cliente4.getSobrenome());

        System.out.println("----- getters-clientel5 -----");
        System.out.println(cliente5.getId());

        System.out.println("----- getters-cliente6 -----");
        System.out.println(cliente6.getId());
        System.out.println(cliente6.getCpf());
        System.out.println(cliente6.getNome());
        System.out.println(cliente6.getSobrenome());

        System.out.println("----- getters-cliente7 -----");
        System.out.println(cliente7.getId());
        System.out.println(cliente7.getNome());

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        clientes.add(cliente6);
        clientes.add(cliente7);

        System.out.println("-----Lista-----");
        System.out.println(clientes);

        System.out.println("-----Lista Decrescente ID-----");
        clientes.sort(Comparator.comparing(Cliente::getId).reversed());
        System.out.println(clientes);

        System.out.println("-----Lista Objeto id=3-----");
        Cliente clienteFind = clientes.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(clienteFind);

        Map<Integer, Cliente> clientesMap = new HashMap<>();
        clientesMap.put(cliente1.getId(), cliente1);
        clientesMap.put(cliente2.getId(), cliente2);
        clientesMap.put(cliente3.getId(), cliente3);
        clientesMap.put(cliente4.getId(), cliente4);
        clientesMap.put(cliente5.getId(), cliente5);
        clientesMap.put(cliente6.getId(), cliente6);
        clientesMap.put(cliente7.getId(), cliente7);

        System.out.println("----Map----");
        System.out.println(clientesMap);

        System.out.println("----Esse tipo de estrutura não permite a ordenação ----");

        System.out.println("-----Map Objeto id=3-----");
        System.out.println(clientesMap.get(3));

    }
}

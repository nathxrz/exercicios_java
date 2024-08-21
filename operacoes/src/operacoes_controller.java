
//------------------ LIST ------------------

//List<Carro> carros = new ArrayList<>();
//        carros.add(carro1);
//        carros.add(carro2);
//        carros.add(carro3);
//        carros.add(carro4);
//        carros.add(carro5);
//        carros.add(carro6);

//        System.out.println("-----Lista-----");
//        System.out.println(carros);


//------------------ ORDENANDO LIST ------------------

//  carros.sort(Comparator.comparing(Carro::getId).); <crescente>
//  carros.sort(Comparator.comparing(Carro::getId).reversed()); <decrescente>


//------------------ PESQUISA LIST ------------------

//  System.out.println("-----Lista Objeto id=3-----");
//  Carro carroFind = carros.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
//  System.out.println(carroFind);


//------------------ MAP ------------------

//    Map<Integer, Carro> carrosMap = new HashMap<>();
//            carrosMap.put(carro1.getId(), carro1);
//            carrosMap.put(carro2.getId(), carro2);
//            carrosMap.put(carro3.getId(), carro3);
//            carrosMap.put(carro4.getId(), carro4);
//            carrosMap.put(carro5.getId(), carro5);
//            carrosMap.put(carro6.getId(), carro6);
//
//            System.out.println("----Map ----");
//            System.out.println(carrosMap);


//------------------ ORDENANDO MAP ------------------

//    System.out.println("----Map não permite a ordenação ----");


//------------------ PESQUISA MAP ------------------

//    System.out.println(carrosMap.get(3));


//---------- PESQUISA NA COLEÇÃO UMA CLASSE ESPECÍFICA <instanceof> ----------

//    System.out.println("Lista de bicicletas: ");
//    veiculos.forEach(v -> {
//          if(v instanceof Bicicleta) {
//              System.out.println(v);
//           }
//     });


//---------- PESQUISA NA COLEÇÃO UMA CLASSE ESPECÍFICA E COM VALOR ESPECÍFICO <instanceof> ----------

//    System.out.println("Lista dos automóveis com placa I/i: ");
//        veiculos.forEach(v -> {
//            if(v instanceof Automovel) {
//                if( ((Automovel) v).getPlaca().startsWith("I") || ((Automovel) v).getPlaca().startsWith("i") ) {
//                    System.out.print(v);
//                }
//            }
//        });


//------------------ SOMA VALORES DE UMA COLEÇÃO ------------------

//  double totalBonus = 0.0;
//      for(Funcionario f: funcionarios) {
//          totalBonus += f.getSalario() + f.getBonus();
//       }

//    double total = 0.0;
//          for(Funcionario f: funcionarios) {
//                  total += f.getSalario();
//           }


//------------------ SOMA VALORES DE UMA COLEÇÃO + 5% <salario> ------------------

//    double totalAumento = 0.0;
//        for(Funcionario f: funcionarios) {
//            f.setSalario(f.getSalario() + (f.getSalario() * 0.05));
//            totalAumento += f.getSalario() + f.getBonus();
//        }


//------------------ FORMATA VALORES  ------------------

//    System.out.println(NumberFormat.getCurrencyInstance().format(totalBonus));


//------------------ BUSCA MAIOR VALOR  ------------------

//    Funcionario func_maior_salario = Collections.max(funcionarios, Comparator.comparing(Funcionario::getSalario));
//
//    funcionarios.forEach(f -> {
//        // compara os demais salarios com o maior para escrever na tela os funcs que possuem o mesmo salario (maior)
//        if(f.getSalario() >= func_maior_salario.getSalario()) {
//            System.out.print(f);
//        }
//    });

//    System.out.println("\n---- Clientes com maiores quantidade de cotas: ----");
//    Cliente clienteMaiorQuantCotas = Collections.max(clientes, Comparator.comparing(Cliente::getQdeCotas)); //primeiro define a maior quantidade de cotas;
//        for (Cliente cliente : clientes) {
//            if(cliente.getQdeCotas() >= clienteMaiorQuantCotas.getQdeCotas()) { //compara com os demais
//            System.out.println(cliente);
//        }
//    }


//------------------ MOVER PERSONAGEM <METODOS>  ------------------

//    animais.forEach(animal -> {
//        if(animal instanceof Cachorro){
//            animal.mover(8.0,8.0);
//            animal.desenhar();
//            System.out.println(animal);
//        }
//    });

//animais.forEach(animal -> {
//    if(animal instanceof Peixe){
//        ((Peixe) animal).mover(5.0,5.0,5.0);
//        animal.desenhar();
//        System.out.println(animal);
//    }else if(animal instanceof Passaro){
//        //((Passaro) animal): Esta parte do código é um "downcast".
//        // Assume-se que animal é uma referência a um objeto do tipo Animal,
//        // mas na realidade é um Peixe. O cast (Peixe) está dizendo ao
//        // compilador para tratar animal como se fosse do tipo Peixe.
//        ((Passaro) animal).mover(5.0,5.0,5.0);
//        animal.desenhar();
//        System.out.println(animal);
//    }
//});
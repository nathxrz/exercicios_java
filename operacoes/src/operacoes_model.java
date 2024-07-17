

//--------- DEPOSITA, SACA, ATUALIZA E LUCRO <CONTA> ---------

//  public void deposita(double valor){
//      this.saldo += valor;
//  }

//  public void saca(double valor){
//      if(this.saldo >= valor){
//            this.saldo -= valor;
//       }else{
//            System.out.println("Saldo insuficiente");
//       }
//  }

//  public void atualiza(double taxa){
//      if(taxa > 0){
//            this.saldo += saldo * (taxa/100);
//        }else{
//            System.out.println("A taxa não pode ser zero.");
//        }
//  }

//    public double lucros(int qdeCotas, double valorCota){
//        return qdeCotas*valorCota;
//    }

//--------- BONUS <salario> ---------

//    public double getBonus(){
//        return getSalario() * 0.05;
//    }

//--------- TICKER <funcionario> ---------

//    public String getTicker() {
//        return ticker;
//    }

//    public void setTicker(String ticker) {
//        this.ticker = ticker;
//    }

//--------- MOVER E DESENHAR <personagem> ---------

//    public void mover(double x, double y, double z) {
//        super.mover(x, y); //reutiliza o método mover que está na superclasse
//        this.z = z;
//    }

//    public void desenhar(){
//        System.out.println("\nDesenhar um peixe");
//    }
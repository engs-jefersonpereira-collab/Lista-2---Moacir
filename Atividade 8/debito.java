package Atv8;

class Debito extends MetodoPagamento{
   public Debito(double valor){
    super(valor);
   }

   @Override

   public void  processar(){
    System.out.println("Cobrando R$ X no cartão... sem taxa");
    System.out.println("Valor total: " + valor);
   }
}
package Atv8;

class Criptomoeda extends MetodoPagamento{
    public Criptomoeda(double valor){
        super(valor);
    }

    @Override
    public void processar(){
        System.out.println("Convertendo R$ X para Bitcoin...");
        System.out.println("Valor total: " + (valor * 0.0001)); // Valor fictício para o Bitcoin
    }
}
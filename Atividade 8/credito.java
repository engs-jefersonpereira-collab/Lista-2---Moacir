package Atv8;

class Credito extends MetodoPagamento{
    public Credito(double valor){
        super(valor);
    }

    @Override
    public void  processar(){
       System.out.println("Cobrando R$ X no cartão... Taxa de 5%");
       System.out.println("Valor total: " + (valor * 1.05));
    }
} 
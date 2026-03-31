package Atv8;

class MetodoPagamento {
    protected double valor;
    public MetodoPagamento(double valor) {
        this.valor = valor;
    }

    public void  processar(){
        System.out.println("Processando pagamento de R$ " + valor);
    }
}
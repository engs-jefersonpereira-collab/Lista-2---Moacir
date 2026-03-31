package Atv4;

class PessoaFisica extends Contribuinte{
    public PessoaFisica(double rendaBruta){
        super(rendaBruta);
    }
    @Override
    public double calcularImposto(){
       System.out.println("Pessoa Fisica: ");
        return rendaBruta * 0.15;
    }
}
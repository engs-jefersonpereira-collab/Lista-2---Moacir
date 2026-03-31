package Atv4;

class PessoaJuridica extends Contribuinte{
    public PessoaJuridica(double rendaBruta){
        super(rendaBruta);
      
    }
      @Override
        public double calcularImposto(){
            System.out.println("Pessoa Juridica ");
            return rendaBruta * 0.10;
        }
}
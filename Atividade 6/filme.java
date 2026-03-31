package Atv6;

class Filme extends Conteudo{
    public Filme(String titulo){
        super(titulo);
    }
    
    @Override
    public double getPreco(){
        return 10.00;
    }
}
package Atv7;

class PrimeiraClasse extends Passagem{
    public PrimeiraClasse(double precoBase){
        super(precoBase);
    }

    @Override
    public double calcularPrecoFinal(){
        System.out.println("Classe Primeira Classe: ");
        return precoBase * 2;
    }
    
}
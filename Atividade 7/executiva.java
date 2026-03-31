package Atv7;

class Executiva extends Passagem{
    public Executiva(double precoBase){
        super(precoBase);
    }

    @Override
    public double calcularPrecoFinal(){
        System.out.println("Classe Executiva: ");
        return precoBase * 1.50;
    }
}
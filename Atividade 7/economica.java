package Atv7;

class Economica extends Passagem{
    public Economica(double precoBase){
        super(precoBase);
    }

    @Override

    public double calcularPrecoFinal(){
        System.out.println("Classe Economica: ");
        return precoBase * 1.10;
    }
}
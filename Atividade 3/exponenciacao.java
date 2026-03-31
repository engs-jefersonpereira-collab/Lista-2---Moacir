package Atv3;

class Exponenciacao extends Operacao{
    @Override
    public double executar(double a, double b){
        return Math.pow(a, b);
    }
}
package Atv3;

class Divisao extends Operacao{
    @Override
    public double executar(double a, double b){
       if(b == 0){
        System.out.println("Divisão impossível ");
        return 0;
       } else {
        return a / b;
       }
    }
}
package Atv3;

class Operacao {
    protected double a;
    protected double b;
    
    public void operacao(double a, double b){
       this.a = a;
       this.b = b;
    }

    public double executar(double a, double b){
        return 0;
    }
}
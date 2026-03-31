package Atv4;

class Contribuinte{
    protected double  rendaBruta;

    public Contribuinte(double rendaBruta){
        this.rendaBruta = rendaBruta;
    }

    public double calcularImposto(){
        return 0;
    }
}
package Atv9;

class Unidade {
    protected int mover;
    protected String atacar;

    public Unidade(int mover, String atacar){
        this.mover = mover;
        this.atacar = atacar;
    }

    public void mover(){
        System.out.println("Unidade se moveu " + mover + " vezes.");
    }

    public void atacar(){
        System.out.println("Unidade atacou: " + atacar);
    }
}
package Atv9;

class Arqueiro extends Unidade {
    public Arqueiro(int mover, String atacar) {
        super(mover, atacar);
    }

    @Override
    public void mover(){
        System.out.println("Arqueiro se moveu " + mover + " casas.");
    }
    public void atacar(){
        System.out.println("Arqueiro ataca a distância. ");
    }
}
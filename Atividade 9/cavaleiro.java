package Atv9;

class Cavaleiro extends Unidade {
    public Cavaleiro(int mover, String atacar) {
        super(mover, atacar);
    }

    @Override
    public void mover() {
        System.out.println("Cavaleiro se moveu " + mover + " casas.");
    }

    @Override
    public void atacar() {
        System.out.println("Cavaleiro ataca corpo a corpo.");
    }
}
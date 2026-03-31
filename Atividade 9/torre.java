package Atv9;

class Torre extends Unidade{
    public Torre(int mover, String atacar) {
        super(mover, atacar);
    }

    @Override
    public void mover() {
        System.out.println("Não pode mover. ");
    }
    public void atacar(){
        System.out.println("Ataca com o canhão.");
    }
}
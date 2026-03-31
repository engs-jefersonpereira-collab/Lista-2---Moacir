package Atv10;

class Texto extends Arquivo {
    public Texto(String nome, int tamanho) {
        super(nome, tamanho);
    }

    @Override
    public void abrir(){
        System.out.println("Lendo texto..." + nome + " com tamanho " + tamanho);
    }
}
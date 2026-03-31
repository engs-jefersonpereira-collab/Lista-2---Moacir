package Atv10;

class Video extends Arquivo {
    public Video(String nome, int tamanho) {
        super(nome, tamanho);
    }

    @Override
    public void abrir(){
        System.out.println("Dando play..." + nome + " com tamanho " + tamanho);
    }
    
}
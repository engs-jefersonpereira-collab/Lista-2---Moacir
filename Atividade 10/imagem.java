package Atv10;

class Imagem extends Arquivo {
    public Imagem(String nome, int tamanho) {
        super(nome, tamanho);
    }

    @Override
    public void abrir(){
        System.out.println("Mostrando foto..." + nome + " com tamanho " + tamanho);
    }
}
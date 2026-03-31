package Atv10;

class Arquivo {
    protected String nome;
    protected int tamanho;

    public Arquivo(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public void abrir(){
        System.out.println("Abrindo arquivo generico...");
    }
}
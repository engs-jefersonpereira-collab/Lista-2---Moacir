package Atv10;

class Main {
    public static void main(String[] args) {
        Pasta pasta = new Pasta();

        pasta.adicionar(new Imagem("Jpeg", 600));
        pasta.adicionar(new Texto("texto", 300));
        pasta.adicionar(new Video("Mp4", 1500));
        pasta.abrirTodos();
    }
}
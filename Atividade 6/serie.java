package Atv6;

class Serie extends Conteudo{
    protected int qtdEpisodios;

    public Serie(int qtdEpisodios, String titulo){
        super(titulo);
        this.qtdEpisodios = qtdEpisodios;
    }

    @Override
    public double getPreco(){
        return qtdEpisodios * 2;
    }
}
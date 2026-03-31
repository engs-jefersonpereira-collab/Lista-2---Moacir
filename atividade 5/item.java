package Atv5;

class Item {
    private String nome;
    private double preco;

    public Item(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    @Override
    public String toString(){
        return "Nome do item: " + nome + " R$ " + preco;
    }
}
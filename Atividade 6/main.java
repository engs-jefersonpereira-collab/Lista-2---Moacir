package Atv6;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Conteudo> lista = new ArrayList<>();
        lista.add(new Filme("Vingadores "));
        lista.add(new Serie(90, "Prison-Break "));
        lista.add(new Documentario("Cesio 137 "));
        double total = 0;
        
        for(Conteudo c : lista){
            double preco = c.getPreco();
            total += preco;
            System.out.println(c.titulo + " - R$ " + preco);
        }
      
        System.out.println("Total: " + total);
    }
}
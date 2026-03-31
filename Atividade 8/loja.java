package Atv8;

import java.util.ArrayList;

class Loja {
    public static void main(String[] args) {
        ArrayList<MetodoPagamento> pagar = new ArrayList<>();

        pagar.add(new Debito(100));
        pagar.add(new Credito(200));
        pagar.add(new Criptomoeda(130));

        for (MetodoPagamento m : pagar){
           m.processar();
        }
    }
}
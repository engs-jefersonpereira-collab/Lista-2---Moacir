package Atv7;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Passagem> escolha = new ArrayList<>();

        escolha.add(new Economica(150));
        escolha.add(new Executiva(300));
        escolha.add(new PrimeiraClasse(600));

        for(Passagem p : escolha){
            System.out.println(p.calcularPrecoFinal());
        }
    }
}
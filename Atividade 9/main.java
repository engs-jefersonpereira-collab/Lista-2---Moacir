package Atv9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Unidade> jogo = new ArrayList<>();

        jogo.add(new Arqueiro(1, "Ataca a distância. "));
        jogo.add(new Cavaleiro(3, "Ataca corpo a corpo."));
        jogo.add(new Torre(0, "Ataca com o canhão."));

        for (Unidade u : jogo){
            u.mover();
            u.atacar();
        }
    }
}
package Atv1;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Instrumento> instrumentos = new ArrayList<>();

        instrumentos.add(new Violao());
        instrumentos.add(new Bateria());

        for (Instrumento i : instrumentos) {
            i.tocar();
        }
    }
}
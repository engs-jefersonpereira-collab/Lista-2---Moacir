package Atv4;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Contribuinte> contribuicao = new ArrayList<>();

        contribuicao.add(new PessoaFisica(100));
        contribuicao.add(new PessoaJuridica(1500));

        for (Contribuinte c : contribuicao){
           System.out.println(c.calcularImposto());
        }
    }
}
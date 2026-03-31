package Atv3;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Operacao> operacoes = new ArrayList<>();
        
        operacoes.add(new Soma());
        operacoes.add(new Divisao());
        operacoes.add(new Exponenciacao());
        
        double a = 10;
        double b = 2;
        for(Operacao op: operacoes){
         System.out.println(op.executar(a, b));
        }
    }
}
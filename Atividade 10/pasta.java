package Atv10;

import java.util.ArrayList;

class Pasta {
    private ArrayList<Arquivo> arquivos;

    public Pasta(){
        arquivos = new ArrayList<>();
    }

    public void adicionar(Arquivo arquivo){
        arquivos.add(arquivo);
    }

    public void abrirTodos(){
        for(Arquivo a : arquivos){
            a.abrir();
        }
    }
}
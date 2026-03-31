package Atv2;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<RedeSocial> redesSociais = new ArrayList<>();
        String msgGenerica = "Lista do Professor Moaca ";
        redesSociais.add(new Instagram());
        redesSociais.add(new Twitter());

        for(RedeSocial r : redesSociais){
            r.postar(msgGenerica);
        
        }
    }
}
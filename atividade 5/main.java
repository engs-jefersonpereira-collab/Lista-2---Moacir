package Atv5;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
    ArrayList<Item> items = new ArrayList<>();
    
    items.add(new Item("Arroz", 5.75));
    items.add(new Item("Feijão", 6.50));
    items.add(new Item("Açucar", 3.50));
    items.add(new Item("Sal", 2.25));

    for (Item i : items){
        System.out.println(i.toString());
    }
}

    }
 
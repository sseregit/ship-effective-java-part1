package jang.effective.java.chapter08.item54;

import java.util.List;

public class CheeseExample {

    public static void main(String[] args) {
        Cheese[] cheeses = new Cheese[0];
        CheeseStore cheeseStore = new CheeseStore(cheeses);
        List<Cheese> cheese = cheeseStore.getCheese();
        if (cheese != null && !cheese.isEmpty()) {
            System.out.println("We have cheese: " + cheese);
        } else {
            System.out.println("We have no cheese");
        }
    }
}

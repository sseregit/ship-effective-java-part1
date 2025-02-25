package jang.effective.java.chapter08.item54;

import java.util.ArrayList;
import java.util.List;

public class CheeseStore {

    private final List<Cheese> cheesesInStock = new ArrayList<>();

    private static final Cheese[] EMPTY_CHEESES_ARRAY = new Cheese[0];

    public CheeseStore(Cheese... initialCheeses) {
        for (Cheese cheese : initialCheeses) {
            addCheese(cheese);
        }
    }

    private void addCheese(Cheese cheese) {
        cheesesInStock.add(cheese);
    }

    public List<Cheese> getCheese() {
        return new ArrayList<>(cheesesInStock);
    }

    public Cheese[] getCheeseArray() {
        return EMPTY_CHEESES_ARRAY;
    }
}

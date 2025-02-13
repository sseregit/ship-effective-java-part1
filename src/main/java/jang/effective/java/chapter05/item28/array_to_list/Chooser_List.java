package jang.effective.java.chapter05.item28.array_to_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser_List<T> {
    private final List<T> choiceList;

    public Chooser_List(Collection<T> choices) {
        this.choiceList = new ArrayList<>(choices);
    }

    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6);

        Chooser_List<Integer> chooser = new Chooser_List<>(intList);

        for (int i = 0; i < 10; i++) {
            Integer choice = chooser.choose();
            System.out.println(choice);
        }
    }
}

package jang.effective.java.chapter06.item48.spliterator;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorCharacteristicsExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date");

        Spliterator<String> spliterator = list.spliterator();

        int characteristics = spliterator.characteristics();
        System.out.println("characteristics = " + characteristics);
        System.out.println("characteristics = " + Integer.toBinaryString(characteristics));

        if ((characteristics & Spliterator.ORDERED) != 0) {
            System.out.println("Spliterator is ORDERED");
        }

        /*if (spliterator.hasCharacteristics(Spliterator.ORDERED)) {
            System.out.println("Spliterator is ORDERED");
        }*/

        if ((characteristics & Spliterator.DISTINCT) != 0) {
            System.out.println("Spliterator is DISTINCT");
        }

        if ((characteristics & Spliterator.SORTED) != 0) {
            System.out.println("Spliterator is SORTED");
        }

        if ((characteristics & Spliterator.SIZED) != 0) {
            System.out.println("Spliterator is SIZED");
        }

        if ((characteristics & Spliterator.NONNULL) != 0) {
            System.out.println("Spliterator is NONNULL");
        }

        if ((characteristics & Spliterator.IMMUTABLE) != 0) {
            System.out.println("Spliterator is IMMUTABLE");
        }

        if ((characteristics & Spliterator.CONCURRENT) != 0) {
            System.out.println("Spliterator is CONCURRENT");
        }

        if ((characteristics & Spliterator.SUBSIZED) != 0) {
            System.out.println("Spliterator is SUBSIZED");
        }
    }
}

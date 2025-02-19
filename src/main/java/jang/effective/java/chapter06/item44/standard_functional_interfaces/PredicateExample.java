package jang.effective.java.chapter06.item44.standard_functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("banana", "apple", "cherry", "blueberry"));
        System.out.println("Original list: " + words);

        Predicate<String> startsWithB = s -> s.startsWith("b");

        List<String> startWithB = words.stream()
                .filter(startsWithB)
                .toList();

        System.out.println("Filtered list: " + startWithB);
    }
}

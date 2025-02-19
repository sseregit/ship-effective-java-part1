package jang.effective.java.chapter06.item44.standard_functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("banana", "apple", "cherry"));
        System.out.println("Original list: " + words);

        Consumer<String> printWord = System.out::println;
        words.forEach(printWord);
    }
}

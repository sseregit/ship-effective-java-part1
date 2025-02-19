package jang.effective.java.chapter06.item44.standard_functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("banana", "apple", "cherry"));
        System.out.println("Original list: " + words);

        Function<String, Integer> stringLength = String::length;

        List<Integer> lengths = words.stream()
                .map(stringLength)
                .toList();

        System.out.println("Lengths: " + lengths);
    }
}

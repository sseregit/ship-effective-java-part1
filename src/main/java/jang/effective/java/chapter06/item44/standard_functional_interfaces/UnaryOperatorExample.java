package jang.effective.java.chapter06.item44.standard_functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("banana", "apple", "cherry"));
        System.out.println("Before conversion: " + words);

        UnaryOperator<String> toUpperCase = String::toUpperCase;

        List<String> upperCaseWords = words.stream()
                .map(toUpperCase)
                .toList();

        System.out.println("After conversion: " + upperCaseWords);
    }
}

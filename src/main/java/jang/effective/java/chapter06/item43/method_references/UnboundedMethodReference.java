package jang.effective.java.chapter06.item43.method_references;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnboundedMethodReference {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry"));
        System.out.println("Before conversion: " + words);

        List<String> lowerCaseWords = words.stream()
                .map(String::toLowerCase)
//                .map(s -> s.toLowerCase())
                .toList();
        System.out.println("After conversion: " + lowerCaseWords);

        words = new ArrayList<>(Arrays.asList("banana", "apple", "cherry"));
        System.out.println("Before sorting: " + words);

        Collections.sort(words, String::compareTo);
//        Collections.sort(words, (s, anotherString) -> s.compareTo(anotherString));

        System.out.println("After sorting: " + words);
    }
}

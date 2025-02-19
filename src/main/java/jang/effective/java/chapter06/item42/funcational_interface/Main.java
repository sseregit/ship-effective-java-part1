package jang.effective.java.chapter06.item42.funcational_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("aaa", "bbbbb", "c"));
        System.out.println(words);

//        Collections.sort(words, (o1, o2) -> Integer.compare(o1.length(), o2.length()));

//        Collections.sort(words, Comparator.comparingInt(String::length));

        words.sort(Comparator.comparingInt(String::length));

        System.out.println(words);
    }
}

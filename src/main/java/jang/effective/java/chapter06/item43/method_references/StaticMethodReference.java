package jang.effective.java.chapter06.item43.method_references;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StaticMethodReference {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("aaa", "bbbbb", "c"));
        System.out.println("Before sorting : " + words);

        Collections.sort(words, StaticMethodReference::comparebyLength);

        System.out.println("After sorting : " + words);
    }

    private static int comparebyLength(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
}

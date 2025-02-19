package jang.effective.java.chapter06.item43.method_references;

import java.util.Arrays;
import java.util.List;

public class ArrayConstructorMethodReference {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        System.out.println("names = " + names);

        String[] namesArray = names.toArray(String[]::new);

        System.out.println("namesArray = " + Arrays.toString(namesArray));
    }
}

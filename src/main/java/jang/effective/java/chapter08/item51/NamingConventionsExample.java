package jang.effective.java.chapter08.item51;

import java.util.List;

public class NamingConventionsExample {

    public void printAllElements(List<String> elements) {
        for (String element : elements) {
            System.out.println(element);
        }
    }

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static void main(String[] args) {
        NamingConventionsExample example = new NamingConventionsExample();

        example.printAllElements(List.of("Apple", "Banana", "Cherry"));
        System.out.println("Sum: " + example.addNumbers(5, 10));
        System.out.println("Is null or empty: " + example.isNullOrEmpty(null));
    }
}

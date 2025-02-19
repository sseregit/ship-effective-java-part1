package jang.effective.java.chapter06.item44.standard_functional_interfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        BinaryOperator<String> concatenate = (s1, s2) -> s1 + s2;

        String result = concatenate.apply("Hello, ", "World");
        System.out.println(result);
    }
}

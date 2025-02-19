package jang.effective.java.chapter06.item44.custom_functional_interfaces;

public class TriFunctionExample {

    public static void main(String[] args) {
        TriFunction<String, String, String, String> concatenate = (a, b, c) -> a + b + c;

        String result = concatenate.apply("hello, ", "world", "!");
        System.out.println(result);

        TriFunction<Integer, Integer, Integer, Integer> sum = (a, b, c) -> a + b + c;

        Integer sumResult = sum.apply(1, 2, 3);
        System.out.println(sumResult);
    }
}

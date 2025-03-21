package jang.effective.java.chapter05.item30._01_before;

import java.util.function.Function;

public class GenericSingletonFactory {

    public static Function<String, String> stringIdentityFunction() {
        return t -> t;
    }

    public static Function<Number, Number> integerIdentityFunction() {
        return t -> t;
    }

    public static void main(String[] args) {
        String[] strings = {"삼베", "대마", "나일론"};
        Function<String, String> sameString = stringIdentityFunction();
        for (String s : strings) {
            System.out.println(sameString.apply(s));
        }

        Number[] numbers = {1, 2.0, 3L};
        Function<Number, Number> sameNumber = integerIdentityFunction();
        for (Number n : numbers) {
            System.out.println(sameNumber.apply(n));
        }
    }


}

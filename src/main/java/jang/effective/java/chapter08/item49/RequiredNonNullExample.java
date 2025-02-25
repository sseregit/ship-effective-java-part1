package jang.effective.java.chapter08.item49;

import java.util.Objects;

public class RequiredNonNullExample {

    public static void main(String[] args) {
        doWork();
    }

    public static void doWork() {
        String value = null;

        try {
            Objects.requireNonNull(value, "The value cannot be null");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        value = "Hello, World!";

        String result = Objects.requireNonNull(value, "The value cannot be null");
        System.out.println(result);
    }
}

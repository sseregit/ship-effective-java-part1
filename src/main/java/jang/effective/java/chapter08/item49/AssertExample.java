package jang.effective.java.chapter08.item49;

public class AssertExample {
    public static void main(String[] args) {
        doPrivate(5);
        doPrivate(-5);
    }

    private static void doPrivate(int value) {
        /*if (value < 0) {
            throw new IllegalArgumentException("Value should be greater than 0");
        }*/

        assert value > 0 : "Value should be greater than 0";
    }
}

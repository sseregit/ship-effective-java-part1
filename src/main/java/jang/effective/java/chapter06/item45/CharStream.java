package jang.effective.java.chapter06.item45;

public class CharStream {
    public static void main(String[] args) {
        "Hello world!".chars().forEach(System.out::print);
        System.out.println();

        "Hello world!".chars().forEach(x -> System.out.print((char) x));
        System.out.println();
    }
}

package jang.effective.java.chapter01.item01;

public interface HelloService {

    String hello();

    default String hi1() {
        prepareMessage();
        return "hi";
    }
    default String hi2() {
        prepareMessage();
        return "hi";
    }
    default String hi3() {
        prepareMessage();
        return "hi";
    }

    private void prepareMessage() {
        // ....
    }

    static String bye() {
        return "bye";
    }
}
package jang.effective.java.chapter04.item21;

public interface MarkerInterface {

    default void hello() {
        System.out.println("hello interface");
    }
}

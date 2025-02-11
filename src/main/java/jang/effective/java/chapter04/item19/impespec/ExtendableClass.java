package jang.effective.java.chapter04.item19.impespec;

public class ExtendableClass {

    /**
     * This method can be ovveridden to print any message
     *
     * @implSpec
     * Please use System.out.println().
     */
    public void doSomething() {
        System.out.println("hello");
    }
}

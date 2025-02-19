package jang.effective.java.chapter05.item26.terms;

public class Box<E> {

    private E item;

    private void add(E e) {
        item = e;
    }

    private E get() {
        return item;
    }

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.add(10);
        System.out.println(box.get() * 100);
        printBox(box);
    }

    private static void printBox(Box<?> box) {
        System.out.println(box.get());
    }
}

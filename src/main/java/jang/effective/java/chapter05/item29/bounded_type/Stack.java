package jang.effective.java.chapter05.item29.bounded_type;

import jang.effective.java.chapter01.item07.stack.EmptyStackException;

import java.util.Arrays;
import java.util.List;

public class Stack<E extends Number> {
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private Number[] elements;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public Stack() {
        elements = new Number[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        @SuppressWarnings("unchecked")
        E result = (E) elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, size * 2 - 1);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        for (Integer arg : List.of(1, 2, 3)) {
            stack.push(arg);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }


}

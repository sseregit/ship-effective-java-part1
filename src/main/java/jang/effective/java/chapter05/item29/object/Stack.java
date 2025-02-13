package jang.effective.java.chapter05.item29.object;

import jang.effective.java.chapter01.item07.stack.EmptyStackException;

import java.util.Arrays;
import java.util.List;

public class Stack {
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private Object[] elements;
    private int size = 0;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
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
        Stack stack = new Stack();
        for (String arg : List.of("a", "b", "c")) {
            stack.push(arg);
        }
        while (!stack.isEmpty()) {
            System.out.println(((String)stack.pop()).toUpperCase());
        }
    }


}

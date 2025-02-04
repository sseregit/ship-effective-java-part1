package jang.effective.java.chapter01.item07.stack;

import java.util.Arrays;

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

//    public Object pop() {
//        if (size == 0) {
//            throw new EmptyStackException();
//        }
//        return elements[--size];
//    }

    // 제대로 구현한 pop 메서드
    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, size * 2 - 1);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        for (String arg : args) {
            stack.push(arg);
        }

        while (true) {
            System.err.println(stack.pop());
        }
    }
}

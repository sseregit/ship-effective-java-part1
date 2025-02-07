package jang.effective.java.chapter02.item13;

import jang.effective.java.chapter01.item07.stack.EmptyStackException;

import java.util.Arrays;

public class Stack implements Cloneable {
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

    @Override
    protected Stack clone() {
        try {
            Stack result = (Stack) super.clone();
            result.elements = elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, size * 2 - 1);
        }
    }

    public static void main(String[] args) {
        Object[] values = new Object[2];
        values[0] = new PhoneNumber(123, 456, 7890);
        values[1] = new PhoneNumber(321, 764, 2341);

        Stack stack = new Stack();
        for (Object arg : values) {
            stack.push(arg);
        }

        Stack copy = stack.clone();
        System.out.println("pop from stack");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " ");
        }
        System.out.println("pop from copy");
        while (!copy.isEmpty()) {
            System.out.println(copy.pop() + " ");
        }
        System.out.println(stack.elements[0] == copy.elements[0]);
    }


}

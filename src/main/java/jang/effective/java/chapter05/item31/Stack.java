package jang.effective.java.chapter05.item31;

import jang.effective.java.chapter01.item07.stack.EmptyStackException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Stack<E> {
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private E[] elements;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public Stack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        E result = elements[--size];
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

/*
    public void pushAll(Iterable<E> src) {
        for (E e : src) {
            push(e);
        }
    }
*/

    public void pushAll(Iterable<? extends E> src) {
        for (E e : src) {
            push(e);
        }
    }

/*
    public void popAll(Collection<E> dst) {
        while (!isEmpty()) {
            dst.add(pop());
        }
    }
*/

    public void popAll(Collection<? super E> dst) {
        while (!isEmpty()) {
            dst.add(pop());
        }
    }

    public static void main(String[] args) {
        Stack<Number> numberStack = new Stack<>();
        Iterable<Integer> integers = Arrays.asList(3, 1, 4, 1, 5, 9);
        numberStack.pushAll(integers);

        Iterable<Double> doubles = Arrays.asList(3.12412, 1.12412, 4.12412, 1.12412, 5.12412, 9.123);
        numberStack.pushAll(doubles);

        Collection<Object> objects = new ArrayList<>();
        numberStack.popAll(objects);

        System.out.println(objects);
    }


}

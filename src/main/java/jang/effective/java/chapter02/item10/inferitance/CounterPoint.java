package jang.effective.java.chapter02.item10.inferitance;

import jang.effective.java.chapter02.item10.Point;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterPoint extends Point {

    private static final AtomicInteger counter = new AtomicInteger(0);

    public CounterPoint(int x, int y) {
        super(x, y);
        counter.incrementAndGet();
    }

    public static int numberCreated() {
        return counter.get();
    }
}

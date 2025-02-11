package jang.effective.java.chapter04.item18;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class InstrumertedHashSet<E> extends HashSet<E> {
    private int addCount = 0;

    public InstrumertedHashSet() {
    }

    public InstrumertedHashSet(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        InstrumertedHashSet<String> s = new InstrumertedHashSet<>();
        s.addAll(List.of("틱", "탁탁", "펑"));
        System.out.println(s.getAddCount());
    }
}

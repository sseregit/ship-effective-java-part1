package jang.effective.java.chapter04.item18;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InstrumertedSet<E> extends ForwardingSet<E> {
    private int addCount = 0;

    public InstrumertedSet(Set<E> s) {
        super(s);
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
        InstrumertedSet<String> s = new InstrumertedSet<>(new HashSet<>());
        s.addAll(List.of("틱", "탁탁", "펑"));
        System.out.println(s.getAddCount());
    }
}

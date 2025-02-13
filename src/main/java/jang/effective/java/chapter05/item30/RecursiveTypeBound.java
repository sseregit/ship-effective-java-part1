package jang.effective.java.chapter05.item30;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class RecursiveTypeBound {
    public static <E extends Comparable<E>> E max(Collection<E> c) {
        if (c.isEmpty())
            throw new IllegalArgumentException("컬렉션이 비어 있습니다.");

        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> argList = List.of("keesun", "whiteship");
        System.out.println(max(argList));
    }
}

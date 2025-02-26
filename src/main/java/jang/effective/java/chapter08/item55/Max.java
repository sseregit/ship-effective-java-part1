package jang.effective.java.chapter08.item55;

import java.util.*;

public class Max {

    /*public static <E extends Comparable<E>> E max(Collection<E> c) {
        if (c.isEmpty())
            throw new IllegalArgumentException("빈 컬렉션");

        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
        }
        return result;
    }*/

    /*public static <E extends Comparable<E>> Optional<E> max(Collection<E> c) {
        if (c.isEmpty())
            return Optional.empty();

        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
        }
        return Optional.of(result);
    }*/

    public static <E extends Comparable<E>> Optional<E> max(Collection<E> c) {
        return c.stream().max(Comparator.naturalOrder());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("args", "args2", "args3");
        System.out.println(max(words));

        String lastWordInLexicon = max(words).orElse("단어 없음...");
        System.out.println(lastWordInLexicon);
    }
}

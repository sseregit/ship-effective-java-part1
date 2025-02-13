package jang.effective.java.chapter05.item30._01_after;

import java.util.HashSet;
import java.util.Set;

public class Union {

    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {
        Set<String> guys = Set.of("톰", "딕", "해리");
        Set<String> stooges = Set.of("래리", "모에", "컬리");
//        Set<Integer> stooges = Set.of(1, 2, 3);
        Set<String> all = union(guys, stooges);

        for (String o : all) {
            System.out.println(o);
        }
    }
}

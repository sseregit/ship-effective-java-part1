package jang.effective.java.chapter05.item30._01_before;

import java.util.HashSet;
import java.util.Set;

public class Union {

    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {
        Set guys = Set.of("톰", "딕", "해리");
//        Set<String> stooges = Set.of("래리", "모에", "컬리");
        Set stooges = Set.of(1, 2, 3);
        Set all = union(guys, stooges);

        for (Object o : all) {
            System.out.println((String) o);
        }
    }
}

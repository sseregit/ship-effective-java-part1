package jang.effective.java.chapter06.item40;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bigram2 {

    private final char first;
    private final char second;

    public Bigram2(char first, char second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bigram2 bigram2)) return false;
        return first == bigram2.first && second == bigram2.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return "Bigram{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        Set<Bigram2> s = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                s.add(new Bigram2(ch, ch));
            }
        }
        System.out.println(s.size());
        System.out.println(s);
    }
}

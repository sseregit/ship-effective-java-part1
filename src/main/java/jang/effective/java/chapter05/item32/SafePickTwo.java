package jang.effective.java.chapter05.item32;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SafePickTwo {

    static <T> List<T> pickTwo(T a, T b, T c) {
        return switch (ThreadLocalRandom.current().nextInt(3)) {
            case 0 -> List.of(a, b);
            case 1 -> List.of(a, c);
            case 2 -> List.of(b, c);
            default -> throw new IllegalStateException();
        };
    }

    public static void main(String[] args) {
        List<String> attributes = pickTwo("좋은", "빠른", "저렴한");
        System.out.println(attributes);
    }
}

package jang.effective.java.chapter06.item46;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Freq {

    public static void main(String[] args) {
        Stream<String> words = Arrays.asList("book", "BooK", "the", "book").stream();

//        Map<String, Long> freq = new HashMap<>();
//        words.forEach(word -> {
//            freq.merge(word.toLowerCase(), 1L, Long::sum);
//        });
//        System.out.println(freq);

        Map<String, Long> freq = words.collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
        System.out.println(freq);

        List<String> topTen = freq.keySet().stream()
                .sorted(Comparator.comparing(freq::get).reversed())
                .limit(10)
                .toList();

        System.out.println(topTen);
    }
}

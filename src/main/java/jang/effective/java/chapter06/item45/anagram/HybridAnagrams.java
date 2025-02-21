package jang.effective.java.chapter06.item45.anagram;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HybridAnagrams {
    public static void main(String[] args) throws IOException {
        Path dictionary = Paths.get("number.txt");
        int minGroupSize = 5;

        try (Stream<String> words = Files.lines(dictionary)) {
            words.collect(
                            Collectors.groupingBy(word -> alphabetize(word)))
                    .values().stream()
                    .filter(group -> group.size() >= minGroupSize)
                    .forEach(System.out::println);
        }
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}

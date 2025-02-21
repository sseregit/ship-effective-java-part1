package jang.effective.java.chapter06.item45.anagram;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAnagrams {
    public static void main(String[] args) throws IOException {
        Path dictionary = Paths.get("number.txt");
        int minGroupSize = 5;

        try (Stream<String> words = Files.lines(dictionary)) {
            words.collect(
                            Collectors.groupingBy(word -> word.chars().sorted()
                                    .collect(StringBuilder::new,
                                            (sb, c) -> sb.append((char) c),
                                            StringBuilder::append).toString()))
                    .values().stream()
                    .filter(group -> group.size() >= minGroupSize)
                    .map(group -> group.size() + ": " + group)
                    .forEach(System.out::println);
        }
    }
}

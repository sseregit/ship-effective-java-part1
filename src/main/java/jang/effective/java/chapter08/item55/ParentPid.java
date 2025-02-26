package jang.effective.java.chapter08.item55;

import java.util.Optional;
import java.util.stream.Stream;

public class ParentPid {
    public static void main(String[] args) {
        ProcessHandle ph = ProcessHandle.current();

        Optional<ProcessHandle> parentProcess = ph.parent();
        System.out.println("부모 PID: " + (parentProcess.isPresent() ? parentProcess.get().pid() : "N/A"));

        System.out.println("부모 PID: " + ph.parent().map(h -> String.valueOf(h.pid())).orElse("N/A"));

        Stream<Optional<String>> streamOfOptionals = Stream.of(
                Optional.of("Apple"),
                Optional.empty(),
                Optional.of("Banana"),
                Optional.of("Cherry"),
                Optional.empty()
        );

//        streamOfOptionals.filter(Optional::isPresent)
//                .map(Optional::get)
//                .forEach(System.out::println);

        streamOfOptionals.flatMap(Optional::stream)
                .forEach(System.out::println);
    }
}

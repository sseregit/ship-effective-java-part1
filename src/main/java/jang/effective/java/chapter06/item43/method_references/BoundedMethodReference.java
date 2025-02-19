package jang.effective.java.chapter06.item43.method_references;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class BoundedMethodReference {

    public static void main(String[] args) {
        List<Instant> instants = new ArrayList<>();
        instants.add(Instant.now().minusSeconds(10));
        instants.add(Instant.now().plusSeconds(10));
        instants.add(Instant.now().minusSeconds(20));
        instants.add(Instant.now().plusSeconds(20));

        Instant now = Instant.now();

        List<Instant> futureInstants = instants.stream()
                .filter(now::isAfter)
//                .filter(t -> now.isAfter(t))
                .toList();

        System.out.println(futureInstants);
    }
}

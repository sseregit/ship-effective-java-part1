package jang.effective.java.chapter06.item48.random;

import java.util.Random;
import java.util.SplittableRandom;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("random.nextInt(100) = " + random.nextInt(100));

        System.out.println("ThreadLocalRandom.current().nextInt(100) = " + ThreadLocalRandom.current().nextInt(100));

        SplittableRandom splittableRandom = new SplittableRandom();
        IntStream randomIntStream = splittableRandom.ints(10, 0, 100);
        long count = randomIntStream
                .parallel()
                .filter(number -> number > 50)
                .count();
        System.out.println(count);

    }
}

package jang.effective.java.chapter06.item48;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class ParallelPrimeCounting {

    static long pi(long n) {
        return LongStream.rangeClosed(2, n)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(start);
        System.out.println(pi(10_000_000));
        System.out.println(System.currentTimeMillis() - start);
    }
}

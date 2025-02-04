package jang.effective.java.chapter01.item06;

import java.util.regex.Pattern;

public class RomanNumberls {

    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3}])$");

    static boolean isRomanNumberalSlow(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3}])$");
    }

    static boolean isRomanNumberalFast(String s) {
        return ROMAN.matcher(s).matches();
    }

    public static void main(String[] args) {
        boolean result = false;
        long start = System.nanoTime();
        for (int j = 0; j < 100; j++) {
            result = isRomanNumberalSlow("MCMLXXVI");
//            result = isRomanNumberalFast("MCMLXXVI");
        }
        long end = System.nanoTime();
        System.out.println(end - start);
        System.out.println(result);
    }
}


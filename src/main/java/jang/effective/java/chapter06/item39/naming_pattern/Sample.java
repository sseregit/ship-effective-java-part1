package jang.effective.java.chapter06.item39.naming_pattern;

public class Sample {

    public static void testM1() {
    }

    public static void testM2() {
    }

    public static void testM3() {
        throw new RuntimeException("실패");
    }

    public static void m4() {
        // 테스트가 아님
    }

    public void testM5() {
        // 잘못 사용한 예: 정적 메서드가 아님
    }

    public static void testM6() {
    }

    public static void testM7() {
        throw new RuntimeException("실패");
    }

    public static void m8() {
    }
}

package jang.effective.java.chapter06.item39.markerannotation;

public class Sample {

    @Test
    public static void m1() {
    }

    public static void m2() {
    }

    @Test
    public static void m3() {
        throw new RuntimeException("실패");
    }

    public static void m4() {
        // 테스트가 아님
    }

    @Test
    public void m5() {
        // 잘못 사용한 예: 정적 메서드가 아님
    }

    public static void m6() {
    }

    @Test
    public static void m7() {
        throw new RuntimeException("실패");
    }

    public static void m8() {
    }
}

package jang.effective.java.chapter06.item39.naming_pattern;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runtests {

    public static void main(String[] args) {
        int tests = 0;
        int passed = 0;
        Class<Sample> testClass = Sample.class;

        for (Method m : testClass.getDeclaredMethods()) {
            if (m.getName().startsWith("test")) {
                tests++;
                try {
                    m.invoke(null);
                    passed++;
                } catch (InvocationTargetException wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    System.out.println(m + " 실패: " + exc);
                } catch (Exception e) {
                    System.out.println("잘못 사용한 @Test: " + m);
                }
            }
        }
        System.out.printf("성공: %d, 실패: %d%n", passed, tests - passed);
    }
}

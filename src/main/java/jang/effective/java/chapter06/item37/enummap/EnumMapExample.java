package jang.effective.java.chapter06.item37.enummap;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {

    enum LifeCycle {
        ANNUAL(1), PERENNIAL(2), BIENNIAL(3);

        private final int order;
        LifeCycle(int order) {
            this.order = order;
        }
    }

    public static void main(String[] args) {
        Map<LifeCycle, String> plantsByLifeCycle = new EnumMap<>(LifeCycle.class);
        plantsByLifeCycle.put(LifeCycle.ANNUAL, "바질");
        plantsByLifeCycle.put(LifeCycle.PERENNIAL, "라벤더");
        plantsByLifeCycle.put(LifeCycle.BIENNIAL, "파슬리");
        System.out.println(plantsByLifeCycle);

        Map<LifeCycle, String> plantsByLifeCycle2 = Collections.synchronizedMap(new EnumMap<>(LifeCycle.class));
    }
}

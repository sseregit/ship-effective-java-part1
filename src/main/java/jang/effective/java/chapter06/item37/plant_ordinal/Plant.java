package jang.effective.java.chapter06.item37.plant_ordinal;


import java.util.HashSet;
import java.util.Set;

public class Plant {

    enum LifeCycle {ANNUAL, PERENNIAL, BIENNIAL}

    final String name;
    final LifeCycle lifeCycle;

    public Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Plant[] garden = {
                new Plant("바질", LifeCycle.ANNUAL),
                new Plant("캐러웨이", LifeCycle.BIENNIAL),
                new Plant("딜", LifeCycle.ANNUAL),
                new Plant("라벤더", LifeCycle.PERENNIAL),
                new Plant("파슬리", LifeCycle.BIENNIAL),
                new Plant("로즈마리", LifeCycle.PERENNIAL)
        };

        Set<Plant>[] plantsByLifeCycleArr = new Set[LifeCycle.values().length];
        for (int i = 0; i < plantsByLifeCycleArr.length; i++) {
            plantsByLifeCycleArr[i] = new HashSet<>();
        }

        for (Plant p : garden) {
            plantsByLifeCycleArr[p.lifeCycle.ordinal()].add(p);
        }
        for (int i = 0; i < plantsByLifeCycleArr.length; i++) {
            System.out.printf("%s: %s%n", LifeCycle.values()[i], plantsByLifeCycleArr[i]);
        }
    }
}

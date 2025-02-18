package jang.effective.java.chapter06.item37.plant_enummap;


import java.util.*;
import java.util.stream.Collectors;

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

        Map<LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(LifeCycle.class);

        for (LifeCycle lifeCycle : LifeCycle.values()) {
            plantsByLifeCycle.put(lifeCycle, new HashSet<>());
        }

        for (Plant p : garden) {
            plantsByLifeCycle.get(p.lifeCycle).add(p);
        }

        System.out.println(plantsByLifeCycle);

        // stream 1 - EnumMap 사용하지 않음
        Map<LifeCycle, List<Plant>> collect = Arrays.stream(garden)
                .collect(Collectors.groupingBy(p -> p.lifeCycle));
        System.out.println(collect);

        // stream 2 - EnumMap을 이용해 데이터와 열거 타입을 매핑
        EnumMap<LifeCycle, Set<Plant>> collect1 = Arrays.stream(garden)
                .collect(Collectors.groupingBy(p -> p.lifeCycle, () -> new EnumMap<>(LifeCycle.class), Collectors.toSet()));
        System.out.println(collect1);
    }
}

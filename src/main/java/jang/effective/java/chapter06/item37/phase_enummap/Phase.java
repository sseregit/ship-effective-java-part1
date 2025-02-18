package jang.effective.java.chapter06.item37.phase_enummap;

import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Phase {
    SOLID, LIQUID, GAS;

    public enum Transition {
        MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID), BOIL(LIQUID, GAS), CONDENSE(GAS, LIQUID), SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID);

        private final Phase from;
        private final Phase to;

        Transition(Phase from, Phase to) {
            this.from = from;
            this.to = to;
        }

/*        private static final Map<Phase, Map<Phase, Transition>> m = new EnumMap<>(Phase.class);

        static {
            for (Transition t : Transition.values()) {
                m.computeIfAbsent(t.from, k -> new EnumMap<>(Phase.class)).put(t.to, t);
            }
        }*/
/*
        // 위 아래는 같은 코드라고 생각하면 된다.
        static {
            for (Transition t : Transition.values()) {
                Map<Phase, Transition> innerMap = m.get(t.from);
                if (innerMap == null) {
                    innerMap = new EnumMap<>(Phase.class);
                    m.put(t.from, innerMap);
                }
                innerMap.put(t.to, t);
            }
        }
*/
        // // 위 아래는 같은 코드라고 생각하면 된다.
        private static final Map<Phase, Map<Phase, Transition>> m =
                Stream.of(Transition.values())
                        .collect(
                                Collectors.groupingBy(
                                        t -> t.from,
                                        () -> new EnumMap<>(Phase.class),
                                        Collectors.toMap(t -> t.to, t -> t, (x, y) -> y, () -> new EnumMap<>(Phase.class)))
                        );

        private static Transition from(Phase from, Phase to) {
            return m.get(from).get(to);
        }

    }

    public static void main(String[] args) {
        for (Phase src : Phase.values()) {
            for (Phase dst : Phase.values()) {
                Transition transition = Transition.from(src, dst);
                if (transition != null) {
                    System.out.printf("%s에서 %s로 : %s%n", src, dst, transition);
                }
            }
        }
    }
}

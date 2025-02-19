package jang.effective.java.chapter06.item43;

import java.util.Map;
import java.util.TreeMap;

public class Freq {

    public static void main(String[] args) {
        args = new String[]{"hello", "keesun"};
        Map<String, Integer> frequencyTable = new TreeMap<>();

        for (String s : args) {
            frequencyTable.merge(s, 1, Freq::sum);
        }
        System.out.println(frequencyTable);

        frequencyTable.clear();

        for (String s : args) {
            frequencyTable.merge(s, 1, Integer::sum);
        }
        System.out.println(frequencyTable);
    }

    private static Integer sum(Integer count, Integer incr) {
        return count + incr;
    }
}

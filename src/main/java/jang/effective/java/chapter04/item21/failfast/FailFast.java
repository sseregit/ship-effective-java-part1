package jang.effective.java.chapter04.item21.failfast;

import java.util.ArrayList;
import java.util.List;

public class FailFast {

    public static void main(String[] args) {
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        /*for (Integer number : numbers) {
            if (number == 3) {
                numbers.remove(number);
            }
        }*/

        /*for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
            Integer integer = iterator.next();
            if (integer == 3) {
                iterator.remove();
            }
        }*/

        /*for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 3) {
                numbers.remove(numbers.get(i));
            }
        }*/

        numbers.removeIf(number -> number == 3);
        numbers.forEach(System.out::println);
    }
}

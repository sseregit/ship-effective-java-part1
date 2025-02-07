package jang.effective.java.chapter02.item13.treeset;

import jang.effective.java.chapter02.item13.PhoneNumber;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(14);
        numbers.add(6);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        TreeSet<PhoneNumber> phoneNumbers = new TreeSet<>(Comparator.comparingInt(PhoneNumber::hashCode));
        Set<PhoneNumber> syncPhoneNumbers = Collections.synchronizedSet(phoneNumbers);
        syncPhoneNumbers.add(new PhoneNumber(123, 456, 780));
        syncPhoneNumbers.add(new PhoneNumber(123, 456, 7890));
        syncPhoneNumbers.add(new PhoneNumber(123, 456, 789));

        for (PhoneNumber syncPhoneNumber : syncPhoneNumbers) {
            System.out.println(syncPhoneNumber);
        }
    }
}

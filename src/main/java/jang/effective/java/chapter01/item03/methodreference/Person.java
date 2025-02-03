package jang.effective.java.chapter01.item03.methodreference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {

    LocalDate birthday;

    public Person() {
    }

    public Person(LocalDate birthday) {
        this.birthday = birthday;
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(1982, 7, 15));
        dates.add(LocalDate.of(2011, 3, 2));
        dates.add(LocalDate.of(2013, 1, 28));

        List<Person> datePeople = dates.stream().map(Person::new).toList();

        List<Person> people = new ArrayList<>();
        people.add(new Person(LocalDate.of(2013, 1, 28)));
        people.add(new Person(LocalDate.of(1982, 7, 15)));
        people.add(new Person(LocalDate.of(2011, 3, 2)));

        people.sort(Person::compareByAge);
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthday.getYear();
    }
}

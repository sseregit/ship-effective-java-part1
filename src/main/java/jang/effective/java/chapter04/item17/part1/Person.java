package jang.effective.java.chapter04.item17.part1;

public final class Person {
    private final Address address;

    public Person(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        Address copyofAddress = new Address();
        copyofAddress.setCity(address.getCity());
        copyofAddress.setStreet(address.getStreet());
        copyofAddress.setZipCode(address.getZipCode());
        return copyofAddress;
//        return address;
    }

    public static void main(String[] args) {
        Address seattle = new Address();
        seattle.setCity("Seattle");
        Person person = new Person(seattle);
        Address redmond = person.getAddress();
        redmond.setCity("Redmond");

        System.out.println(person.getAddress().getCity());
    }
}

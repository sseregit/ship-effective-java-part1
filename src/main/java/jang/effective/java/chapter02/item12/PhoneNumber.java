package jang.effective.java.chapter02.item12;

import java.util.Objects;

public class PhoneNumber {

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNumber = rangeCheck(lineNumber, 9999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }
        return (short) val;
    }

    @Override
    public String toString() {
        return String.format("%03d-%03d-%04d", areaCode, prefix, lineNumber);
    }

    public static PhoneNumber of(String phoneNumberString) {
        String[] split = phoneNumberString.split("-");
        PhoneNumber phoneNumber = new PhoneNumber(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        return phoneNumber;
    }

    public short getAreaCode() {
        return areaCode;
    }

    public short getPrefix() {
        return prefix;
    }

    public short getLineNumber() {
        return lineNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return areaCode == that.areaCode && prefix == that.prefix && lineNumber == that.lineNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, prefix, lineNumber);
    }

    public static void main(String[] args) {
        PhoneNumber jenny = new PhoneNumber(707, 867, 5309);
        System.out.println("jenny = " + jenny);

        PhoneNumber phoneNumber = PhoneNumber.of("707-867-5309");
        System.out.println(phoneNumber);
        System.out.println(jenny.equals(phoneNumber));
        System.out.println(jenny.hashCode() == phoneNumber.hashCode());
    }
}

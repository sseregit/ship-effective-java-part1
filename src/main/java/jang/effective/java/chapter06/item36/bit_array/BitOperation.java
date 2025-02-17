package jang.effective.java.chapter06.item36.bit_array;

public class BitOperation {

    private final int one = 1;
    private final int two = 1 << 1;
    private final int four = 1 << 2;
    private final int eight = 1 << 3;


    public static void main(String[] args) {
        BitOperation bitOperation = new BitOperation();
        printBit(bitOperation.one);
        printBit(bitOperation.two);
        printBit(bitOperation.four);
        printBit(bitOperation.eight);

        System.out.println();

        int three = bitOperation.one | bitOperation.two;
        printBit(three);
        printBit(three & bitOperation.one);
        printBit(three & bitOperation.two);
        printBit(three & bitOperation.four);
        printBit(three & bitOperation.eight);

        printBit(three ^ bitOperation.one);

        printBit(~three);
    }

    private static void printBit(int i) {
        for (int j = 31; j >= 0; j--) {
            System.out.print((i & (1 << j)) == 0 ? 0 : 1);
        }
        System.out.println();
    }
}

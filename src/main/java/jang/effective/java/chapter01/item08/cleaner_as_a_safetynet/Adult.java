package jang.effective.java.chapter01.item08.cleaner_as_a_safetynet;

public class Adult {
    public static void main(String[] args) {
        try (Room myRoom = new Room(7)) {
            System.out.println("hello~");
        }
    }
}

package jang.effective.java.chapter04.item24.adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdapterInJava {

    public static void main(String[] args) {
        try (FileInputStream is = new FileInputStream("number.txt");
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader reader = new BufferedReader(isr)) {

            while (reader.ready()) {
                System.out.println(reader.readLine());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package jang.effective.java.chapter01.item08.autoclosable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosableIsGood implements AutoCloseable {

    private BufferedReader reader;

    public AutoClosableIsGood(String path) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(path);
        }
    }

    @Override
    public void close() throws Exception {
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

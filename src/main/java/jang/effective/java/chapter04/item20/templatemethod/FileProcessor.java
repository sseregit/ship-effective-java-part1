package jang.effective.java.chapter04.item20.templatemethod;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.BiFunction;

public class FileProcessor {

    private String path;

    public FileProcessor(String path) {
        this.path = path;
    }

//    public final int process() {
//        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
//            int result = 0;
//            String line = null;
//            while ((line = reader.readLine()) != null) {
//                result = getResult(result, Integer.parseInt(line));
//            }
//            return result;
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    // 템플릿 콜백 패턴
    public final int process(BiFunction<Integer, Integer, Integer> operator) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = 0;
            String line = null;
            while ((line = reader.readLine()) != null) {
                result = operator.apply(result, Integer.parseInt(line));
            }
            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    protected abstract int getResult(int result, int number);

}

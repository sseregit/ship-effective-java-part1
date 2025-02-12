package jang.effective.java.chapter04.item20.templatemethod;

public class Client {

    public static void main(String[] args) {
//        Plus fileProcessor = new Plus("number.txt");
//        System.out.println(fileProcessor.process());

        // 콜백 패턴
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        System.out.println(fileProcessor.process(Integer::sum));
    }
}

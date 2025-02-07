package jang.effective.java.chapter02.item13.exception;

public class MyApp {

    public void hello(String name) throws MyException {
        if (name.equals("푸틴")) {
            throw new MyException();
        }
        System.out.println("MyApp.hello");
        throw new MyException();
    }

    public static void main(String[] args) throws MyException {
        MyApp myApp = new MyApp();
        try {
            myApp.hello("푸틴");
        } catch (MyException e) {
            myApp.hello("기선");
        }
    }
}

package jang.effective.java.chapter04.item24.memberclass;

public class OutterClass {

    private int number = 10;

    void printNumber() {
        // 인스턴스 메서드가 실행된다는건 이미 인스턴스가 생성되어 있다는 뜻
        InnerClass innerClass = new InnerClass();
    }

    private class InnerClass {
        void doSomething() {
            System.out.println(number);
            OutterClass.this.printNumber();
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new OutterClass().new InnerClass();
        innerClass.doSomething();
    }
}

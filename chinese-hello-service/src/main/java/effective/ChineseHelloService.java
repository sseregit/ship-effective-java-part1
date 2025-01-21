package effective;

import jang.effective.java.chapter01.item01.HelloService;

public class ChineseHelloService implements HelloService {


    @Override
    public String hello() {
        return "Ni hao";
    }
}
package effective.hello;

import effective.NameService;

public class HelloService {

    public static void main(String[] args) {
        NameService nameService = new NameService();
        System.out.println("Hello " + nameService.getName() + ", Java Module");
    }
}

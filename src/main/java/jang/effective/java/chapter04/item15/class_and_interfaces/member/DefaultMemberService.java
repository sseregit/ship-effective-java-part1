package jang.effective.java.chapter04.item15.class_and_interfaces.member;

import java.util.Arrays;

class DefaultMemberService implements MemberService {

    private static class PrivateStaticClass {

    }

    private class PrivateClass {

    }

    public static void main(String[] args) {
        Arrays.stream(PrivateClass.class.getDeclaredFields()).forEach(System.out::println);
    }
}

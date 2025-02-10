package jang.effective.java.chapter04.item15.class_and_interfaces.item;

import jang.effective.java.chapter04.item15.class_and_interfaces.member.MemberService;

import java.util.Objects;

public class ItemService {

    private MemberService memberService;

    boolean onSale;

    protected int saleRate;

    public static final String[] NAMES = new String[10];

    public ItemService(MemberService memberService) {
        if (Objects.isNull(memberService)) {
            throw new IllegalArgumentException("MemberService should not be null");
        }
        this.memberService = memberService;
    }

    MemberService getMemberService() {
        return memberService;
    }
}

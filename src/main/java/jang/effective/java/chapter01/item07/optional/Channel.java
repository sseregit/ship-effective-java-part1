package jang.effective.java.chapter01.item07.optional;

import java.util.Optional;

public class Channel {

    private int numOfSubscribers;

    public Optional<MemberShip> defaultMemberShip() {
        if (this.numOfSubscribers < 20) {
            return Optional.empty();
        } else {
            return Optional.of(new MemberShip());
        }
    }
}

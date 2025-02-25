package jang.effective.java.chapter08.item50;

import java.util.Date;

public final class Period {
    private final Date start;
    private final Date end;

    /**
     * @param start 시작 시각
     * @param end   종료 시각. 시작 시각보다 뒤여야 한다.
     * @throws IllegalArgumentException 시작 시각이 종료 시각보다 늦을 때 발생한다.
     * @throws NullPointerException     start나 end가 null이면 발생한다.
     */
    public Period(Date start, Date end) {
        if (start.after(end)) {
            throw new IllegalArgumentException(start + "가 " + end + "보다 늦다.");
        }
        this.start = start;
        this.end = end;
    }

    public Date start() {
        return start;
    }

    public Date end() {
        return end;
    }

    /*public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        if (start.after(end)) {
            throw new IllegalArgumentException(start + "가 " + end + "보다 늦다.");
        }
    }

    public Date start() {
        return new Date(start.getTime());
    }

    public Date end() {
        return new Date(end.getTime());
    }*/

    @Override
    public String toString() {
        return start + " - " + end;
    }
}

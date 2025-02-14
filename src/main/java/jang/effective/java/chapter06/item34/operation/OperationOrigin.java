package jang.effective.java.chapter06.item34.operation;

import java.util.HashMap;
import java.util.Map;

public enum OperationOrigin {

    PLUS, MINUS, TIMES, DIVIDE, NEW_OPERATION;

    private static final Map<String, OperationOrigin> stringToEnum = new HashMap<>();

    OperationOrigin() {
//        stringToEnum.put(toString(), this);
    }

    public double apply(double x, double y) {
        switch (this) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
        }

        throw new IllegalArgumentException("not supported operation");
    }
}

package jang.effective.java.chapter06.item34.operation;

public enum OperationOrigin {

    PLUS, MINUS, TIMES, DIVIDE, NEW_OPERATION;

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

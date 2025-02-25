package jang.effective.java.chapter08.item51;

public class EnumExample {

    public enum Status {
        SUCCESS,
        FAILURE;
    }

    public static void main(String[] args) {
        Status status = performOperation(Status.SUCCESS);
        System.out.println("Operation status: " + status);

        status = performOperation(Status.FAILURE);
        System.out.println("Operation status: " + status);

    }

    private static Status performOperation(Status status) {
        return switch (status) {
            case SUCCESS -> Status.SUCCESS;
            case FAILURE -> Status.FAILURE;
        };
    }

/*
    private static Status performOperation(boolean isSuccess) {
        if (isSuccess) {
            return Status.SUCCESS;
        } else {
            return Status.FAILURE;
        }
    }
*/
}

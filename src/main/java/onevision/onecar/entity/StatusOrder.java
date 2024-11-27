package onevision.onecar.entity;

public enum StatusOrder {

    ACCEPTED(1),
    PREPARING(2),
    READY(3),
    REJECTED(4);

    private final int number;

    StatusOrder(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static StatusOrder fromNumber(int number) {
        for (StatusOrder status : values()) {
            if (status.number == number) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid number for StatusOrder: " + number);
    }
}

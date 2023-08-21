package xRep.classwork.examples.comparables;

public enum AccountStatus {

    SIMPLE(1, "Простой"),
    VIP(2, "Вип клиент"),
    PLATINUM(3, "Платиновый гелик");

    private int value;
    private String translate;

    AccountStatus(int value, String translate) {
        this.value = value;
        this.translate = translate;
    }

    public int getValue() {
        return value;
    }
}

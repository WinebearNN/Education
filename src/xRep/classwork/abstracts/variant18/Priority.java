package xRep.classwork.abstracts.variant18;

public enum Priority {

    HIGH(0.35, "Высокий"),
    MEDIUM(0.15, "Средний"),
    LOW(0, "Обычный");

    private double cashback;
    private String priorityTranslate;

    Priority(double cashback, String priorityTranslate) {
        this.cashback = cashback;
        this.priorityTranslate = priorityTranslate;
    }

    public double getCashback() {
        return cashback;
    }

    public void setCashback(double cashback) {
        this.cashback = cashback;
    }

    public String getPriorityTranslate() {
        return priorityTranslate;
    }

    public void setPriorityTranslate(String priorityTranslate) {
        this.priorityTranslate = priorityTranslate;
    }
}

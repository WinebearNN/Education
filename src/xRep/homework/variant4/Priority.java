package xRep.homework.variant4;

public enum Priority {

    HIGH("Высокий"),

    MEDIUM("Средний"),

    LOW("Низкий");

    private String priorityTranslate;

    Priority( String priorityTranslate) {
        this.priorityTranslate = priorityTranslate;
    }

    public String getPriorityTranslate() {
        return priorityTranslate;
    }

    public void setPriorityTranslate(String priorityTranslate) {
        this.priorityTranslate = priorityTranslate;
    }
}

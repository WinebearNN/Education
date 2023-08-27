package xRep.homework.variant4;

public enum Priority {

    HIGH("Высокий"),

    MEDIUM("Средний"),

    LOW("Обычный"),

    NONE("not_a_monarch");

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

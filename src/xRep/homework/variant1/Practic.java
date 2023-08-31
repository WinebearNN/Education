package xRep.homework.variant1;

public enum Practic {

    TRAINEE("YEAH"),

    NOT_TRAINEE("NOPE");

    private String status;

    Practic(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

package shop;

public enum Size {
    LARGE("L"), MEDIUM("M"), SMALL("S");

    private String value;

    private Size(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}

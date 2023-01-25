package lab3.actors;

public enum BodyPartsStatus {
    WIDE("вытаращенными"),
    AXING("встопорщенными"),
    NORMAL("");

    private  String status;
    BodyPartsStatus(String status) {
        this.status = status;
    }
    public String getBodyStatus() {
        return status;
    }
}

package opp1;

public class NationLaptop {

    private String nationId;
    private String nationNane;

    public NationLaptop(String nationId, String nationNane) {
        this.nationId = nationId;
        this.nationNane = nationNane;
    }

    public String getNationId() {
        return nationId;
    }

    public void setNationId(String nationId) {
        this.nationId = nationId;
    }

    public String getNationNane() {
        return nationNane;
    }

    public void setNationNane(String nationNane) {
        this.nationNane = nationNane;
    }
}

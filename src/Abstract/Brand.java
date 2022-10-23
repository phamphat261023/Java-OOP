package Abstract;

public class Brand {

    private String nameBrand;
    private String nationName;

    public Brand(String nameBrand, String nationName) {
        this.nameBrand = nameBrand;
        this.nationName = nationName;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }
}

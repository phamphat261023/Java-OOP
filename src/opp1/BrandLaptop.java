package opp1;

public class BrandLaptop {

    private String nameBrand;
    private NationLaptop nation;

    public BrandLaptop(String nameBrand, NationLaptop nation) {
        this.nameBrand = nameBrand;
        this.nation = nation;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    public NationLaptop getNation() {
        return nation;
    }

    public void setNation(NationLaptop nation) {
        this.nation = nation;
    }

    public String getNameNation() {
        return this.nation.getNationNane();
    }
}

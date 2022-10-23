package Abstract;

public class HinhCN extends Hinh{
    private double cd, cr;

    public HinhCN(ToaDo toaDo, double cd, double cr) {
        super(toaDo);
        this.cd = cd;
        this.cr = cr;
    }

    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }

    @Override
    public double tinhDT() {
        return this.cd*this.cr;
    }
}

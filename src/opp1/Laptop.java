package opp1;

public class Laptop {

    private BrandLaptop brand;
    private DateLaptop date;
    private double sell;
    private int timeSave;

    public Laptop(BrandLaptop brand, DateLaptop date, double sell, int timeSave) {
        this.brand = brand;
        this.date = date;
        this.sell = sell;
        this.timeSave = timeSave;
    }

    public BrandLaptop getBrand() {
        return brand;
    }

    public void setBrand(BrandLaptop brand) {
        this.brand = brand;
    }

    public DateLaptop getDate() {
        return date;
    }

    public void setDate(DateLaptop date) {
        this.date = date;
    }

    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

    public int getTimeSave() {
        return timeSave;
    }

    public void setTimeSave(int timeSave) {
        this.timeSave = timeSave;
    }

    public boolean testLaptop (Laptop otherLap){
        return (this.sell < otherLap.sell) ? true : false;
    }

    public String getNameNation (){
        return this.brand.getNameNation();
    }
}
